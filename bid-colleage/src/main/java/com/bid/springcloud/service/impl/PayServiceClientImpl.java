package com.bid.springcloud.service.impl;/*
@author zhoucong
@date ${date}-${time}

*/

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.config.AlipayConfig;
import com.bid.springcloud.entities.CoOrderMain;
import com.bid.springcloud.mapper.CoOrderMainMapper;
import com.bid.springcloud.service.PayServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PayServiceClientImpl extends BaseApiService implements PayServiceClient {


    @Resource
    private CoOrderMainMapper coOrderMainMapper;


    @Override
    public ResponseBase findPayToken(@RequestParam("ordermainId") String  ordermainId) {
        CoOrderMain coOrderMain = coOrderMainMapper.selectByPrimaryKey(Integer.parseInt(ordermainId));
        // 6.对接支付代码 返回提交支付from表单元素给客户端
        // 获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,
                AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key,
                AlipayConfig.sign_type);

        // 设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        // 商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = "1312314141";
        // 付款金额，必填 企业金额
        String total_amount = "31231231";
        // 订单名称，必填
        String subject = "蚂蚁课堂充值会员";
        // 商品描述，可空
        // String body = new
        // String(request.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8");

        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\"" + total_amount
                + "\"," + "\"subject\":\"" + subject + "\","
                // + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        // 请求
        try {
            String result = alipayClient.pageExecute(alipayRequest).getBody();
            JSONObject data = new JSONObject();
            data.put("payHtml", result);
            return setResultSuccess(data);
        } catch (Exception e) {
            return setResultError("支付异常");
        }

    }
}
