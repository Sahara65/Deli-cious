package org.delicious.model.items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RegularTopping {
    private static final ArrayList<String> REGULAR_TOPPINGS =
            new ArrayList<>(List.of("Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers", "Pickles", "Guacamole", "Mushrooms"));
    private static final ArrayList<String> SAUCES =
            new ArrayList<>(List.of("Mayo", "Mustard", "Ketchup", "Ranch", "Thousand Islands", "Vinaigrette"));

    private static final ArrayList<String> SIDES =
            new ArrayList<>(List.of("Au Jus", "Sauce"));

    private static final HashMap<String, Integer> count = new HashMap<>();
    private final String name;
//    private String typeOfTopping;


    //make sure to check that the name exists in the ArrayLists before implementing the constructor
    public RegularTopping(String name) {
        this.name = name;

//        if (MEAT.contains(name)) {
//            this.typeOfTopping = "MEAT";
//        } else {
//            this.typeOfTopping = "CHEESE";
//        }

        /*
        if((count.getOrDefault(name, 0) + 1) == 2){
            isExtra = true;
        }
         */
    }

    public String toString() {
        return "";
    }

    public ArrayList<String> getRegularToppings() {
        return REGULAR_TOPPINGS;
    }

    public ArrayList<String> getSauces() {
        return SAUCES;
    }
    public ArrayList<String> getSides() {
        return SAUCES;
    }

    public HashMap<String, Integer> getCount() {
        return count;
    }

    public String getName() {
        return name;
    }
}
