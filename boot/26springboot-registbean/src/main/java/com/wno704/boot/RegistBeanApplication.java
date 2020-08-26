package com.wno704.boot;

import com.wno704.boot.test.config.WebConfig;
import com.wno704.boot.test.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class RegistBeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistBeanApplication.class, args);
    }

}
