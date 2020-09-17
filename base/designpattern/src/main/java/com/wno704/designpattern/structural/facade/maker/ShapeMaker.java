package com.wno704.designpattern.structural.facade.maker;

import com.wno704.designpattern.structural.facade.shape.Shape;
import com.wno704.designpattern.structural.facade.shape.impl.Circle;
import com.wno704.designpattern.structural.facade.shape.impl.Rectangle;
import com.wno704.designpattern.structural.facade.shape.impl.Square;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
