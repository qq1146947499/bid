package com.bid.springcloud.service;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.CoOrderDmand;
import com.bid.springcloud.entities.CoOrderMain;
import org.aspectj.weaver.ast.Or;
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
    @PostMapping("/colleage/edit/ByorderMainId")
    ResponseBase editOrderByorderMainId(@RequestBody OrderDTD orderDTD);


    /**
     * 根据订单状态查询订单相关
     * @param orderDTD
     * @param page
     * @return
     */
    @PostMapping("/colleage/getOrder/byorderState")
    ResponseBase getOrderByorderState(@RequestBody OrderDTD orderDTD, @RequestParam("page") Integer page);

    /**
     * 修改订单状态相关
     * @param orderDTD
     * @return
     */
    @PostMapping("/colleage/orderStateEdit")
    ResponseBase orderStateEdit(@RequestBody OrderDTD orderDTD);


    /**
     * 查询待初选订单
     * @param orderDTD
     * @param page
     * @return
     */
    @PostMapping("/colleage/query/TobePrimedList")
    ResponseBase queryTobePrimedList(@RequestBody OrderDTD orderDTD,@RequestParam("page") Integer page);





    /**
     * 添加初选订单
     * @param coOrderDmand
     * @return
     */

    @PostMapping("/colleage/addOrderPrimary")
    ResponseBase addOrderPrimary(@RequestBody  CoOrderDmand coOrderDmand);


    /**
     *订单发布
     * @param orderMainId
     * @return
     */
    @PostMapping("/colleage/update/ReleaseOrder")
    ResponseBase editReleaseOrder(@RequestParam("orderMainId") Integer orderMainId);


//---------------------------------------暂时
    /**
     * 待初选订单详情 暂时
     * @param orderMainId
     * @return
     */
    @PostMapping("/colleage/query/PrimedListDesc")
    ResponseBase queryPrimedListDesc(@RequestParam("orderMainId") Integer orderMainId);





}
