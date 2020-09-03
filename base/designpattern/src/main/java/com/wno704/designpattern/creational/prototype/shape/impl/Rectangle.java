package com.wno704.designpattern.creational.prototype.shape.impl;

import com.wno704.designpattern.creational.prototype.shape.Shape;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
