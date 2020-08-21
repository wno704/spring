package com.wno704.demo.controller;

import com.wno704.demo.exception.CalculateErrorException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculate")
public class CalculateController {
    @GetMapping("/{divisor:\\d+}/{dividend:\\d+}")
    public void calculate(@PathVariable Long divisor,@PathVariable Long dividend) {
        throw new CalculateErrorException("500");
    }

    @GetMapping("/get/{id:\\d+}")
    public void get(@PathVariable String id) {
        throw new CalculateErrorException(id);
    }
}
