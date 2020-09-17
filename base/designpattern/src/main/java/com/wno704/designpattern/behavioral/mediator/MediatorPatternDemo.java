package com.wno704.designpattern.behavioral.mediator;

import com.wno704.designpattern.behavioral.mediator.model.User;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
