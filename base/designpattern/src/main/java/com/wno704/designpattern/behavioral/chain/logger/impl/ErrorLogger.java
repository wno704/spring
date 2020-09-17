package com.wno704.designpattern.behavioral.chain.logger.impl;

import com.wno704.designpattern.behavioral.chain.logger.AbstractLogger;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}