package org.delicious.Model.Sides;

import org.delicious.Model.Order.OrderedItem;

public class Chips {
    private final ChipType type;

    public Chips(ChipType type) {
        this.type = type;
    }

    public ChipType getType() {
        return type;
    }
}
