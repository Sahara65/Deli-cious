package org.delicious.Model.Sandwich;

public enum RegularToppings {
    LETTUCE("Lettuce"),
    ONION("Onion"),
    TOMATO("Tomato"),
    JALAPENO("Jalapeno"),
    CUCUMBER("Cucumber"),
    PICKLES("Pickles"),
    GUACAMOLE("Guacamole"),
    MUSHROOM("Mushroom"),
    MAYO("Mayo"),
    MUSTARD("Mustard"),
    KETCHUP("Ketchup"),
    RANCH("Ranch"),
    THOUSAND_ISLANDS("Thousand Islands"),
    VINAIGRETTE("Vinaigrette"),
    Au_Jus("Au Jus"),
    Sauce("Mushroom");

    private final String regularToppingsName;


    RegularToppings(String getRegularToppings) {
        this.regularToppingsName = getRegularToppings;
    }

    public String getRegularToppingsName() {
        return regularToppingsName;
    }
}

