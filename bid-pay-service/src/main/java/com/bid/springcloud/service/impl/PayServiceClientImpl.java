/*
package com.bid.springcloud.service.impl;*/
/*
@author zhoucong
@date ${date}-${time}

*//*


import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.config.AlipayConfig;
import com.bid.springcloud.entities.CoOrderMain;
import com.bid.springcloud.mapper.CoOrderMainMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.com.bid.springcloud.service.PayServiceClient;

@RestController
@Slf4j
public class PayServiceClientImpl extends BaseApiService implements PayServiceClient {


    @Resource
    private CoOrderMainMapper coOrderMainMapper;


    @Override
    public ResponseBase findPayToken(@RequestParam("ordermainId") String  ordermainId) {


        // 1.参数验证
        if (StringUtils.isEmpty(ordermainId)) {
            return setResultError("tokne不能为空");
        }
        // 2.判断token有效期
        // 3.使用token 查找redis 找到对应支付id
       */
/* String payId = (String) baseRedisService.getString(payToken);
        if (StringUtils.isEmpty(payId)) {
            return setResultError("支付请求已经超时!");
        }*//*

        // 4.使用支付id，进行下单
        //Long payIDl = Long.parseLong(payId);

        // 5.使用支付id查询支付信息
        */
/*PaymentInfo paymentInfo = paymentInfoDao.getPaymentInfo(payIDl);*//*

        CoOrderMain coOrderMain = coOrderMainMapper.selectByPrimaryKey(Integer.parseInt(ordermainId));
        if (coOrderMain == null) {
            return setResultError("未找到支付信息");
        }
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
        String out_trade_no = coOrderMain.getOrderMainId().toString();
        // 付款金额，必填 企业金额
        String total_amount = coOrderMain.getOrderTotalAmount();
        // 订单名称，必填
        String subject = "竞价系统订单支付";
        // 商品描述，可空
        // String body = new
        // String(request.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8");

        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\"" + total_amount
                + "\"," + "\"subject\":\"" + subject + "\","
                // + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        // 若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
        // alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no
        // +"\","
        // + "\"total_amount\":\""+ total_amount +"\","
        // + "\"subject\":\""+ subject +"\","
        // + "\"body\":\""+ body +"\","
        // + "\"timeout_express\":\"10m\","
        // + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        // 请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节

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
*/
