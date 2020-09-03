package com.wno704.designpattern.structural.bridge.shape;

import com.wno704.designpattern.structural.bridge.draw.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
