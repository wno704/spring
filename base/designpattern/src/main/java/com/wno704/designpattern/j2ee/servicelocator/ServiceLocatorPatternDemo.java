package com.wno704.designpattern.j2ee.servicelocator;

import com.wno704.designpattern.j2ee.servicelocator.client.ServiceLocator;
import com.wno704.designpattern.j2ee.servicelocator.service.Service;

public class ServiceLocatorPatternDemo {

    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }

}
