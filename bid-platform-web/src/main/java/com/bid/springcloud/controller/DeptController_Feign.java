package com.bid.springcloud.controller;

import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.entities.PtUser;
import com.bid.springcloud.service.DeptClientService;
import com.bid.springcloud.service.PtUserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class DeptController_Feign
{

    @Autowired
    private DeptClientService service;

    @Resource
    private PtUserClientService ptUserClientService;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public CoUser get(@PathVariable("id") Integer id)
    {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/user/get/{id}")
    public PtUser get2(@PathVariable Integer id)
    {
        System.out.println("sss");
        return ptUserClientService.query1(id);
    }



}

