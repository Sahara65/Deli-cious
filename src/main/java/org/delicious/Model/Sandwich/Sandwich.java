
package org.delicious.Model.Sandwich;

import org.delicious.Model.IO.PriceLoader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sandwich {
    private final BreadSize size;
    private final BreadType breadType;
    private final boolean isToasted;
    private final List<PremiumTopping> premiumToppings;
    private final List<RegularTopping> regularToppings;



    public Sandwich(BreadSize size, BreadType breadType, boolean isToasted) {
        this.size = size;
        this.breadType = breadType;
        this.isToasted = false;
        this.premiumToppings = new ArrayList<PremiumTopping>();
        this.regularToppings = new ArrayList<RegularTopping>();
    }




    public void addPremiumTopping(PremiumTopping topping) {
        this.premiumToppings.add(topping);
    }


    public void addRegularTopping(RegularTopping topping) {
        this.regularToppings.add(topping);
    }


    public double getPrice() {
        PriceLoader loader = new PriceLoader();
        HashMap<String, Double> map = loader.getPrices();
        double price = breadType.getPrice();

        for (PremiumTopping topping : premiumToppings) {

            price += map.get(size + "_" + topping.toString());

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
                ", isToasted=" + isToasted +
                '}';
    }
}
