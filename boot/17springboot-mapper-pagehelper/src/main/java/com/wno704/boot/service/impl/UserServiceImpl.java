package com.wno704.boot.service.impl;

import org.springframework.stereotype.Repository;

import com.wno704.boot.model.User;
import com.wno704.boot.service.UserService;

@Repository("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

}
