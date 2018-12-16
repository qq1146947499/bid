package com.bid.springcloud.service.impl;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.*;
import com.bid.springcloud.enums.OrderProcessEnum;
import com.bid.springcloud.enums.ResultEnum;
import com.bid.springcloud.exception.SellException;
import com.bid.springcloud.mapper.CoOrderDmandMapper;
import com.bid.springcloud.mapper.CoOrderMainMapper;
import com.bid.springcloud.mapper.CoOrderProcessMapper;
import com.bid.springcloud.mapper.CpBidOrderMapper;
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
public class PtOrderClientServiceImpl extends BaseApiService implements PtOrderClientService {


    @Resource
    private CoOrderMainMapper coOrderMainMapper;

    @Resource
    private CoOrderProcessMapper coOrderProcessMapper;


    @Resource
    CpBidOrderMapper cpBidOrderMapper;

    @Override
    public ResponseBase selectOrderMainByOrderMainId(@RequestParam("orderMainId") Integer orderMainId) {
        CoOrderMainExample coOrderMainExampl = new CoOrderMainExample();
        coOrderMainExampl.createCriteria().andOrderMainIdEqualTo(orderMainId);
        CoOrderMain coOrderMain = new CoOrderMain();
        coOrderMain.setOrderProcess("2");
        coOrderMain.setReadCount("填单,审核中");
        coOrderMainMapper.updateByExampleSelective(coOrderMain, coOrderMainExampl);
        CoOrderProcess coOrderProcess = new CoOrderProcess();
        coOrderProcess.setProcessName("发布审核中");
        CoOrderProcessExample coOrderProcessExample = new CoOrderProcessExample();
        coOrderProcessExample.createCriteria().andOrderMainIdEqualTo(String.valueOf(orderMainId));
        coOrderProcessMapper.updateByExampleSelective(coOrderProcess, coOrderProcessExample);

        List<OrderDTD> orderDTDS = coOrderMainMapper.selectOrderMainByOrderMainId(orderMainId);
        if (orderDTDS != null) {
            return setResultSuccess(orderDTDS);
        }
        return setResultError("查询失败");
    }

    @Override
    public ResponseBase queryOrderListByProcessId(@RequestParam("orderProcess") Integer orderProcess, @RequestParam(value = "page", required = false, defaultValue = "1") Integer page) {
        PageHelper.startPage(page, 4);
        List<OrderDTD> orderDTDS = coOrderMainMapper.selectOrderListByProcessId(orderProcess);
        PageInfo<OrderDTD> pageInfo = new PageInfo(orderDTDS);
        if (orderDTDS != null) {
            return setResultSuccess(pageInfo);
        }
        throw new SellException(ResultEnum.SELECT);
    }


    @Override
    public ResponseBase releaseOrderByOrderMainId(@RequestBody OrderDTD orderDTD) {
        orderDTD.setReadCount("填单,审核中,发布审核");
        orderDTD.setProcessName("发布审核通过");
        ResponseBase base = selectOrderMainByOrderMainIdUtils(orderDTD);
        return base;
    }

    @Override
    public ResponseBase releasePassOrderByOrderMainId(@RequestBody OrderDTD orderDTD) {
        orderDTD.setReadCount("填单,审核中");
        orderDTD.setProcessName("发布审核未通过");

        ResponseBase base = selectOrderMainByOrderMainIdUtils(orderDTD);
        return base;
    }

    @Override
    public ResponseBase queryToPrimaryCpOrderByOrderMainId(@RequestParam("orderMainId") Integer orderMainId) {

        OrderDTD orderDTD = cpBidOrderMapper.selectprimaryDescByOrderMainId(orderMainId);

        if (orderDTD != null) {
            return setResultSuccess(orderDTD);
        }
        return setResultSuccess("查询失败");
    }

