package com.ycz.springCloud.controller;/*
 @author ycz
 @date 2021-12-20-14:00
*/

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFeignController {

    @Value("${server.port}")
    private Integer serverPort;


}
