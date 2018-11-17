package com.bid.springcloud.serviceImpl.impl;

import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.entities.Dept;
import com.bid.springcloud.mapper.CoUserMapper;
import com.bid.springcloud.serviceImpl.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class DeptServiceImpl implements DeptService
{


	@Resource
	private CoUserMapper coUserMapper;


	@Override
	public boolean add(Dept dept) {
		return false;
	}

	@Override
	public Dept get(Long id) {
		return null;
	}

	@Override
	public List<Dept> list() {
		return null;
	}

	@Override
	public CoUser demo(Integer i) {
        CoUser coUser = coUserMapper.selectByPrimaryKey(i);
        return coUser;
	}
}
 
