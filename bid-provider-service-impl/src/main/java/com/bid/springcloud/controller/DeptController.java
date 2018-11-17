package com.bid.springcloud.controller;

import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.entities.Dept;
import com.bid.springcloud.mapper.CoUserMapper;
import com.bid.springcloud.service.DeptClientService;
import com.bid.springcloud.serviceImpl.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/dept")
public class DeptController implements DeptClientService
{
  @Resource
  private CoUserMapper coUserMapper;
  @Autowired
  private DeptService service;

  @RequestMapping("/hello")
  public String  demo(){
    System.out.println("hello");
    return "hello";
  }

  @PostMapping("/add")
  public boolean add(@RequestBody Dept dept)
  {
	  boolean add = service.add(dept);
   return add;
  }

  @GetMapping("/get/{id}")
  public CoUser get(@PathVariable("id") Integer id)
  {
   return service.demo(id);
  }

  @GetMapping("/list")
  public List<Dept> list()
  {
   return service.list();
  }


  @Override
  @GetMapping("/get2/{id}")
  public CoUser get1(@PathVariable Integer id) {
    System.out.println("ger resoulver");
    return coUserMapper.selectByPrimaryKey(id);
  }
}

