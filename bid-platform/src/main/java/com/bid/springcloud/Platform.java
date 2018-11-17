package com.bid.springcloud;/*
@author zhoucong
@date ${date}-${time}

*/

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {MongoDataAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients
@MapperScan(basePackages = "com.bid.springcloud.mapper")
public class Platform {
    public static void main(String[] args) {
        SpringApplication.run(Platform.class,args);
    }

}
