package com.bid.springcloud;/*
@author zhoucong
@date ${date}-${time}

*/

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication(exclude = {MongoDataAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.bid")
@MapperScan(basePackages = "com.bid.springcloud.mapper")
public class ColleageServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ColleageServiceApp.class,args);
    }

}
