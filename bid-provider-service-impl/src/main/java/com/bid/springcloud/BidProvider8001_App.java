package com.bid.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BidProvider8001_App {
	public static void main(String[] args) {
		SpringApplication.run(BidProvider8001_App.class, args);
	}

}
