package org.delicious.model.sides;

import org.delicious.model.io.PriceLoader;
import org.delicious.model.order.OrderedItem;

// TODO: Fix pricing for chips

public class Chips implements OrderedItem {
    private final ChipType chipType;

    public Chips(ChipType chipType) {
        this.chipType = chipType;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public String getOrderInformation() {
        return chipType.getChipName();
    }
}
