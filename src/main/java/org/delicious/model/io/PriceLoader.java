package org.delicious.model.io;

import java.util.HashMap;

public class PriceLoader extends DataLoader {
    private final HashMap<String, Double> prices = new HashMap<>();

    public void parseAndLoadLine(String data) {
        String[] priceLineArray = data.split(",");

        String itemName = priceLineArray[0];
        double price = Double.parseDouble(priceLineArray[1]);

        prices.put(itemName, price);
    }

    public HashMap<String, Double> getPrices() {
        return prices;
    }
}
