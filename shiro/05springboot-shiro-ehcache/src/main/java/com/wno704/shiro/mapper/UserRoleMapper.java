package com.wno704.shiro.mapper;

import com.wno704.shiro.model.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRoleMapper {
    List<Role> findByUserName(String userName);
}
