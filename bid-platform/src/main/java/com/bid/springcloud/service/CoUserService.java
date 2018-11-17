package com.bid.springcloud.service;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.mapper.CoUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CoUserService implements DeptClientService  {

    @Resource
    private CoUserMapper coUserMapper;
    @Override
    public CoUser get(Integer id) {
        return coUserMapper.selectByPrimaryKey(id);
    }


}
