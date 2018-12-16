package com.bid.springcloud.service.impl;

import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.*;
import com.bid.springcloud.enums.OrderProcessEnum;
import com.bid.springcloud.enums.ResultEnum;
import com.bid.springcloud.exception.SellException;
import com.bid.springcloud.mapper.*;
import com.bid.springcloud.service.CoOrderDmandServiceClient;
import com.bid.springcloud.service.CoOrderMainServiceClient;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;


@RestController
@Slf4j
public class CoOrderMainClientServiceImpl extends BaseApiService implements CoOrderMainServiceClient  {

    @Resource
    private  CoOrderMainMapper coOrderMainMapper;

    @Resource
    private CoOrderProcessMapper coOrderProcessMapper;

    @Resource
    private CoOrderDmandMapper coOrderDmandMapper;

    @Resource
    private CpBidOrderMapper cpBidOrderMapper;






    public ResponseBase demo( Map<String , Object> map) {

        List<OrderDTD> dtd = coOrderMainMapper.demo(map);

        if (dtd!=null){
            return  setResultSuccess(dtd);
        }
        return  setResultError("查询失败");
    }




    @Override
    @Transactional
    public int addcoOrderMainr(@RequestBody CoOrderMain coOrderMain) {
        int processId= RandomUtils.nextInt(1, 1000);
        coOrderMain.setOrderProcess(OrderProcessEnum.THENFILL.getMessage());
        coOrderMain.setOrderProcess(OrderProcessEnum.THENFILL.getCode());
        CoOrderProcess coOrderProcess = new CoOrderProcess();
        coOrderProcess.setOrderMainId(String.valueOf(coOrderMain.getOrderMainId()));
        coOrderProcess.setProcessName(OrderProcessEnum.THENFILL.getMessage());
        coOrderProcess.setProcessId(String.valueOf(processId));
        //添加申购单状态
        int insert = coOrderProcessMapper.insertSelective(coOrderProcess);
        //添加申购单
        int i = coOrderMainMapper.insertSelective(coOrderMain);

        if (i>0 || insert>0){
            return  i;
        }
        throw  new SellException(ResultEnum.INSERT);
    }

    @Override
    public ResponseBase getOrderManList(String collegeId, Integer page) {
        PageHelper.startPage(page, 8);

        List<OrderDTD> dtd = coOrderDmandMapper.selectByCollgeId(collegeId);
        PageInfo<OrderDTD> pageInfo = new PageInfo<>(dtd);
        if (pageInfo != null){
            return  setResultSuccess(pageInfo);
        }
        log.info("查询失败");
       throw new SellException(ResultEnum.SELECT);
    }

    @Override
    public ResponseBase deleteorderByOrderMainId(@RequestParam("orderMainId") Integer orderMainId) {
        CoOrderMainExample coOrderMainExample = new CoOrderMainExample();
        coOrderMainExample.createCriteria().andOrderMainIdEqualTo(orderMainId);
        CoOrderMain coOrderMain = new CoOrderMain();
        coOrderMain.setOrderStatus("2");
        int i = coOrderMainMapper.updateByExampleSelective(coOrderMain,coOrderMainExample);
        if (i>0){
            return  setResultSuccess("删除成功");
        }
       return  setResultError("删除失败");
    }

