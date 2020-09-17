package com.wno704.designpattern.behavioral.observer.observer.impl;

import com.wno704.designpattern.behavioral.observer.observer.Observer;
import com.wno704.designpattern.behavioral.observer.subject.Subject;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
