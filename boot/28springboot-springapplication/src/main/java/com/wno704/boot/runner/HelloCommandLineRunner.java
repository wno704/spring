package com.wno704.boot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("HelloCommandLineRunner: hello spring boot");
    }
}