package com.ywq.yangojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.ywq.yangojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.ywq")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.ywq.yangojbackendserviceclient.service"})
public class yangojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(yangojBackendQuestionServiceApplication.class, args);
    }

}
