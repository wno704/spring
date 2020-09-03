package com.wno704.designpattern.creational.builder.food.combo.impl;

import com.wno704.designpattern.creational.builder.food.combo.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
