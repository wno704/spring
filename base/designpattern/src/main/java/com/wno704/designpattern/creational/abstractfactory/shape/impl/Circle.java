package com.wno704.designpattern.creational.abstractfactory.shape.impl;

import com.wno704.designpattern.creational.abstractfactory.shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}