package org.delicious.Model.Sides;

import org.delicious.Model.Order.OrderedItem;

public class Drink {
    private DrinkType type;
    private DrinkSize size;

    public Drink(DrinkType type, DrinkSize size) {
        this.type = type;
        this.size = size;
    }

    public DrinkType getType() {
        return type;
    }

    public DrinkSize getSize() {
        return size;
    }
}
