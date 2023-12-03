package org.delicious.model.sides;

import org.delicious.model.io.PriceLoader;
import org.delicious.model.order.OrderedItem;

import java.util.HashMap;

// TODO: Fix pricing for Drink

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
        PriceLoader priceLoader = new PriceLoader("data/price.csv");
        HashMap<String, Double> prices = priceLoader.getPrices();

        return prices.get(getSize().name() +"_DRINK");
    }

    @Override
    public String getOrderInformation() {
        return null;
    }
}
