package creational.abstractfactory.factory.impl;

import creational.abstractfactory.color.Color;
import creational.abstractfactory.color.impl.Blue;
import creational.abstractfactory.color.impl.Green;
import creational.abstractfactory.color.impl.Red;
import creational.abstractfactory.factory.AbstractFactory;
import creational.abstractfactory.shape.Shape;

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
