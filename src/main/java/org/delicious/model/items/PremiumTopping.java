package org.delicious.model.items;

import java.util.ArrayList;
import java.util.List;

// TODO - Need to work on pricing
public class PremiumTopping extends Topping {
    private static final ArrayList<String> MEAT =
            new ArrayList<>(List.of("Steak", "Ham", "Chicken", "Salami", "Roast Beef", "Bacon"));
    private static final ArrayList<String> CHEESE =
            new ArrayList<>(List.of("American Cheese", "Cheddar Cheese", "Provolone Cheese", "Swiss Cheese"));
    // Making it so that reference can not be reassigned for the hashmap, not making it immutable

    private boolean isExtra;
    private String typeOfTopping;


    //make sure to check that the name exists in the ArrayLists before implementing the constructor
    public PremiumTopping(String name) {
        super(name);
        // TODO for this test to work, make sure that contains works properly
        if (MEAT.contains(name)) {
            this.typeOfTopping = "MEAT";
        } else {
            this.typeOfTopping = "CHEESE";
        }
    }

    public void setExtra(boolean extra) {
        this.isExtra = extra;
    }

    boolean isExtra() {
        return this.isExtra;
    }

    public String priceLookupString() {
        if (isExtra) {
            return "EXTRA_" + typeOfTopping;
        } else {
            return typeOfTopping;
        }
    }
    @Override
    public String toString() {
        if(isExtra){
            return "Extra " + getName();
        }else{
            return getName();
        }
    }

    @Override
    public double getPrice() {
        // TODO must return a price
        return 0;
    }
}