package com.wno704.boot.test.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Menu {

    public Menu(){
        System.out.println("Menu 无参构造函数");
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化Menu");
    }

    @PreDestroy
    public void destory() {
        System.out.println("销毁Menu");
    }
}
