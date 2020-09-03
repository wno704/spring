package com.wno704.designpattern.structural.bridge;

import com.wno704.designpattern.structural.bridge.draw.impl.GreenCircle;
import com.wno704.designpattern.structural.bridge.draw.impl.RedCircle;
import com.wno704.designpattern.structural.bridge.shape.Shape;
import com.wno704.designpattern.structural.bridge.shape.impl.Circle;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
