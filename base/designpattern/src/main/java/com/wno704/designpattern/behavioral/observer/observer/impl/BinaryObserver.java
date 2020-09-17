package com.wno704.designpattern.behavioral.observer.observer.impl;

import com.wno704.designpattern.behavioral.observer.observer.Observer;
import com.wno704.designpattern.behavioral.observer.subject.Subject;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
