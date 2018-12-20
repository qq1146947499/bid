package com.bid.springcloud;/*
@author zhoucong
@date ${date}-${time}

*/


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(value="com.bid.springcloud")
public class MqAPP {
    public static void main(String[] args) {
        SpringApplication.run(MqAPP.class,args);
    }

}
