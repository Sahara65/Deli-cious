
package org.delicious.Model.Sandwich;

import org.delicious.Model.Sandwich.BreadSize;
import org.delicious.Model.Sandwich.BreadType;
import org.delicious.Model.Sandwich.PremiumToppings;
import org.delicious.Model.Sandwich.RegularToppings;
import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private final BreadSize size;
    private final BreadType breadType;
    private final List<PremiumToppings> premiumToppings;
    private final List<RegularToppings> regularToppings;

    // Constructor
    public Sandwich(BreadSize size, BreadType breadType) {
        this.size = size;
        this.breadType = breadType;
        this.premiumToppings = new ArrayList<>();
        this.regularToppings = new ArrayList<>();
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

            price += 0; /* additional cost for premium topping */;
        }

        return price;
    }


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