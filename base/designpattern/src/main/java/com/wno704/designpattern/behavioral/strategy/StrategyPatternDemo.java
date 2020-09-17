package com.wno704.designpattern.behavioral.strategy;

import com.wno704.designpattern.behavioral.strategy.context.Context;
import com.wno704.designpattern.behavioral.strategy.strategy.impl.OperationAdd;
import com.wno704.designpattern.behavioral.strategy.strategy.impl.OperationMultiply;
import com.wno704.designpattern.behavioral.strategy.strategy.impl.OperationSubtract;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

}
