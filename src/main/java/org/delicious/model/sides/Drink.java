package org.delicious.model.sides;

import org.delicious.model.io.PriceLoader;
import org.delicious.model.order.OrderedItem;

import java.util.HashMap;

// TODO: Fix pricing for Drink

public record Drink(DrinkType type, DrinkSize size) implements OrderedItem {

    @Override
    public double getPrice() {
        PriceLoader priceLoader = new PriceLoader("data/price.csv");
        HashMap<String, Double> prices = priceLoader.getPrices();

        return prices.get(size().name() + "_DRINK");
    }

    @Override
    public String getOrderInformation() {
        return null;
    }
}
