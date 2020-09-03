package com.wno704.designpattern.creational.builder.food.pack.impl;

import com.wno704.designpattern.creational.builder.food.pack.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
