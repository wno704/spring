package com.wno704.designpattern.behavioral.chain.logger.impl;

import com.wno704.designpattern.behavioral.chain.logger.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
