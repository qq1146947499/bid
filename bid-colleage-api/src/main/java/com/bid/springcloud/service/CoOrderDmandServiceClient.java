package com.bid.springcloud.service;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.entities.CoOrderDmand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Component
@FeignClient(value = "MICROSERVICECLOUD-COLLEAGE")
public interface CoOrderDmandServiceClient {

    @PostMapping("/colleage/addOrder")
    int addcoOrderDmand(@RequestBody CoOrderDmand coOrderDmand);


}
