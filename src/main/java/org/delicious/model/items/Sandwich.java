package org.delicious.model.items;

import org.delicious.model.io.PriceLoader;
import org.delicious.model.order.OrderedItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("ALL")
public class Sandwich implements OrderedItem {
    private BreadSize size;
    private BreadType breadType;
    private List<Topping> toppings;
    private boolean isToasted;
    private double price;

    public void setSize(BreadSize size) {
        this.size = size;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

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

    public void addPremiumTopping(Topping topping) {
        this.toppings.add(topping);

    }

    public void addAllRegularToppings(List<RegularTopping> topping) {
        this.toppings.addAll(topping);
    }

//    System.out.printf("│ %15s     │ %-30s │ %-10.2f |\n",
//            " ", " "," ");

    @Override
    public String toString() {
        String toasted = isToasted ? "Toasted" : "";
        String header = String.format("%s %s\n%s", toasted, breadType.getName(), size);

        StringBuilder sb = new StringBuilder();
        for (Topping topping : toppings) {
            if (topping != null) {
                sb.append(String.format("\n    -%s", topping.getName()));
            }
        }
        String toppings = sb.toString();
        String price = String.format("%s", getPrice());

        return String.format("%s\n%s\n%s", header, toppings, price);
    }

    @Override
    public double getPrice() {
        if(price == 0) {
            PriceLoader priceLoader = new PriceLoader("data/price.csv");
            HashMap<String, Double> prices = priceLoader.getPrices();

            String breadKey = size.toString() + "_BREAD";

            price += prices.get(breadKey);
            for (Topping topping : toppings) {
                if (topping != null) {
                    String toppingKey = size.toString() + "_" + topping.priceLookupString();
                    price += prices.getOrDefault(toppingKey, 0.00);
                }
            }
        }
        return price;
    }
}