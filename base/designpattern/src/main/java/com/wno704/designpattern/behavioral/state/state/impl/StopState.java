package com.wno704.designpattern.behavioral.state.state.impl;

import com.wno704.designpattern.behavioral.state.context.Context;
import com.wno704.designpattern.behavioral.state.state.State;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
