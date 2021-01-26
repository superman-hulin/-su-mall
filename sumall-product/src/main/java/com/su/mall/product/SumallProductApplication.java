package com.su.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.su.mall.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class SumallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SumallProductApplication.class, args);
    }

}
