package com.su.mall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SumallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(SumallWareApplication.class, args);
    }

}
