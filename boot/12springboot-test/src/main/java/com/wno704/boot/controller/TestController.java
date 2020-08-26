package com.wno704.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/helloword", method = RequestMethod.GET)
    public String home(String value) {

        return "Hello World!!!" + value;
    }

}
