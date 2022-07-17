package com.ycz.springCloud.service;/*
 @author ycz
 @date 2021-12-21-11:14
*/

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserServiceFallBackFactory implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public Object getAll() {
                Map<String,Object> resultMap=new HashMap<>();
                resultMap.put("code",4444);
                resultMap.put("msg","降级，无id");
                return resultMap;
            }

            @Override
            public Object get(Integer id) {
                Map<String,Object> resultMap=new HashMap<>();
                resultMap.put("code",4444);
                resultMap.put("msg","降级，无id");
                return resultMap;
            }
        };
    }
}
