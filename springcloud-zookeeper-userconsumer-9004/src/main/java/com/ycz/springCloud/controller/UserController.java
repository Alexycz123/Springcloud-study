package com.ycz.springCloud.controller;/*
 @author ycz
 @date 2021-12-17-10:23
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL="http://springcloud-zookeeper-provider-9003";

    @RequestMapping("/getAll")
    public Object getAll(){
        ResponseEntity<Object> forEntity = restTemplate.getForEntity(REST_URL + "/movie/getAll", Object.class);
        return forEntity;
    }

    @RequestMapping("/get/{id}")
    public Object getOne(@PathVariable("id") Integer id){
        ResponseEntity<Object> forEntity = restTemplate.getForEntity(REST_URL + "/movie/getOne/"+id, Object.class);
        return forEntity;
    }


}
