package com.wno704.designpattern.j2ee.servicelocator.service.impl;

import com.wno704.designpattern.j2ee.servicelocator.service.Service;

public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
