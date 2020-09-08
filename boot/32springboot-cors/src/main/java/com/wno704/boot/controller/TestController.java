package com.wno704.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("index")
    public String index () {
        return "index";
    }

    //@CrossOrigin(value = "*")
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}