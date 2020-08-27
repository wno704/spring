package creational.abstractfactory.factory;

import creational.abstractfactory.color.Color;
import creational.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
