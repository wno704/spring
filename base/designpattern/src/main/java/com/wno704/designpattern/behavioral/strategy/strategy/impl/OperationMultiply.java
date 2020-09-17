package com.wno704.designpattern.behavioral.strategy.strategy.impl;

import com.wno704.designpattern.behavioral.strategy.strategy.Strategy;

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}