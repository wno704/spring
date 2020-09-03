package com.wno704.designpattern.creational.abstractfactory.shape.impl;

import com.wno704.designpattern.creational.abstractfactory.shape.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
