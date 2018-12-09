package com.bid.springcloud.controller;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.service.PtOrderClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/platform")
public class PtOrderController {

    @Resource
    private PtOrderClientService ptOrderClientService;


    @ResponseBody
    @RequestMapping("/queryOrderList/byProcessId")
    public Object getOrderList(Integer processId,@RequestParam(value = "page",required = false,defaultValue ="1") Integer page){
        ResponseBase base = ptOrderClientService.queryOrderListByProcessId(processId, page);
        return  base;
    }
}
