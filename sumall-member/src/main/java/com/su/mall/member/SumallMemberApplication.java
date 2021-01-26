package com.su.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 开启远程调用的功能,并指明feign接口所在的包，这样可以扫描到该包中@FeignClient注解
 */
@EnableFeignClients(basePackages ="com.su.mall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class SumallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SumallMemberApplication.class, args);
    }

}
