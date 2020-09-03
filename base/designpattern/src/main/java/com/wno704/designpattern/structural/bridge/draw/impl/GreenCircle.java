package com.wno704.designpattern.structural.bridge.draw.impl;

import com.wno704.designpattern.structural.bridge.draw.DrawAPI;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
