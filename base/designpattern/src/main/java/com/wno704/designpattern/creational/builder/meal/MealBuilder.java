package com.wno704.designpattern.creational.builder.meal;

import com.wno704.designpattern.creational.builder.food.combo.impl.ChickenBurger;
import com.wno704.designpattern.creational.builder.food.combo.impl.Coke;
import com.wno704.designpattern.creational.builder.food.combo.impl.Pepsi;
import com.wno704.designpattern.creational.builder.food.combo.impl.VegBurger;

public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
