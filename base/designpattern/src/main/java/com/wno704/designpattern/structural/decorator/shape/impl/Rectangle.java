package com.wno704.designpattern.structural.decorator.shape.impl;

import com.wno704.designpattern.structural.decorator.shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
