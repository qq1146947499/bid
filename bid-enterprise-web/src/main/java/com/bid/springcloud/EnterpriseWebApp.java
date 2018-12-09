package com.bid.springcloud;/*
@author zhoucong
@date ${date}-${time}

*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ComponentScan(value="com.bid.springcloud")
public class EnterpriseWebApp {
    public static void main(String[] args) {
        SpringApplication.run(EnterpriseWebApp.class,args);
    }

}
