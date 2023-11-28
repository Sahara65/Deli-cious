
package org.delicious.Model.Sandwich;

import org.delicious.Model.Sandwich.BreadSize;
import org.delicious.Model.Sandwich.BreadType;
import org.delicious.Model.Sandwich.PremiumToppings;
import org.delicious.Model.Sandwich.RegularToppings;
import java.util.ArrayList;
import java.util.List;


public class Sandwich {
    private BreadSize size;
    private BreadType breadType;
    private List<PremiumToppings> premiumToppings;
    private List<RegularToppings> regularToppings;
    private boolean isToasted;


    public Sandwich(BreadSize size, BreadType breadType) {
        this.size = size;
        this.breadType = breadType;
        this.premiumToppings = new ArrayList<>();
        this.regularToppings = new ArrayList<>();
        this.isToasted = false;
    }




    public void addPremiumTopping(PremiumToppings topping) {
        this.premiumToppings.add(topping);
    }


    public void addRegularTopping(RegularToppings topping) {
        this.regularToppings.add(topping);
    }


    public double calculatePrice() {
        double price = breadType.getPrice();

        for (PremiumToppings topping : premiumToppings) {

            price += topping.getPrice();

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
            description.append(topping.getName()).append(", ");
        }
        description.append("\nRegular Toppings: ");
        for (RegularToppings topping : regularToppings) {
            description.append(topping.getName()).append(", ");
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
