package com.wno704.designpattern.j2ee.interceptingfilter.target;

public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
