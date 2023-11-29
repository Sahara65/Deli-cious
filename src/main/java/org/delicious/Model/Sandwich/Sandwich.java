package org.delicious.Model.Sandwich;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Sandwich {
    private final BreadSize size;
    private final BreadType breadType;
    private final List<PremiumToppings> premiumToppings;
    private final List<RegularToppings> regularToppings;
    private final boolean isToasted;
    private Map<String, Double> toppingPrices;

    public Sandwich(BreadSize size, BreadType breadType) {
        this.size = size;
        this.breadType = breadType;
        this.premiumToppings = new ArrayList<>();
        this.regularToppings = new ArrayList<>();
        this.isToasted = false;
    }

    public void setToppingPrices(Map<String, Double> toppingPrices) {
        this.toppingPrices = toppingPrices;
    }

    public void addPremiumTopping(PremiumToppings topping) {
        this.premiumToppings.add(topping);
    }

    public void addRegularTopping(RegularToppings topping) {
        this.regularToppings.add(topping);
    }

    public double calculatePrice() {
        double price = 0.0;
        String breadKey = size.toString() + "_BREAD";
        price += toppingPrices.getOrDefault(breadKey, 0.0);
        for (PremiumToppings topping : premiumToppings) {
            String toppingKey = size.toString() + "_" + topping.getPremiumToppingsName().toUpperCase();
            price += toppingPrices.getOrDefault(toppingKey, 0.0);
        }
        return price;
    }

    public String getDetailedDescription() {
        StringBuilder description = new StringBuilder();
        description.append("Sandwich - ").append(size).append(", ").append(breadType.getName());
        if (isToasted) {
            description.append(", Toasted");
        }
        description.append("\nPremium Toppings: ");
        for (PremiumToppings topping : premiumToppings) {
            description.append(topping.getPremiumToppingsName()).append(", ");
        }
        description.append("\nRegular Toppings: ");
        for (RegularToppings topping : regularToppings) {
            description.append(topping.getRegularToppingsName()).append(", ");
        }
        return description.toString().trim();
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "size=" + size +
                ", breadType=" + breadType +
                ", premiumToppings=" + premiumToppings +
                ", regularToppings=" + regularToppings +
                ", isToasted=" + isToasted +
                '}';
    }
}
