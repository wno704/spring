package com.wno704.designpattern.creational.factory.factory;


import com.wno704.designpattern.creational.factory.shape.Shape;
import com.wno704.designpattern.creational.factory.shape.impl.Circle;
import com.wno704.designpattern.creational.factory.shape.impl.Rectangle;
import com.wno704.designpattern.creational.factory.shape.impl.Square;

public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
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
