package com.ycz.springCloud;/*
 @author ycz
 @date 2021-12-20-9:50
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulConsumer9002 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumer9002.class,args);
    }
}
