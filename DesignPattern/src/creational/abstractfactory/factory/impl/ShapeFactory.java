package creational.abstractfactory.factory.impl;

import creational.abstractfactory.color.Color;
import creational.abstractfactory.factory.AbstractFactory;
import creational.abstractfactory.shape.Shape;
import creational.abstractfactory.shape.impl.Circle;
import creational.abstractfactory.shape.impl.Rectangle;
import creational.abstractfactory.shape.impl.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
