package com.milletmall.milletmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.milletmall.milletmember.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MilletMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MilletMemberApplication.class, args);
    }

}
