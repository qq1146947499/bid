package com.bid.springcloud.service;
 
import com.bid.springcloud.entities.CoUser;
import org.springframework.stereotype.Component;
 

import feign.hystrix.FallbackFactory;
 
@Component//不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>
{
  @Override
  public DeptClientService create(Throwable throwable)
  {
   return new DeptClientService() {
     @Override
     public CoUser get1(Integer id)
     {
       CoUser dept = new CoUser();
        return dept;

     }
   };
  }
}
 
 
 
