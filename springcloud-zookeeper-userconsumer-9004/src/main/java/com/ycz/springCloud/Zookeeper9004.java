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
@EnableFeignClients
@EnableCircuitBreaker // 熔断
public class Zookeeper9004 {
    public static void main(String[] args) {
        SpringApplication.run(Zookeeper9004.class,args);
    }
}
