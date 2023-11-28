package org.delicious.Model.Sides;

import org.delicious.Model.Order.OrderedItem;

public enum Drink implements OrderedItem {
    ;
    private DrinkType type;
    private String name;
    private double price;


    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getOrderInformation() {
        return null;
    }
}
