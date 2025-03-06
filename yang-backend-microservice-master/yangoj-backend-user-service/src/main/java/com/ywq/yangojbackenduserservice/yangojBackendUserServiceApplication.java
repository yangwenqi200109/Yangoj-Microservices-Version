package com.ywq.yangojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.ywq.yangojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.ywq")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.ywq.yangojbackendserviceclient.service"})
public class yangojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(yangojBackendUserServiceApplication.class, args);
    }

}
