package com.wno704.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping("/{id:\\d+}")
    public void get(@PathVariable String id) {
        System.out.println(id);
    }
    @GetMapping("/t/{id:\\d+}")
    public void gett(@PathVariable String id) {
        System.out.println(id);
        throw new RuntimeException("user not exist");
    }
}
