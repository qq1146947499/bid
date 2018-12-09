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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;


@RestController
@Slf4j
public class CoOrderMainClientServiceImpl extends BaseApiService implements CoOrderMainServiceClient  {

    @Resource
    private  CoOrderMainMapper coOrderMainMapper;

    @Resource
    private CoOrderProcessMapper coOrderProcessMapper;

    @Resource
    private CoOrderDmandMapper coOrderDmandMapper;



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
        PageHelper.startPage(page, 4);

        List<OrderDTD> dtd = coOrderDmandMapper.selectByCollgeId(collegeId);
        PageInfo<OrderDTD> pageInfo = new PageInfo<>(dtd,4);
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

}

