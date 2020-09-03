package com.wno704.designpattern.creational.factory.shape.impl;


import com.wno704.designpattern.creational.factory.shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
