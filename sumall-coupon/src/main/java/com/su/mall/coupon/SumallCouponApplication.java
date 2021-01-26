package com.su.mall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableDiscoveryClient //开启服务注册与发现功能
@SpringBootApplication
public class SumallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(SumallCouponApplication.class, args);
    }

}
