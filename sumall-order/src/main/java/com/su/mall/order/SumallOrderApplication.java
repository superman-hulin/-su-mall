package com.su.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SumallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SumallOrderApplication.class, args);
    }

}
