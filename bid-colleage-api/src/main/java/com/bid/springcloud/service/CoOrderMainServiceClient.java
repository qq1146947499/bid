package com.bid.springcloud.service;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.CoOrderDmand;
import com.bid.springcloud.entities.CoOrderMain;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.POST;
import java.util.List;

@Component
@FeignClient(value = "MICROSERVICECLOUD-COLLEAGE")
public interface CoOrderMainServiceClient {


    /**
     * 添加订单主表
     * @param coOrderMain
     * @return
     */
    @PostMapping("/colleage/addcoOrderMain")
    int addcoOrderMainr(@RequestBody CoOrderMain coOrderMain);

    /**
     * 查询所有订单
     * @param collegeId
     * @param page
     * @return
     */
    @PostMapping("/colleage/getOrderManList")
    ResponseBase getOrderManList(@RequestParam("collegeId") String collegeId,@RequestParam("page") Integer page);

    /**
     * 删除订单
     * @param orderMainId
     * @return
     */
    @PostMapping("/colleage/deleteOrder/ByOrderMainId")
    ResponseBase deleteorderByOrderMainId(@RequestParam("orderMainId") Integer orderMainId);

    /**
     * 查询订单
     * @param orderMainId
     * @return
     */
    @PostMapping("/colleage/selectOrderMain/ByOrderMainId")
    ResponseBase selectOrderMainByOrderMainId(@RequestParam("orderMainId") Integer orderMainId);

    /**
     * 更新订单,相关
     * @param orderDTD
     * @return
     */
    @PostMapping("/dolleage/edit/ByorderMainId")
    ResponseBase editOrderByorderMainId(@RequestBody OrderDTD orderDTD);
}
