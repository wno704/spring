package com.wno704.designpattern.behavioral.state;

import com.wno704.designpattern.behavioral.state.context.Context;
import com.wno704.designpattern.behavioral.state.state.impl.StartState;
import com.wno704.designpattern.behavioral.state.state.impl.StopState;

public class StateDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
