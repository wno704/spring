package com.wno704.cloud.service.impl;

import com.wno704.cloud.model.User;
import com.wno704.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;


    private static Map<Integer,User> map;
    static {
        map = new HashMap<>();
        for (int i=1; i<10; i++) {
            map.put(i, new User(i,"test" +i , "pwd" + i));
        }
    }


    @Override
    public User getById(Integer id) {
        User user = map.get(id);
        user.setName(instanceId);
        return user;
    }
}
