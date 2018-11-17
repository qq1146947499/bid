/*
package com.bid.springcloud.serviceImpl;*/
/*
@author zhoucong
@date ${date}-${time}

*//*


import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.mapper.CoUserMapper;
import com.bid.springcloud.service.DeptClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Demo implements DeptClientService {

    @Resource
    private CoUserMapper coUserMapper;
    @Override
    public CoUser get(Integer id) {
        CoUser coUser = coUserMapper.selectByPrimaryKey(id);
        return coUser;
    }

    @Override
    public CoUser get1(Integer id) {
        return null;
    }
}
*/
