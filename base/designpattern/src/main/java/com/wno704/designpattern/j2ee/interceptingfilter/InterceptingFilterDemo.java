package com.wno704.designpattern.j2ee.interceptingfilter;

import com.wno704.designpattern.j2ee.interceptingfilter.client.Client;
import com.wno704.designpattern.j2ee.interceptingfilter.filter.impl.AuthenticationFilter;
import com.wno704.designpattern.j2ee.interceptingfilter.filter.impl.DebugFilter;
import com.wno704.designpattern.j2ee.interceptingfilter.manager.FilterManager;
import com.wno704.designpattern.j2ee.interceptingfilter.target.Target;

public class InterceptingFilterDemo {

    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }

}
