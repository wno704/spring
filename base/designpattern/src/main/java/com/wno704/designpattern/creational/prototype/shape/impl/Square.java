package com.wno704.designpattern.creational.prototype.shape.impl;

import com.wno704.designpattern.creational.prototype.shape.Shape;

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}