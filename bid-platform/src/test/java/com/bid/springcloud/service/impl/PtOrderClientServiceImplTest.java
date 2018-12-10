package com.bid.springcloud.service.impl;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/*
@author zhoucong
@date ${date}-${time}

*/
@SpringBootTest
@RunWith(SpringRunner.class)
public class PtOrderClientServiceImplTest {

    @Resource
    private PtOrderClientServiceImpl ptOrderClientService;

    @Test
    public void queryOrderListByProcessId() {
        ptOrderClientService.selectOrderMainByOrderMainId(4);
    }
}
