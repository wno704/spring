package com.wno704.designpattern.structural.bridge.shape.impl;

import com.wno704.designpattern.structural.bridge.draw.DrawAPI;
import com.wno704.designpattern.structural.bridge.shape.Shape;

public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }

}
