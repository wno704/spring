package com.wno704.designpattern.behavioral.command;

import com.wno704.designpattern.behavioral.command.broker.Broker;
import com.wno704.designpattern.behavioral.command.order.impl.BuyStock;
import com.wno704.designpattern.behavioral.command.order.impl.SellStock;
import com.wno704.designpattern.behavioral.command.stock.Stock;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
