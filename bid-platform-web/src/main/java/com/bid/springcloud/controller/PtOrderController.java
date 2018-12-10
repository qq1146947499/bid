package com.bid.springcloud.controller;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.service.PtOrderClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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




    @RequestMapping("/getReleaseAudit/orderMain")
    public  String getEditOrderMain(Integer orderMainId, Model model){
        ResponseBase base = ptOrderClientService.selectOrderMainByOrderMainId(orderMainId);
        model.addAttribute("order",base);
        return  "/item/releaseTE";
    }



    @RequestMapping("/release/order")
    @ResponseBody
    public Object  releaseOrder(OrderDTD orderDTD){
        ResponseBase base = ptOrderClientService.releaseOrderByOrderMainId(orderDTD);

        return  base;
    }

    @RequestMapping("/release/passOrder")
    @ResponseBody
    public Object  releasePassorder(OrderDTD orderDTD){
        ResponseBase base = ptOrderClientService.releasePassOrderByOrderMainId(orderDTD);
        return  base;
    }

}
