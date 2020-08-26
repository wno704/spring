package com.wn704.boot.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long userId;
    private String username;
    private String password;
    private Long deptId;
    private String email;
    private String mobile;
    private String status;
    private Date createTime;
    private Date modifyTime;
    private Date lastLoginTime;
    private String ssex;
    private String isTab;
    private String theme;
    private String avatar;
    private String description;
}
