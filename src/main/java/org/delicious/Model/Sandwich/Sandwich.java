
package org.delicious.Model.Sandwich;

import org.delicious.Model.Sandwich.BreadSize;
import org.delicious.Model.Sandwich.BreadType;
import org.delicious.Model.Sandwich.PremiumToppings;
import org.delicious.Model.Sandwich.RegularToppings;
import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private final BreadSize size;
    private final BreadType breadType; // Enum for the type of bread
    private final List<PremiumToppings> premiumToppings; // List of Premium Toppings
    private final List<RegularToppings> regularToppings; // List of Regular Toppings

    // Constructor
    public Sandwich(BreadSize size, BreadType breadType) {
        this.size = size;
        this.breadType = breadType;
        this.premiumToppings = new ArrayList<>(); // Initialize the premium toppings list
        this.regularToppings = new ArrayList<>(); // Initialize the regular toppings list
    }



    public void addPremiumTopping(PremiumToppings topping) {
        this.premiumToppings.add(topping);
    }


    public void addRegularTopping(RegularToppings topping) {
        this.regularToppings.add(topping);
    }


    public double calculatePrice() {
        double price = breadType.getPrice(); // Base price from the type of bread
        // Add additional cost for premium toppings
        for (PremiumToppings topping : premiumToppings) {
            // Assume a fixed additional cost for premium toppings or calculate as needed
            price += /* additional cost for premium topping */;
        }
        // Regular toppings can be assumed to be included in the base price
        return price;
    }

    // ToString method for easy printing
    @Override
    public String toString() {
        return "Sandwich{" +
                "size=" + size +
                ", breadType=" + breadType +
                ", premiumToppings=" + premiumToppings +
                ", regularToppings=" + regularToppings +
                '}';
    }
}