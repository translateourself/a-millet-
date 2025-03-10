package com.milletmall.milletproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.milletmall.milletproduct.dao")
public class MilletProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MilletProductApplication.class, args);
    }

}
