package com.bid.springcloud.service;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.base.ResponseBase;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Component
@FeignClient(value = "MICROSERVICECLOUD-COLLEAGE")
public interface PayServiceClient {


    // 使用订单id查找
    @PostMapping("/pay/findPayToken")
    ResponseBase findPayToken(@RequestParam("ordermainId") String ordermainId);


    // 同步通知
    @RequestMapping("/synCallBack")
     ResponseBase synCallBack(@RequestParam("params") Map<String, String> params);

    // 异步通知
    @RequestMapping("/asynCallBack")
    String asynCallBack(@RequestParam("params") Map<String, String> params);
}
