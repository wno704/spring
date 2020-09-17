package com.wno704.designpattern.behavioral.nullobject.customer.impl;

import com.wno704.designpattern.behavioral.nullobject.customer.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
