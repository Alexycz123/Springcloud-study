package com.ycz.springCloud.service;/*
 @author ycz
 @date 2021-12-21-9:23
*/

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "springcloud-zookeeper-provider-9003",fallbackFactory = UserServiceFallBackFactory.class)
@Component
public interface UserService {


    @RequestMapping("/movie/getAll")
     Object getAll();

    @RequestMapping("/movie/getOne/{id}")
    Object get(@PathVariable("id") Integer id);
}
