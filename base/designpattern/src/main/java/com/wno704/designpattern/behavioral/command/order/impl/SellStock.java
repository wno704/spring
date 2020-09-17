package com.wno704.designpattern.behavioral.command.order.impl;

import com.wno704.designpattern.behavioral.command.stock.Stock;
import com.wno704.designpattern.behavioral.command.order.Order;

public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }


    @Override
    public void execute() {
        abcStock.sell();
    }
}
