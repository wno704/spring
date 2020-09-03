package com.wno704.designpattern.creational.builder.food;

import com.wno704.designpattern.creational.builder.food.pack.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
