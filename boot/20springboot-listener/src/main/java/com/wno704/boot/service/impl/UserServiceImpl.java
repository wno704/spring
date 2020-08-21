package com.wno704.boot.service.impl;

import com.wno704.boot.model.User;
import com.wno704.boot.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private ApplicationContext applicationContext;

    @Override
    public User getUser() {
        return new User(1L,"wno704","方法测试");
    }
}
