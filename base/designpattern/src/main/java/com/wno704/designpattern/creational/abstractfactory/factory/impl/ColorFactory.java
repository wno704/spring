package com.wno704.designpattern.creational.abstractfactory.factory.impl;

import com.wno704.designpattern.creational.abstractfactory.color.Color;
import com.wno704.designpattern.creational.abstractfactory.color.impl.Blue;
import com.wno704.designpattern.creational.abstractfactory.color.impl.Green;
import com.wno704.designpattern.creational.abstractfactory.color.impl.Red;
import com.wno704.designpattern.creational.abstractfactory.factory.AbstractFactory;
import com.wno704.designpattern.creational.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
