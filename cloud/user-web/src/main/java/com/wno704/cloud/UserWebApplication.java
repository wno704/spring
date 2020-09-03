package com.wno704.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableCircuitBreaker
@EnableFeignClients(basePackages = {"com.wno704.cloud"})
@EnableEurekaClient
//@EnableDiscoveryClient
@SpringBootApplication
public class UserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserWebApplication.class, args);
    }

}
