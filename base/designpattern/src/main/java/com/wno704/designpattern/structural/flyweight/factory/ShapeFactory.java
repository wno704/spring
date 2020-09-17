package com.wno704.designpattern.structural.flyweight.factory;

import com.wno704.designpattern.structural.flyweight.shape.Shape;
import com.wno704.designpattern.structural.flyweight.shape.impl.Circle;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
