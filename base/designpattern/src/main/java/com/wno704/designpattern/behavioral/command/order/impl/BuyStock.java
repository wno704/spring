package com.wno704.designpattern.behavioral.command.order.impl;

import com.wno704.designpattern.behavioral.command.stock.Stock;
import com.wno704.designpattern.behavioral.command.order.Order;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}