package org.delicious.model.items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// TODO - Need to work on pricing
public class RegularTopping extends Topping {
    private static final ArrayList<String> REGULAR_TOPPINGS =
            new ArrayList<>(List.of("Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers", "Pickles", "Guacamole", "Mushrooms"));
    private static final ArrayList<String> SAUCES =
            new ArrayList<>(List.of("Mayo", "Mustard", "Ketchup", "Ranch", "Thousand Islands", "Vinaigrette"));

    private static final ArrayList<String> SIDES =
            new ArrayList<>(List.of("Au Jus", "Sauce"));



//    private String typeOfTopping;


    //make sure to check that the name exists in the ArrayLists before implementing the constructor
    public RegularTopping(String name) {
        super(name);

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



    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String priceLookupString() {
        return null;
    }
}
