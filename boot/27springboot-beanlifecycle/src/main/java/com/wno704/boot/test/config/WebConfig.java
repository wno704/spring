package com.wno704.boot.test.config;

import com.wno704.boot.test.model.Dept;
import com.wno704.boot.test.model.Menu;
import com.wno704.boot.test.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
    @Bean(initMethod = "init", destroyMethod = "destory")
    public User user() {
        return new User();
    }

    @Bean
    public Dept dept(){
        return new Dept();
    }

    @Bean
    public Menu menu(){
        return new Menu();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor () {
        return new MyBeanPostProcessor();
    }
}
