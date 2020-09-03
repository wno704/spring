package com.wno704.designpattern.creational.prototype.shape.impl;

import com.wno704.designpattern.creational.prototype.shape.Shape;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}