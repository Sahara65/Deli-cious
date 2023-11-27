package org.delicious.Sandwich;

public enum RegularToppings {
    LETTUCE("Lettuce", 0.0),
    ONION("Onion", 0.0),
    TOMATO("Tomato", 0.0),
    JALAPENO("Jalapeno", 0.0),
    CUCUMBER("Cucumber", 0.0),
    PICKLES("Pickles", 0.0),
    GUACAMOLE("Guacamole", 0.0),
    MUSHROOM("Mushroom", 0.0),
    MAYO("Mayo", 0.0),
    MUSTARD("Mustard", 0.0),
    KETCHUP("Ketchup", 0.0),
    RANCH("Ranch", 0.0),
    THOUSAND_ISLANDS("Thousand Islands", 0.0),
    VINAIGRETTE("Vinaigrette", 0.0),
    Au_Jus("Au Jus", 0.0),
    Sauce("Mushroom", 0.0);

    private final String getRegularToppingsName;
    private final double price;

    RegularToppings(String getRegularToppings, double price) {
        this.getRegularToppingsName = getRegularToppings;
        this.price = price;
    }

    public String getGetRegularToppingsName() {
        return getRegularToppingsName;
    }

    public double getPrice() {
        return price;
    }
}

