package com.su.mall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient //开启服务注册发现
//由于网关模块依赖了common模块，则引入了mp依赖，则会自动加载数据源配置 而网关不需要 则进行排除掉
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SumallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SumallGatewayApplication.class, args);
    }

}
