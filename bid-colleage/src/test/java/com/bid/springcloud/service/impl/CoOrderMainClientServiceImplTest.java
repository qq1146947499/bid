package com.bid.springcloud.service.impl;


import com.alibaba.druid.support.spring.stat.SpringStatUtils;
import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.base.ResponseBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


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

    @Test
    public void demo() {
        Integer [] processId ={4,3};

        OrderDTD orderDTD = new OrderDTD();


        Map<String , Object> map =new HashMap<>();
        map.put("orderProcessList",processId);
        Integer [] processI2 = (Integer[]) map.get("orderProcessList");

        for (int i = 0;i<processI2.length;i++){
            System.out.println(processI2[i]);
        }
        ArrayList<Integer> orderProcessList = new ArrayList<>();



        orderProcessList.add(3);
        orderProcessList.add(4);
        ResponseBase demo = coOrderMainClientService.demo( map);
        demo.getData();


    }

    @Test
    public void queryTobePrimedList() {
        OrderDTD orderDTD = new OrderDTD();
        orderDTD.setCollegeId("1");
        coOrderMainClientService.queryTobePrimedList(orderDTD,1);
    }

    @Test
    public void queryPrimedListDesc() {
        coOrderMainClientService.queryPrimedListDesc(389176);

    }
}
