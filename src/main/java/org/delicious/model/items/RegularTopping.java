package org.delicious.model.items;

import java.util.ArrayList;
import java.util.List;

public class RegularTopping extends Topping {
    private static final ArrayList<String> REGULAR_TOPPINGS =
            new ArrayList<>(List.of("Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers", "Pickles", "Guacamole", "Mushrooms"));
    private static final ArrayList<String> SAUCES =
            new ArrayList<>(List.of("Mayo", "Mustard", "Ketchup", "Ranch", "Thousand Islands", "Vinaigrette"));

    private static final ArrayList<String> SIDES =
            new ArrayList<>(List.of("Au Jus", "Sauce"));

    public RegularTopping(String name) {
        super(name);
    }

    public String toString() {
        return "";
    }

    @Override
    public double getPrice() {
        return 0;
    }
    //adding so that the HashSet knows how to check for equivalence. Used GPT for the equals method.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RegularTopping that = (RegularTopping) obj;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public String priceLookupString() {
        return "";
    }
}
