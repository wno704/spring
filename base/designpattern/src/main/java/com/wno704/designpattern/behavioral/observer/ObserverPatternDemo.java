package com.wno704.designpattern.behavioral.observer;

import com.wno704.designpattern.behavioral.observer.observer.impl.BinaryObserver;
import com.wno704.designpattern.behavioral.observer.observer.impl.HexaObserver;
import com.wno704.designpattern.behavioral.observer.observer.impl.OctalObserver;
import com.wno704.designpattern.behavioral.observer.subject.Subject;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

}
