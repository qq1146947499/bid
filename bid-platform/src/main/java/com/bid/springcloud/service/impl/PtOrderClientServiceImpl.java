package com.bid.springcloud.service.impl;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.CoOrderMain;
import com.bid.springcloud.entities.CoOrderMainExample;
import com.bid.springcloud.entities.CoOrderProcess;
import com.bid.springcloud.entities.CoOrderProcessExample;
import com.bid.springcloud.enums.ResultEnum;
import com.bid.springcloud.exception.SellException;
import com.bid.springcloud.mapper.CoOrderDmandMapper;
import com.bid.springcloud.mapper.CoOrderMainMapper;
import com.bid.springcloud.mapper.CoOrderProcessMapper;
import com.bid.springcloud.service.PtOrderClientService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class PtOrderClientServiceImpl extends BaseApiService implements PtOrderClientService{


    @Resource
    private CoOrderMainMapper coOrderMainMapper;

    @Resource
    private CoOrderProcessMapper coOrderProcessMapper;




    @Override
    public ResponseBase selectOrderMainByOrderMainId(@RequestParam("orderMainId") Integer orderMainId) {
        CoOrderMainExample coOrderMainExampl = new CoOrderMainExample();
        coOrderMainExampl.createCriteria().andOrderMainIdEqualTo(orderMainId);
        CoOrderMain coOrderMain  = new CoOrderMain();
        coOrderMain.setOrderProcess("2");
        coOrderMain.setReadCount("填单,审核中");
        coOrderMainMapper.updateByExampleSelective(coOrderMain,coOrderMainExampl);
        CoOrderProcess coOrderProcess = new CoOrderProcess();
        coOrderProcess.setProcessName("发布审核中");
        CoOrderProcessExample coOrderProcessExample = new CoOrderProcessExample();
        coOrderProcessExample.createCriteria().andOrderMainIdEqualTo(String.valueOf(orderMainId));
        coOrderProcessMapper.updateByExampleSelective(coOrderProcess,coOrderProcessExample);

        List<OrderDTD> orderDTDS = coOrderMainMapper.selectOrderMainByOrderMainId(orderMainId);
        if (orderDTDS !=null){
            return  setResultSuccess(orderDTDS);
        }
        return setResultError("查询失败");
    }

    @Override
    public ResponseBase queryOrderListByProcessId(@RequestParam("orderProcess") Integer orderProcess,@RequestParam(value = "page",required = false,defaultValue ="1") Integer page) {
        PageHelper.startPage(page,4);
        List<OrderDTD> orderDTDS = coOrderMainMapper.selectOrderListByProcessId(orderProcess);
        PageInfo<OrderDTD> pageInfo = new PageInfo(orderDTDS);
        if (orderDTDS!=null){
        return  setResultSuccess(pageInfo);
        }
        throw  new SellException(ResultEnum.SELECT);
    }



    @Override
    public ResponseBase releaseOrderByOrderMainId(@RequestBody OrderDTD orderDTD) {
        orderDTD.setReadCount("填单,审核中,发布审核");
        orderDTD.setProcessName("发布审核通过");
        ResponseBase base = selectOrderMainByOrderMainIdUtils(orderDTD);
        return base;
    }

    @Override
    public ResponseBase releasePassOrderByOrderMainId(OrderDTD orderDTD) {
        orderDTD.setReadCount("填单,审核中");
        orderDTD.setProcessName("发布审核未通过");

        ResponseBase base = selectOrderMainByOrderMainIdUtils(orderDTD);
        return base;
    }


    /**
     * 审核工具类
     * @param orderDTD
     * @return
     */
    public ResponseBase selectOrderMainByOrderMainIdUtils(OrderDTD orderDTD) {
        CoOrderMainExample coOrderMainExampl = new CoOrderMainExample();
        CoOrderMain coOrderMain  = new CoOrderMain();

        CoOrderProcessExample coOrderProcessExample = new CoOrderProcessExample();
        CoOrderProcess coOrderProcess = new CoOrderProcess();


        Integer orderMainId=null;
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
        return setResultError("修改成功");
    }
}
