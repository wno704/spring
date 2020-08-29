package com.wno704.shiro.mapper;

import com.wno704.shiro.model.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserPermissionMapper {
    List<Permission> findByUserName(String userName);
}
