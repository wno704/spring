package com.wno704.designpattern.creational.abstractfactory.color.impl;

import com.wno704.designpattern.creational.abstractfactory.color.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
