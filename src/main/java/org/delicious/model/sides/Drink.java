package org.delicious.model.sides;

import org.delicious.model.order.OrderedItem;

public class Drink implements OrderedItem {
    private final DrinkType type;
    private final DrinkSize size;

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

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getOrderInformation() {
        return null;
    }
}
