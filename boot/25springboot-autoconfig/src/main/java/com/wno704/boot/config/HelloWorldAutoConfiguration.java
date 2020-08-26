package com.wno704.boot.config;

import com.wno704.boot.annotation.EnableHelloWorld;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHelloWorld
@ConditionalOnProperty(name = "helloworld", havingValue = "true")
public class HelloWorldAutoConfiguration {
}
