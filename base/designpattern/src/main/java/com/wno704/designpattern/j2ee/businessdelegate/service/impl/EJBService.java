package com.wno704.designpattern.j2ee.businessdelegate.service.impl;

import com.wno704.designpattern.j2ee.businessdelegate.service.BusinessService;

public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
