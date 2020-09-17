package com.wno704.designpattern.behavioral.state.context;

import com.wno704.designpattern.behavioral.state.state.State;

public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
