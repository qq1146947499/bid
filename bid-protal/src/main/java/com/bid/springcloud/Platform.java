package com.bid.springcloud;/*
@author zhoucong
@date ${date}-${time}

*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Platform {
    public static void main(String[] args) {
        SpringApplication.run(Platform.class,args);
    }

}
