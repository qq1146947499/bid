package com.bid.springcloud;/*
@author zhoucong
@date ${date}-${time}

*/

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ComponentScan(value="com.bid")
public class PlatformWeb {
    public static void main(String[] args) {
        SpringApplication.run(PlatformWeb.class,args);
    }

}
