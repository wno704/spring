package com.wno704.designpattern.j2ee.businessdelegate.lookup;

import com.wno704.designpattern.j2ee.businessdelegate.service.BusinessService;
import com.wno704.designpattern.j2ee.businessdelegate.service.impl.EJBService;
import com.wno704.designpattern.j2ee.businessdelegate.service.impl.JMSService;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
