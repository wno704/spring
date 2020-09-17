package com.wno704.designpattern.structural.decorator.shape.impl;

import com.wno704.designpattern.structural.decorator.shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
