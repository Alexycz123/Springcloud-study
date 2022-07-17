package com.ycz.springCloud.controller;/*
 @author ycz
 @date 2021-12-21-9:28
*/

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ycz.springCloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/user/feign")
@RestController
@PropertySource("classpath:application.yml")
public class UserFeignController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    @HystrixCommand(fallbackMethod = "error")
    public Object getAll(){
       int i=1/0;
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("code",200);
        resultMap.put("port",port);
        resultMap.put("data",userService.getAll());
        return resultMap;
    }

    public Object error(){
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("code",40000002);
        resultMap.put("port",port);
        resultMap.put("msg","错误");
        resultMap.put("data",null);
        return resultMap;
    }

    @RequestMapping("/get/{id}")
    public Object get(@PathVariable("id") Integer id){
        return userService.get(id);
    }

}
