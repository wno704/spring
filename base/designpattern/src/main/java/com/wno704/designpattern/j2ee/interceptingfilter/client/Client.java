package com.wno704.designpattern.j2ee.interceptingfilter.client;

import com.wno704.designpattern.j2ee.interceptingfilter.manager.FilterManager;

public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }

}
