package com.wno704.designpattern.structural.facade.shape.impl;

import com.wno704.designpattern.structural.facade.shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
