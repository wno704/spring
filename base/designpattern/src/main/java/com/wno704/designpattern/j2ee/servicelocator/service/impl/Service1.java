package com.wno704.designpattern.j2ee.servicelocator.service.impl;

import com.wno704.designpattern.j2ee.servicelocator.service.Service;

public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
