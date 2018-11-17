package com.bid.springcloud.controller;

import java.util.List;

import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.entities.Dept;
import com.bid.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DeptController_Feign
{
    @Autowired
    private DeptClientService service = null;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public CoUser get(@PathVariable("id") Integer id)
    {
        return this.service.get(id);
    }

}

