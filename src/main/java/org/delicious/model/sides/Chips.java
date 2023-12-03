package org.delicious.model.sides;

import org.delicious.model.io.PriceLoader;
import org.delicious.model.order.OrderedItem;

import java.util.HashMap;

public class Chips implements OrderedItem {
    private final ChipType type;

    public Chips(ChipType type) {
        this.type = type;
    }

    public ChipType getType() {
        return type;
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
