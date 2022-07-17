package com.ycz.springCloud;/*
 @author ycz
 @date 2021-12-20-9:50
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.ycz.springCloud")
@EnableCircuitBreaker // 熔断
@EnableHystrix //降级？
public class UserConsumer_9005 {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumer_9005.class,args);
    }
}
