package com.wno704.designpattern.creational.singleton.single;

public class SingletonThree {
    private static SingletonThree instance = new SingletonThree();
    private SingletonThree (){}
    public static SingletonThree getInstance() {
        return instance;
    }
}
