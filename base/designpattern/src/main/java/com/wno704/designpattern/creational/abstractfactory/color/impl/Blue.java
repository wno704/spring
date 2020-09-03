package com.wno704.designpattern.creational.abstractfactory.color.impl;

import com.wno704.designpattern.creational.abstractfactory.color.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}