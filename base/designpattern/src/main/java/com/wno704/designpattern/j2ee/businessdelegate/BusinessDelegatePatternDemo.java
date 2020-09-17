package com.wno704.designpattern.j2ee.businessdelegate;

import com.wno704.designpattern.j2ee.businessdelegate.client.Client;
import com.wno704.designpattern.j2ee.businessdelegate.delegate.BusinessDelegate;

public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }

}
