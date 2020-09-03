package com.wno704.designpattern.creational.builder.food.combo.impl;

import com.wno704.designpattern.creational.builder.food.combo.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
