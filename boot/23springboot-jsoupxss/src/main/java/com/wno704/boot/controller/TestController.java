package com.wno704.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xss")
public class TestController {

    @GetMapping("/test")
    public String sendTemplateMail(String code){
        System.out.println(">>"+code);
        return null;
    }

}
