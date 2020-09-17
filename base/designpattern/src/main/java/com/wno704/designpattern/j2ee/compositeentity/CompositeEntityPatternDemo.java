package com.wno704.designpattern.j2ee.compositeentity;

import com.wno704.designpattern.j2ee.compositeentity.client.Client;

public class CompositeEntityPatternDemo {

    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }

}
