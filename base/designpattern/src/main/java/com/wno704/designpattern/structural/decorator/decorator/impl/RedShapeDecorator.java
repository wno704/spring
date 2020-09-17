package com.wno704.designpattern.structural.decorator.decorator.impl;

import com.wno704.designpattern.structural.decorator.decorator.ShapeDecorator;
import com.wno704.designpattern.structural.decorator.shape.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
