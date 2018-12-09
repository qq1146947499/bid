package com.bid.springcloud.service.impl;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.entities.CoOrderDmand;
import com.bid.springcloud.mapper.CoOrderDmandMapper;
import com.bid.springcloud.service.CoOrderDmandServiceClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@RestController
public class CoOrderDmandServiceClientImpl implements CoOrderDmandServiceClient {
    @Resource
    private CoOrderDmandMapper coOrderDmandMapper;

    @Override
    @Transactional
    public int addcoOrderDmand(@RequestBody CoOrderDmand coOrderDmand) {
        Random random = new Random();
        int randomNumber1= random.nextInt(111100);
        String id = String.valueOf(randomNumber1);
        coOrderDmand.setDmainId(id);
        int i = coOrderDmandMapper.insertSelective(coOrderDmand);
        return  i;
    }


}
