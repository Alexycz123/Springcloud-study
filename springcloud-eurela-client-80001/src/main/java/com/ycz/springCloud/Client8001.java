package com.ycz.springCloud;/*
 @author ycz
 @date 2021-12-17-8:54
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Client8001 {

    public static void main(String[] args) {
        SpringApplication.run(Client8001.class,args);
    }

}
