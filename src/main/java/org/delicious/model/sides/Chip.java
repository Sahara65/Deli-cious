package org.delicious.model.sides;

import org.delicious.model.io.PriceLoader;
import org.delicious.model.order.OrderedItem;

import java.util.HashMap;

public class Chip implements OrderedItem {
    private final ChipType chipType;

    public Chip(ChipType chipType) {
        this.chipType = chipType;
    }

    @Override
    public String toString() {
        String header = String.format("\n%s", chipType);
        String price = String.format("\n%s", getPrice());

        return String.format("%s\n%s", header, price);
    }

    @Override
    public double getPrice() {
        //Possibly adjustable if we had different chip prices but not necessary for now since all chips
        // are the same price
        PriceLoader priceLoader = new PriceLoader("data/price.csv");
        HashMap<String, Double> prices = priceLoader.getPrices();

        return prices.get("CHIPS");
    }


}
