package com.wno704.designpattern.behavioral.observer.observer;

import com.wno704.designpattern.behavioral.observer.subject.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
