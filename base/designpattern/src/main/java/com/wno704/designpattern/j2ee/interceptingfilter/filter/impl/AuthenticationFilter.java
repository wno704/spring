package com.wno704.designpattern.j2ee.interceptingfilter.filter.impl;

import com.wno704.designpattern.j2ee.interceptingfilter.filter.Filter;

public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
