package creational.abstractfactory.color.impl;

import creational.abstractfactory.color.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
