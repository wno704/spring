package com.wno704.designpattern.behavioral.memento.memto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Originator {

    private String state;

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
