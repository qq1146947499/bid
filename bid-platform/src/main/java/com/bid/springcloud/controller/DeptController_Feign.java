package com.bid.springcloud.controller;

import java.util.List;

import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.entities.Dept;
import com.bid.springcloud.service.CoUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class DeptController_Feign
{

    @Resource
    private CoUserService coUserService;


    @RequestMapping("/hello")
    public String hello(){
        return  "Hello";
    }
   /* @RequestMapping(value = "/consumer/dept/get/{id}")
    public CoUser get(@PathVariable Integer id){
        System.out.println("get resolver");
       return  coUserService.get(id);
    }*/

}

