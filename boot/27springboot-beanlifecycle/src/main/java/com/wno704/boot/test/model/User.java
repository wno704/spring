package com.wno704.boot.test.model;

public class User {
    public User(){
        System.out.println("User 无参构造函数");
    }

    public  void init(){
        System.out.println("初始化User");
    }

    public void destory(){
        System.out.println("销毁User");
    }
}
