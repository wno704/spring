package com.wno704.designpattern.creational.builder.food.combo;

import com.wno704.designpattern.creational.builder.food.Item;
import com.wno704.designpattern.creational.builder.food.pack.Packing;
import com.wno704.designpattern.creational.builder.food.pack.impl.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
