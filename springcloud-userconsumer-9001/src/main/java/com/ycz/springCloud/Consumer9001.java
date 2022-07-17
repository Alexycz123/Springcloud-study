package com.ycz.springCloud;/*
 @author ycz
 @date 2021-12-17-10:16
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableFeignClient
public class Consumer9001 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer9001.class,args);
    }
}
