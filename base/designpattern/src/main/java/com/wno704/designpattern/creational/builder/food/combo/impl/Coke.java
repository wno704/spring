package com.wno704.designpattern.creational.builder.food.combo.impl;

import com.wno704.designpattern.creational.builder.food.combo.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
