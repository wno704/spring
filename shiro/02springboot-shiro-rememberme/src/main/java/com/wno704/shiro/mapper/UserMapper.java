package com.wno704.shiro.mapper;

import com.wno704.shiro.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findByUserName(String userName);
}
