package com.wno704.designpattern.behavioral.nullobject.customer.impl;

import com.wno704.designpattern.behavioral.nullobject.customer.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
