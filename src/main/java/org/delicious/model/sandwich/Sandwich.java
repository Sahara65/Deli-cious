package org.delicious.model.sandwich;

import java.util.List;

public class Sandwich {
    private BreadSize size;
    private BreadType breadType;
    private List<Topping> toppings;
    private boolean isToasted;
    private double price;

    public Sandwich(BreadSize size, BreadType breadType, List<Topping> toppings, boolean isToasted) {
        this.size = size;
        this.breadType = breadType;
        this.toppings = toppings;
        this.isToasted = false;
    }

    public void addTopping(Topping topping) {
        this.premiumToppings.add(topping);
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
