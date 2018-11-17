package com.bid.springcloud.service;

import com.bid.springcloud.entities.CoUser;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService
{
  @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
  public CoUser get(@PathVariable("id") Integer id);


}
 
