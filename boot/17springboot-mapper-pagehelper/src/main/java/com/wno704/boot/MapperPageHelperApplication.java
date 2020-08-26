package com.wno704.boot;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wno704.boot.mapper")
public class MapperPageHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapperPageHelperApplication.class, args);
    }

}
