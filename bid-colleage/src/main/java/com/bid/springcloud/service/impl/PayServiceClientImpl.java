package com.bid.springcloud.service.impl;/*
@author zhoucong
@date ${date}-${time}

*/

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.config.AlipayConfig;
import com.bid.springcloud.constants.Constants;
import com.bid.springcloud.entities.CoOrderMain;
import com.bid.springcloud.entities.CoOrderMainExample;
import com.bid.springcloud.entities.CpBidOrder;
import com.bid.springcloud.mapper.CoOrderMainMapper;
import com.bid.springcloud.service.CpOrderClientService;
import com.bid.springcloud.service.PayServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

@RestController
@Slf4j
public class PayServiceClientImpl extends BaseApiService implements PayServiceClient {


    @Resource
    private CoOrderMainMapper coOrderMainMapper;
    @Resource
    private CpOrderClientService cpOrderClientService;


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
        String OrderMainId = coOrderMain.getOrderMainId()+"";
        // 商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = OrderMainId+"";
        // 付款金额，必填 企业金额
        String total_amount = coOrderMain.getOrderTotalAmount().replace("元","");
        // 订单名称，必填
        String subject = "高校竞价";
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

    @Override
    public ResponseBase synCallBack(@RequestParam Map<String, String> params) {

        // 1.日志记录
        log.info("#####支付宝同步通知synCallBack#####开始,params:{}", params);
        // 2.验签操作
        try {
            boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key,
                    AlipayConfig.charset, AlipayConfig.sign_type); // 调用SDK验证签名
            log.info("#####支付宝同步通知signVerified:{}######", signVerified);
            // ——请在这里编写您的程序（以下代码仅作参考）——
            if (!signVerified) {
                return setResultError("验签失败!");
            }
            // 商户订单号
            String outTradeNo = params.get("out_trade_no");
            // 支付宝交易号
            String tradeNo = params.get("trade_no");
            // 付款金额
            String totalAmount = params.get("total_amount");
            JSONObject data = new JSONObject();
            data.put("outTradeNo", outTradeNo);
            data.put("tradeNo", tradeNo);
            data.put("totalAmount", totalAmount);
            return setResultSuccess(data);
        } catch (Exception e) {
            log.error("####支付宝同步通知出现异常,ERROR:", e);
            return setResultError("系统错误!");
        } finally {
            log.info("#####支付宝同步通知synCallBack#####结束,params:{}", params);
        }
    }

    @Override
    public String asynCallBack(@RequestParam Map<String, String> params) {
// 1.日志记录
        log.info("#####支付宝异步通知synCallBack#####开始,params:{}", params);
        // 2.验签操作
        try {
            boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key,
                    AlipayConfig.charset, AlipayConfig.sign_type); // 调用SDK验证签名
            log.info("#####支付宝异步通知signVerified:{}######", signVerified);
            // ——请在这里编写您的程序（以下代码仅作参考）——
            if (!signVerified) {
                return Constants.PAY_FAIL;
            }
            // 商户订单号
            String outTradeNo = params.get("out_trade_no");
            CoOrderMain coOrderMain = coOrderMainMapper.selectByPrimaryKey(Integer.parseInt(outTradeNo));
            if (coOrderMain == null) {
                return Constants.PAY_FAIL;
            }

            // 支付宝重试机制
            String orderProcess = coOrderMain.getOrderProcess();
            if (orderProcess.equals("11")) {
                return Constants.PAY_SUCCESS;
            }

            // 支付宝交易号
            String tradeNo = params.get("trade_no");
            // 付款金额
            // String totalAmount = params.get("total_amount");
            // 判断实际付款金额与商品金额是否一致
            // 修改 支付表状态
            coOrderMain.setOrderProcess("11");// 标识为已经支付
            coOrderMain.setTransportType(params.toString());
            coOrderMain.setDeliverPlace(tradeNo);
            // 手动 begin begin

            CoOrderMainExample coOrderMainExample = new CoOrderMainExample();
            coOrderMainExample.createCriteria().andOrderMainIdEqualTo(coOrderMain.getOrderMainId());
            int updateResult = coOrderMainMapper.updateByExampleSelective(coOrderMain, coOrderMainExample);
            if (updateResult <= 0) {
                return Constants.PAY_FAIL;
            }
            // 调用供应商已经支付 支付状态
            CpBidOrder cpBidOrder = new CpBidOrder();
            cpBidOrder.setOrderMainId(String.valueOf(coOrderMain.getOrderMainId()));
            cpBidOrder.setDetailId("1");
            ResponseBase orderResult = cpOrderClientService.updateByOrderMainId(cpBidOrder);
            if (orderResult.getRtnCode().equals(Constants.HTTP_RES_CODE_200)) {
                // 回滚 手动回滚 rollback
                return Constants.PAY_FAIL;
            } // 2PC 3PC TCC MQ
            // 手动 提交 comiit;
            return Constants.PAY_SUCCESS;
        } catch (Exception e) {
            log.error("####支付宝异步通知出现异常,ERROR:", e);
            // 回滚 手动回滚 rollback
            return Constants.PAY_FAIL;
        } finally {
            log.info("#####支付宝异步通知synCallBack#####结束,params:{}", params);
        }
    }
}
