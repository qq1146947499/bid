package com.bid.springcloud.service.impl;


import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.base.ResponseBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/*
@author zhoucong
@date ${date}-${time}

*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class CoOrderMainClientServiceImplTest {


    @Resource
    private  CoOrderMainClientServiceImpl coOrderMainClientService;

    @Test
    public void selectOrderMainByOrderMainId() {
        ResponseBase base = coOrderMainClientService.selectOrderMainByOrderMainId(5679);



    }

    @Test
    public void deleteorderByOrderMainId() {
        ResponseBase base = coOrderMainClientService.deleteorderByOrderMainId(12886);

    }

    @Test
    public void getOrderByorderState() {
        OrderDTD orderDTD = new OrderDTD();
        orderDTD.setCollegeId("1");
        orderDTD.setOrderProcess("1");
        coOrderMainClientService.getOrderByorderState(orderDTD,5);
    }
}
