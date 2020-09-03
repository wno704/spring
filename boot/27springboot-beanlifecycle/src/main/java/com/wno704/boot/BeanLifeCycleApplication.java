package com.wno704.boot;

import com.wno704.boot.test.config.WebConfig;
import com.wno704.boot.test.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanLifeCycleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanLifeCycleApplication.class, args);
    }

}
