package com.wno704.designpattern.structural.facade;

import com.wno704.designpattern.structural.facade.maker.ShapeMaker;

public class FacadePatternDemo {

    public static void main(String[] args){
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
