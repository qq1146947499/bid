package com.bid.springcloud.service.impl;


import com.bid.springcloud.DTD.OrderDTD;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/*
@author zhoucong
@date ${date}-${time}

*/
@SpringBootTest
@RunWith(SpringRunner.class)
public class CoOrderDmandServiceClientImplTest {

    @Resource
    private  CoOrderDmandServiceClientImpl coOrderDmandServiceClient;

}
