package com.wno704.boot.test.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Dept implements InitializingBean, DisposableBean {

    public Dept(){
        System.out.println("Dept 无参构造函数");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("销毁Dept");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化Dept");
    }
}
