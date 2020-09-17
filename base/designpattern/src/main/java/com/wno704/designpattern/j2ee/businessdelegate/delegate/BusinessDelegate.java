package com.wno704.designpattern.j2ee.businessdelegate.delegate;

import com.wno704.designpattern.j2ee.businessdelegate.lookup.BusinessLookUp;
import com.wno704.designpattern.j2ee.businessdelegate.service.BusinessService;

public class BusinessDelegate {

    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
