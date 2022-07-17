package com.ycz.springCloud;/*
 @author ycz
 @date 2021-12-20-9:12
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Zookeeper9003 {
    public static void main(String[] args) {
        SpringApplication.run(Zookeeper9003.class,args);
    }
}
