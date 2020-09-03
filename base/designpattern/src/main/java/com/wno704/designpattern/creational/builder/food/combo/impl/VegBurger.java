package com.wno704.designpattern.creational.builder.food.combo.impl;

import com.wno704.designpattern.creational.builder.food.combo.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
