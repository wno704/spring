package com.wno704.designpattern.creational.abstractfactory.producer;

import com.wno704.designpattern.creational.abstractfactory.factory.AbstractFactory;
import com.wno704.designpattern.creational.abstractfactory.factory.impl.ColorFactory;
import com.wno704.designpattern.creational.abstractfactory.factory.impl.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
