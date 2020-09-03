package com.wno704.designpattern.creational.singleton.single;

public class SingletonFour {
    private volatile static SingletonFour singleton;
    private SingletonFour (){}
    public static SingletonFour getSingleton() {
        if (singleton == null) {
            synchronized (SingletonFour.class) {
                if (singleton == null) {
                    singleton = new SingletonFour();
                }
            }
        }
        return singleton;
    }
}