    @Override
    public ResponseBase selectOrderMainByOrderMainId(@RequestParam("orderMainId") Integer orderMainId) {
        List<OrderDTD> orderDTDS = coOrderMainMapper.selectOrderMainByOrderMainId(orderMainId);
        if (orderDTDS !=null){
            return  setResultSuccess(orderDTDS);
        }
        return setResultError("查询失败");
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResponseBase editOrderByorderMainId(@RequestBody OrderDTD orderDTD) {

        //修改订单主表
        CoOrderMain coOrderMain = new CoOrderMain();
        coOrderMain.setInstallationgSite(orderDTD.getInstallationgSite());
        coOrderMain.setEndBidtime(orderDTD.getEndBidtime());
        coOrderMain.setOrderCode(orderDTD.getOrderCode());
        CoOrderMainExample coOrderMainExample = new CoOrderMainExample();
        coOrderMainExample.createCriteria().andOrderMainIdEqualTo(Integer.parseInt(orderDTD.getOrderMainId()));
        int i = coOrderMainMapper.updateByExampleSelective(coOrderMain, coOrderMainExample);
        //修改申购单明细
        CoOrderDmand coOrderDmand = new CoOrderDmand();

        coOrderDmand.setUnit(orderDTD.getUnit());
        coOrderDmand.setOrderCode(orderDTD.getOrderCode());

        CoOrderDmandExample coOrderDmandExample = new CoOrderDmandExample();
        coOrderDmandExample.createCriteria().andOrderMainIdEqualTo(orderDTD.getOrderMainId());
        int i1 = coOrderDmandMapper.updateByExampleSelective(coOrderDmand, coOrderDmandExample);

        if(i1>0||i>0){
            return  setResultSuccess("更新成功");
        }
       throw  new SellException(ResultEnum.UPDATE);
    }

    @Override
    public ResponseBase getOrderByorderState(@RequestBody OrderDTD orderDTD, @RequestParam("page") Integer page) {
        PageHelper.startPage(page, 5);
        List<OrderDTD> dtd = coOrderMainMapper.selectByCollgeIdAndProcess(orderDTD);
        PageInfo<OrderDTD> pageInfo = new PageInfo<>(dtd);
        if (pageInfo!=null){
            return  setResultSuccess(pageInfo);
        }
        return  setResultError("查询失败");
    }


    /**
     * 订单状态修改
     * @param orderDTD
     * @return
     */
    @Override
    public ResponseBase orderStateEdit(@RequestBody OrderDTD orderDTD) {
        orderDTD.setReadCount(OrderProcessEnum.THENFILL.getMessage()+","+OrderProcessEnum.RELEASEING.getMessage()+
               ","+ OrderProcessEnum.APPROVAL.getMessage()+","+OrderProcessEnum.BIDDING.getMessage() );
        orderDTD.setProcessName(OrderProcessEnum.BIDDING.getMessage());
        ResponseBase base = updateOrderMainUtils(orderDTD);

        return base;
    }

    @Override
    public ResponseBase queryTobePrimedList(@RequestBody  OrderDTD orderDTD, @RequestParam("page") Integer page) {
        PageHelper.startPage(page,5);
        List<OrderDTD> tobePrimedOrder = coOrderMainMapper.getTobePrimedOrder(orderDTD);
        PageInfo<OrderDTD> pageInfo = new PageInfo<>(tobePrimedOrder);
        if(pageInfo!=null){
            return  setResultSuccess(pageInfo);
        }
        return setResultError("没查询到待初选订单");
    }

    @Override
    @Transactional
    public ResponseBase addOrderPrimary(@RequestBody CoOrderDmand coOrderDmand) {
        //生成初选订单

        CoOrderDmandExample coOrderDmandExample = new CoOrderDmandExample();
        coOrderDmandExample.createCriteria().andOrderMainIdEqualTo(coOrderDmand.getOrderMainId());
        int i1 = coOrderDmandMapper.updateByExampleSelective(coOrderDmand, coOrderDmandExample);
        //修改订单主表状态
            //订单主表
        CoOrderMainExample coOrderMainExampl = new CoOrderMainExample();
        CoOrderMain coOrderMain  = new CoOrderMain();

        coOrderMain.setOrderProcess(OrderProcessEnum.PRIMARY.getCode());
        coOrderMain.setReadCount(
                OrderProcessEnum.THENFILL.getMessage()+","+OrderProcessEnum.RELEASEING.getMessage()+","+OrderProcessEnum.APPROVAL.getMessage()+","
                +OrderProcessEnum.BIDDING.getMessage()+","+OrderProcessEnum.SUPPLIERQUOTATION.getMessage()+","+
                        OrderProcessEnum.AFTERENDING.getMessage()+","+OrderProcessEnum.PRIMARY.getMessage()

        );
        coOrderMainExampl.createCriteria().andOrderMainIdEqualTo(Integer.parseInt(coOrderDmand.getOrderMainId()));

        int i = coOrderMainMapper.updateByExampleSelective(coOrderMain, coOrderMainExampl);
            //订单流程参数表
        CoOrderProcessExample coOrderProcessExample = new CoOrderProcessExample();
        CoOrderProcess coOrderProcess = new CoOrderProcess();
        coOrderProcess.setProcessName(OrderProcessEnum.PRIMARY.getMessage());
        coOrderProcessExample.createCriteria().andOrderMainIdEqualTo(coOrderDmand.getOrderMainId());
        int i2 = coOrderProcessMapper.updateByExampleSelective(coOrderProcess, coOrderProcessExample);
        //修改企业端未已中标
        CpBidOrderExample cpBidOrderExample = new CpBidOrderExample();
        cpBidOrderExample.createCriteria().andOrderMainIdEqualTo(coOrderDmand.getOrderMainId());
        CpBidOrder cpBidOrder = new CpBidOrder();
        cpBidOrder.setBidStatus("1");
        int i3 = cpBidOrderMapper.updateByExampleSelective(cpBidOrder, cpBidOrderExample);
        if(i2>0||i1>0||i3>0||i>0){
            return  setResultSuccess("更新成功");
        }
        throw  new SellException(ResultEnum.UPDATE);
    }

    @Override
    @Transactional
    public ResponseBase editReleaseOrder(Integer orderMainId) {

       OrderDTD orderDTD = new OrderDTD();
        orderDTD.setOrderMainId(String.valueOf(orderMainId));
        orderDTD.setReadCount(
                OrderProcessEnum.THENFILL.getMessage()+","+OrderProcessEnum.RELEASEING.getMessage()+","+OrderProcessEnum.APPROVAL.getMessage()+","
                        +OrderProcessEnum.BIDDING.getMessage()+","+OrderProcessEnum.SUPPLIERQUOTATION.getMessage()+","+
                        OrderProcessEnum.AFTERENDING.getMessage()+","+OrderProcessEnum.PRIMARY.getMessage()+","+OrderProcessEnum.APROVAL.getMessage()
                            +","+OrderProcessEnum.RELEASEBIDDINGRESULTS.getMessage()
        );

        orderDTD.setProcessName(OrderProcessEnum.RELEASEBIDDINGRESULTS.getMessage());
        orderDTD.setOrderProcess(OrderProcessEnum.RELEASEBIDDINGRESULTS.getCode());
        //修改主表状态
        //修改明细表的的流程名字
        ResponseBase base = updateOrderMainUtils(orderDTD);

        //修改供应商订单为已经中标

        CpBidOrderExample cpBidOrderExample = new CpBidOrderExample();
        cpBidOrderExample.createCriteria().andOrderMainIdEqualTo(String.valueOf(orderMainId));
        CpBidOrder cpBidOrder = new CpBidOrder();
        cpBidOrder.setIsFulfil("Y");
        int i = cpBidOrderMapper.updateByExampleSelective(cpBidOrder, cpBidOrderExample);
        if(i>0||base!=null){
            return base;
        }
            throw  new  SellException(ResultEnum.UPDATE);

    }


    @Transactional
    public ResponseBase updateOrderMainUtils(OrderDTD orderDTD) {
        //订单主表
        CoOrderMainExample coOrderMainExampl = new CoOrderMainExample();
        CoOrderMain coOrderMain  = new CoOrderMain();

        //订单流程参数表
        CoOrderProcessExample coOrderProcessExample = new CoOrderProcessExample();
        CoOrderProcess coOrderProcess = new CoOrderProcess();


        Integer orderMainId=null;
        if(orderDTD.getReadCount()!=null){
            String readCount = orderDTD.getReadCount();
            coOrderMain.setReadCount(readCount);
        }
        if (orderDTD.getOrderMainId()!=null){
            orderMainId = Integer.parseInt(orderDTD.getOrderMainId());
            coOrderMainExampl.createCriteria().andOrderMainIdEqualTo(orderMainId);
            coOrderProcessExample.createCriteria().andOrderMainIdEqualTo(String.valueOf(orderMainId));
        }

        if (orderDTD.getOrderProcess() !=null){
            String orderProcess = orderDTD.getOrderProcess();
            coOrderMain.setOrderProcess(orderProcess);
        }

        if (orderDTD.getReadCount()!=null){
            String readCount = orderDTD.getReadCount();
            coOrderMain.setReadCount(readCount);
        }
        if (orderDTD.getProcessName()!=null){
            String processName = orderDTD.getProcessName();
            coOrderProcess.setProcessName(processName);

        }

        if (orderDTD.getUserId()!=null){
            Integer userId = orderDTD.getUserId();
            coOrderProcess.setProcessId(String.valueOf(userId));
        }

        int i = coOrderMainMapper.updateByExampleSelective(coOrderMain, coOrderMainExampl);
        int i1 = coOrderProcessMapper.updateByExampleSelective(coOrderProcess, coOrderProcessExample);


        if (i >0 || i1>0 ){
            return  setResultSuccess("修改成功");
        }
        throw  new  SellException(ResultEnum.UPDATE);
    }




    //到达截止时间后,改变申购单状态
/*
    @Scheduled(cron = "0/20 * * * * *")
    public void hello(){
        long localTime = System.currentTimeMillis();
        CoOrderMainExample coOrderMainExample = new CoOrderMainExample();
        List<CoOrderMain> coOrderMains = coOrderMainMapper.selectByExample(coOrderMainExample);
        for (CoOrderMain coOrderMain : coOrderMains) {
            Date endBidtime = coOrderMain.getEndBidtime();
            long endtime = endBidtime.getTime();
            if (endtime>localTime){
                OrderDTD orderDTD = new OrderDTD();
                orderDTD.setOrderMainId(String.valueOf(coOrderMain.getOrderMainId()));
                orderDTD.setReadCount(OrderProcessEnum.THENFILL.getMessage()+","+OrderProcessEnum.RELEASEING.getMessage()+
                        ","+ OrderProcessEnum.APPROVAL.getMessage()+","+OrderProcessEnum.BIDDING.getMessage()+","+OrderProcessEnum.SUPPLIERQUOTATION.getMessage()+","+
                        OrderProcessEnum.AFTERENDING.getMessage()
                );
                orderDTD.setProcessName(OrderProcessEnum.AFTERENDING.getMessage());
                orderDTD.setOrderProcess(OrderProcessEnum.AFTERENDING.getMessage());
                ResponseBase base = updateOrderMainUtils(orderDTD);


            }
        }
    }*/


    @Override
    public ResponseBase queryPrimedListDesc(@RequestParam("orderMainId") Integer orderMainId) {
        OrderDTD orderDTD = cpBidOrderMapper.selectprimaryDescByOrderMainId(orderMainId);
        if (orderDTD!=null){
            return  setResultSuccess(orderDTD);
        }
        return setResultError("查询失败");
    }

}