    @Override
    public ResponseBase queryToPrimaryCoOrderByOrderMainId(@RequestParam("orderMainId") Integer orderMainId) {
        OrderDTD orderDTD = new OrderDTD();
        orderDTD.setOrderMainId(String.valueOf(orderMainId));
        List<OrderDTD> tobePrimedOrder = coOrderMainMapper.getTobePrimedOrder(orderDTD);
        if (tobePrimedOrder != null) {
            return setResultSuccess(tobePrimedOrder);
        }
        return setResultError("查询失败");
    }

    @Override
    public ResponseBase editPrimaryTEOrder(@RequestBody OrderDTD orderDTD) {
        orderDTD.setReadCount(
                OrderProcessEnum.THENFILL.getMessage() + "," + OrderProcessEnum.RELEASEING.getMessage() + "," + OrderProcessEnum.APPROVAL.getMessage() + ","
                        + OrderProcessEnum.BIDDING.getMessage() + "," + OrderProcessEnum.SUPPLIERQUOTATION.getMessage() + "," +
                        OrderProcessEnum.AFTERENDING.getMessage() + "," + OrderProcessEnum.PRIMARY.getMessage() + "," +
                        OrderProcessEnum.APROVAL.getMessage()

        );
        orderDTD.setProcessName("采购初选审批");
        ResponseBase base = selectOrderMainByOrderMainIdUtils(orderDTD);
        return base;
    }


    /**
     * 审核工具类
     *
     * @param orderDTD
     * @return
     */
    public ResponseBase selectOrderMainByOrderMainIdUtils(OrderDTD orderDTD) {
        //申购单主表修改
        CoOrderMainExample coOrderMainExampl = new CoOrderMainExample();
        CoOrderMain coOrderMain = new CoOrderMain();


        //申购单流程单修改
        CoOrderProcessExample coOrderProcessExample = new CoOrderProcessExample();
        CoOrderProcess coOrderProcess = new CoOrderProcess();


        Integer orderMainId = null;
            if (orderDTD.getOrderMainId() != null) {
            orderMainId = Integer.parseInt(orderDTD.getOrderMainId());
            coOrderMainExampl.createCriteria().andOrderMainIdEqualTo(orderMainId);
            coOrderProcessExample.createCriteria().andOrderMainIdEqualTo(String.valueOf(orderMainId));
        }

        if (orderDTD.getOrderProcess() != null) {
            String orderProcess = orderDTD.getOrderProcess();
            coOrderMain.setOrderProcess(orderProcess);
        }



        if (orderDTD.getSecondAuditReason() != null) {

            String secondAuditReason = orderDTD.getSecondAuditReason();
            coOrderMain.setSecondAuditReason(secondAuditReason);

        }
        if (orderDTD.getSecondTime() != null) {
            String secondTime = orderDTD.getSecondTime();
            coOrderMain.setSecondTime(secondTime);
        }


        if (orderDTD.getSecondAuditUserId() != null) {
            String secondAuditUserId = orderDTD.getSecondAuditUserId();
            coOrderMain.setSecondAuditUserId(secondAuditUserId);
        }


        if (orderDTD.getSecondAuditUserName() != null) {
            String secondAuditUserName = orderDTD.getSecondAuditUserName();
            coOrderMain.setSecondAuditUserName(secondAuditUserName);
        }
        if (orderDTD.getReadCount() != null) {
            String readCount = orderDTD.getReadCount();
            coOrderMain.setReadCount(readCount);
        }
        if (orderDTD.getProcessName() != null) {
            String processName = orderDTD.getProcessName();
            coOrderProcess.setProcessName(processName);

        }

    /*    if (orderDTD.getUserId() != null) {
            Integer userId = orderDTD.getUserId();
            coOrderProcess.setProcessId(String.valueOf(userId));
        }*/


        int i = coOrderMainMapper.updateByExampleSelective(coOrderMain, coOrderMainExampl);
        int i1 = coOrderProcessMapper.updateByExampleSelective(coOrderProcess, coOrderProcessExample);


        if (i > 0 || i1 > 0) {
            return setResultSuccess("修改成功");
        }
        return setResultError("修改成功");
    }


}
