package com.ycz.springCloud;/*
 @author ycz
 @date 2021-12-20-9:12
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //开启客户端自动发现，注册到consul中
public class Consul8003 {
    public static void main(String[] args) {
        SpringApplication.run(Consul8003.class,args);
    }
}
