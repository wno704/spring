package com.wno704.designpattern.creational.builder.food.combo;

import com.wno704.designpattern.creational.builder.food.Item;
import com.wno704.designpattern.creational.builder.food.pack.Packing;
import com.wno704.designpattern.creational.builder.food.pack.impl.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}