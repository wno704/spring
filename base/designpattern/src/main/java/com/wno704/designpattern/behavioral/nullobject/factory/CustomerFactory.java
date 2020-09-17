package com.wno704.designpattern.behavioral.nullobject.factory;

import com.wno704.designpattern.behavioral.nullobject.customer.AbstractCustomer;
import com.wno704.designpattern.behavioral.nullobject.customer.impl.NullCustomer;
import com.wno704.designpattern.behavioral.nullobject.customer.impl.RealCustomer;

public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
