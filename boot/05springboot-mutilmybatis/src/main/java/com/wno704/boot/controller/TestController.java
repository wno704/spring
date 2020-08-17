package com.wno704.boot.controller;

import com.wno704.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @Autowired
    private StudentService studentService;

    @RequestMapping( value = "/getAllStudentsWithMysql", method = RequestMethod.GET)
    public List<Map<String, Object>> getAllStudentsWithMysql() {
        return this.studentService.getAllStudentsWithMysql();
    }

    @RequestMapping( value = "/getAllStudentsWithOracle", method = RequestMethod.GET)
    public List<Map<String, Object>> getAllStudentsWithOracle() {
        return this.studentService.getAllStudentsWithOracle();
    }
}
