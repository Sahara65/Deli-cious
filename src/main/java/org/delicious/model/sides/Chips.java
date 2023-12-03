package org.delicious.model.sides;

import org.delicious.model.io.PriceLoader;
import org.delicious.model.order.OrderedItem;

import java.util.HashMap;

// TODO: Fix pricing for chips

public class Chips implements OrderedItem {
    private final ChipType chipType;

    public Chips(ChipType chipType) {
        this.chipType = chipType;
    }

    @Override
    public double getPrice() {
        //Possibly adjustable if we had different chip prices but not necessary for now since all chips
        // are the same price
        PriceLoader priceLoader = new PriceLoader("data/price.csv");
        HashMap<String, Double> prices = priceLoader.getPrices();

        return prices.get("CHIPS");
    }

    public String getOrderInformation() {
        return chipType.getChipName();
    }
}
