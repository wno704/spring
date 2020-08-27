package creational.abstractfactory.producer;

import creational.abstractfactory.factory.AbstractFactory;
import creational.abstractfactory.factory.impl.ColorFactory;
import creational.abstractfactory.factory.impl.ShapeFactory;

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
