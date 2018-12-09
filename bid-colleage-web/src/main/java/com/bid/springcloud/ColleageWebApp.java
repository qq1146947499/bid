package com.bid.springcloud;/*
@author zhoucong
@date ${date}-${time}

*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ComponentScan(basePackages = "com.bid.springcloud")
public class ColleageWebApp {
    public static void main(String[] args) {
        SpringApplication.run(ColleageWebApp.class,args);
    }

}
