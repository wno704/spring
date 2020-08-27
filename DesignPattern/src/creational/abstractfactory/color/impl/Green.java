package creational.abstractfactory.color.impl;

import creational.abstractfactory.color.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}