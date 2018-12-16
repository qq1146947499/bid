package com.bid.springcloud.controller;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.CoOrderDmand;
import com.bid.springcloud.entities.CoOrderMain;


import com.bid.springcloud.service.CoOrderDmandServiceClient;
import com.bid.springcloud.service.CoOrderMainServiceClient;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.validation.Valid;

import java.util.Map;

@Controller
@RequestMapping("/colleage")
public class CoOrderController extends BaseApiService{


    @Resource
    private CoOrderMainServiceClient coOrderServiceClient;

    @Resource
    private CoOrderDmandServiceClient coOrderDmandServiceClient;




    @RequestMapping(value = "/add/ReleaseOrder")
    @ResponseBody
    public Object addReleaseOrder( Integer orderMainId){
        ResponseBase base = coOrderServiceClient.editReleaseOrder(orderMainId);
        return  base;
    }


    @RequestMapping(value = "/primary/addOrderDmain")
    @ResponseBody
    public Object primaryaddOrderDmain( CoOrderDmand coOrderDmand){
        ResponseBase base = coOrderServiceClient.addOrderPrimary(coOrderDmand);
        return  base;
    }



    @RequestMapping("/get/primaryBid")
    public ModelAndView getprimaryBid(@RequestParam("orderMainId") Integer orderMainId, Map<String,Object> map){
        ResponseBase base = coOrderServiceClient.queryPrimedListDesc(orderMainId);
        map.put("data",base);
        return  new ModelAndView("/item/primaryDesc",map);
    }
    @RequestMapping("/get/tobePrimedList")
    @ResponseBody
    public Object getTobePrimedList(OrderDTD orderDTD,  @RequestParam(value = "page", defaultValue = "1") Integer page){
        ResponseBase base = coOrderServiceClient.queryTobePrimedList(orderDTD,page);
        return  base;
    }



    @RequestMapping("order/itemDesc")
    public String orderItemDesc(Integer orderMainId,Model model){
        ResponseBase base = coOrderServiceClient.selectOrderMainByOrderMainId(orderMainId);
        model.addAttribute("order",base);
        return  "/item/itemDesc";
    }

    @RequestMapping("/releaseorder/ByOrderMainId")
    @ResponseBody
    public Object  releaseorderByOrderMainId(OrderDTD orderDTD){

        ResponseBase orderManList = coOrderServiceClient.orderStateEdit(orderDTD);

        return  orderManList;

    }


    @RequestMapping("/get/unauditedorderList")
    @ResponseBody
    public Object getunauditedorder(OrderDTD orderDTD,  @RequestParam(value = "page", defaultValue = "1") Integer page){

        ResponseBase orderManList = coOrderServiceClient.getOrderByorderState(orderDTD, page);

        return  orderManList;

    }

    @RequestMapping("/get/unauditedorder")
    public String getunauditedorder(){
        return  "/item/unaudited";

    }

   @RequestMapping("/edit/order")
   @ResponseBody
   public ResponseBase editOrderByorderMainId(OrderDTD orderDTD){
       ResponseBase base =  coOrderServiceClient.editOrderByorderMainId(orderDTD);
       return  base;
   }

    @RequestMapping("/getEditOrderMain")
    public  String getEditOrderMain(Integer orderMainId, Model model){
        ResponseBase base = coOrderServiceClient.selectOrderMainByOrderMainId(orderMainId);
        model.addAttribute("order",base);
        return  "/item/edit";
    }


    @RequestMapping("/delete/orderByOrderMainId")
    @ResponseBody
    public Object  deleteorderByOrderMainId(Integer orderMainId){

        ResponseBase orderManList = coOrderServiceClient.deleteorderByOrderMainId(orderMainId);

        return  orderManList;

    }



    @RequestMapping("/get/orderIndex")
    @ResponseBody
    public Object getOrderList(String collegeId ,  @RequestParam(value = "page", defaultValue = "1") Integer page){

        ResponseBase orderManList = coOrderServiceClient.getOrderManList(collegeId, page);

                return  orderManList;

    }

    @RequestMapping("/add/order")
    @ResponseBody
    @Transactional
    public ResponseBase         addCoOrder(@Valid CoOrderMain coOrderMain, @Valid  CoOrderDmand coOrderDmand ,BindingResult result){
        boolean b = result.hasErrors();
        if(result.hasErrors()){
            for (ObjectError error : result.getAllErrors()) {

                System.out.println(error.getDefaultMessage());
            }

        }

        if(!b){
            int orderMainId = RandomUtils.nextInt(1, 1000000);
            coOrderMain.setOrderMainId(orderMainId);
            coOrderDmand.setOrderMainId(String.valueOf(orderMainId));
            int i1 = coOrderDmandServiceClient.addcoOrderDmand(coOrderDmand);
            if (i1>0){
                int i = coOrderServiceClient.addcoOrderMainr(coOrderMain);
                if(i>0){
                    return  setResultSuccess("添加订单成功");
                }

            }

        }
        return  setResultError("添加订单失败");
    }



    @RequestMapping("/item/index")
    public String getItemIndex(){

        return "/item/index";
    }
}
