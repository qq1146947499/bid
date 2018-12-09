package com.bid.springcloud.service.impl;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.enums.ResultEnum;
import com.bid.springcloud.exception.SellException;
import com.bid.springcloud.mapper.CoOrderDmandMapper;
import com.bid.springcloud.mapper.CoOrderMainMapper;
import com.bid.springcloud.service.PtOrderClientService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PtOrderClientServiceImpl extends BaseApiService implements PtOrderClientService{


    @Resource
    private CoOrderMainMapper coOrderMainMapper;


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
}
