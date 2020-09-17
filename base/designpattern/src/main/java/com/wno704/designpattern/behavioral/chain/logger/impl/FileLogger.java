package com.wno704.designpattern.behavioral.chain.logger.impl;

import com.wno704.designpattern.behavioral.chain.logger.AbstractLogger;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}