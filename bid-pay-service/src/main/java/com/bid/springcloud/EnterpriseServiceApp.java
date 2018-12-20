package com.bid.springcloud;/*
@author zhoucong
@date ${date}-${time}

*/

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {MongoDataAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients
@ComponentScan(basePackages = "com.bid")
@MapperScan(basePackages = "com.bid.springcloud.mapper")
public class EnterpriseServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(EnterpriseServiceApp.class,args);
    }

}
