package creational.abstractfactory.shape.impl;

import creational.abstractfactory.shape.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
