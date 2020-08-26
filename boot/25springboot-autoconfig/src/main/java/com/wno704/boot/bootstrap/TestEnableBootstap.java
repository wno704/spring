package com.wno704.boot.bootstrap;

import com.wno704.boot.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableHelloWorld
public class TestEnableBootstap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(TestEnableBootstap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String hello = context.getBean("hello", String.class);
        System.out.println("hello Bean: " + hello);
        context.close();
    }
}
