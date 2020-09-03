package com.wno704.designpattern.creational.abstractfactory.factory;

import com.wno704.designpattern.creational.abstractfactory.color.Color;
import com.wno704.designpattern.creational.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
