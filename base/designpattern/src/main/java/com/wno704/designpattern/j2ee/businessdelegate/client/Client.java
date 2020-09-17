package com.wno704.designpattern.j2ee.businessdelegate.client;

import com.wno704.designpattern.j2ee.businessdelegate.delegate.BusinessDelegate;

public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessDelegate) {
        this.businessService = businessDelegate;
    }

    public void doTask(){
        businessService.doTask();
    }
}
