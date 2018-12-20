package com.bid.springcloud.controller;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.constants.Constants;
import com.bid.springcloud.entities.CoOrderDmand;
import com.bid.springcloud.entities.CoOrderMain;


import com.bid.springcloud.service.CoOrderDmandServiceClient;
import com.bid.springcloud.service.CoOrderMainServiceClient;

import com.bid.springcloud.service.PayServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
@RequestMapping("/colleage")
@Slf4j
public class CoOrderController extends BaseApiService{



    private static final String PAY_SUCCESS = "pay_success";

    @Resource
    private CoOrderMainServiceClient coOrderServiceClient;

    @Resource
    private CoOrderDmandServiceClient coOrderDmandServiceClient;


    @Autowired
    private PayServiceClient payServiceClient;



    // 异步通知
    @RequestMapping("/notifyUrl")
    @ResponseBody
    public String asynCallBack(HttpServletRequest request,HttpServletResponse response) {
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
//			// 乱码解决，这段代码在出现乱码时使用
//			valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }
        log.info("###支付宝异步回调CallBackController####synCallBack开始 params:{}", params);
        String result = payServiceClient.asynCallBack(params);
        return result;

    }

    // 同步通知
    @RequestMapping("/returnUrl")
    public void synCallBack(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            // 乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }
        log.info("###支付宝同步回调CallBackController####synCallBack开始 params:{}", params);
        ResponseBase synCallBackResponseBase = payServiceClient.synCallBack(params);
        PrintWriter writer = response.getWriter();
        if (!synCallBackResponseBase.getRtnCode().equals(Constants.HTTP_RES_CODE_200)) {
            // 报错页面
            return;
        }
        LinkedHashMap data = (LinkedHashMap) synCallBackResponseBase.getData();
        String outTradeNo = (String) data.get("outTradeNo");
        // 支付宝交易号
        String tradeNo = (String) data.get("tradeNo");
        // 付款金额
        String totalAmount = (String) data.get("totalAmount");

        log.info("###支付宝同步回调CallBackController####synCallBack結束 params:{}", params);
        // 封装成html 浏览器模拟去提交
        String htmlFrom="<form name='punchout_form' "
                + "method='post' "
                + "action='http://127.0.0.1:81/colleage/synSuccessPage' >"
                + "<input type='hidden' name='outTradeNo' value='"+outTradeNo+"'>"
                + "<input type='hidden' name='tradeNo' value='"+tradeNo+"'>"
                + "<input type='hidden' name='totalAmount' value='"+totalAmount+"'>"
                + "<input type='submit' value='立即支付' style='display:none'>"
                + "</form>"
                + "<script>document.forms[0].submit();</script>";
        writer.println(htmlFrom);
    }

    // 以post表达隐藏参数
    @RequestMapping(value = "/synSuccessPage", method = RequestMethod.POST)
    public String synSuccessPage(HttpServletRequest request, String outTradeNo, String tradeNo, String totalAmount) {
        request.setAttribute("outTradeNo", outTradeNo);
        request.setAttribute("tradeNo", tradeNo);
        request.setAttribute("totalAmount", totalAmount);
        return PAY_SUCCESS;
    }


    // 使用token 进行支付
    @RequestMapping("/aliPay")
    public void aliPay(String orderMainId,HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        // 1.参数验证
        if (StringUtils.isEmpty(orderMainId)) {
            return;
        }
        // 2.调用支付服务接口 获取支付宝html元素
        ResponseBase payTokenResult = payServiceClient.findPayToken(orderMainId);
        if (!payTokenResult.getRtnCode().equals(Constants.HTTP_RES_CODE_200)) {
            String msg = payTokenResult.getMsg();
            writer.println(msg);
            return;
        }
        // 3.返回可以执行的html元素给客户端
        LinkedHashMap data = (LinkedHashMap) payTokenResult.getData();
        String payHtml = (String) data.get("payHtml");
        log.info("####PayController###payHtml:{}",payHtml);
        //4. 页面上进行渲染
        writer.println(payHtml);
        writer.close();
    }





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
