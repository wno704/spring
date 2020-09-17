package com.wno704.designpattern.behavioral.strategy.context;

import com.wno704.designpattern.behavioral.strategy.strategy.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
