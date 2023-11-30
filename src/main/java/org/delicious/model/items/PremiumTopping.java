package org.delicious.model.items   ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PremiumTopping {
    private static final ArrayList<String> MEAT =
            new ArrayList<>(List.of("Steak", "Ham", "Chicken", "Salami", "Roast Beef", "Bacon"));
    private static final ArrayList<String> CHEESE =
            new ArrayList<>(List.of("American Cheese", "Cheddar Cheese", "Provolone Cheese", "Swiss"));
    //Making it so that reference can not be reassigned for the hashmap, not making it immutable
    private static final HashMap<String, Integer> count = new HashMap<>();
    private String name;
    private boolean isExtra;
    private String typeOfTopping;
    private double price;


    //make sure to check that the name exists in the ArrayLists before implementing the constructor
    PremiumTopping(String name, boolean isExtra) {
        this.name = name;
        this.isExtra = isExtra;
        if (MEAT.contains(name)) {
            this.typeOfTopping = "MEAT";
        } else {
            this.typeOfTopping = "CHEESE";
        }

        /*
        if((count.getOrDefault(name, 0) + 1) == 2){
            isExtra = true;
        }
         */
    }

    void setExtra(boolean extra) {
        this.isExtra = extra;
    }

    boolean isExtra() {
        return this.isExtra;
    }

    public String toString() {
        return "";
    }

    public String priceLookupString() {
        if (isExtra) {
            return "EXTRA_" + typeOfTopping;
        } else {
            return typeOfTopping;
        }
    }

    public ArrayList<String> getMEAT() {
        return MEAT;
    }

    public ArrayList<String> getCHEESE() {
        return CHEESE;
    }

    public HashMap<String, Integer> getCount() {
        return count;
    }

    public String getName() {
        return name;
    }
}