package org.delicious.model.items;

import org.delicious.model.io.PriceLoader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("ALL")
public class Sandwich {
    private BreadSize size;
    private BreadType breadType;
    private List<Topping> toppings;
    private boolean isToasted;
    private double price;

    public Sandwich(BreadSize size, BreadType breadType) {
        this.size = size;
        this.breadType = breadType;
        this.toppings = new ArrayList<>();
        this.isToasted = false;
        this.price = 0.00;
    }

    public Sandwich(BreadSize size, BreadType breadType, List<Topping> topping, boolean isToasted, double price) {
        //finish later, will be used for custom sandwiches
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double calculatePrice() {

        PriceLoader priceLoader = new PriceLoader("data/price.csv");
        HashMap<String, Double> prices = priceLoader.getPrices();

        String breadKey = size.toString() + "_BREAD";

        price += prices.get(breadKey);
        for (Topping topping : toppings) {
            String toppingKey = size.toString() + "_" + topping.priceLookupString();
            price += prices.getOrDefault(toppingKey, 0.0);
        }

        return price;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "size=" + size +
                ", breadType=" + breadType +
                ", Toppings=" + toppings +
                ", isToasted=" + isToasted +
                '}';
    }
}