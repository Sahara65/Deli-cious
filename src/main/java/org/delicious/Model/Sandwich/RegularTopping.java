package org.delicious.Model.Sandwich;

public enum RegularTopping {
    LETTUCE("Lettuce"),
    PEPPER("Peppers"),
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
    AU_JUS("Au Jus"),
    SAUCE("Mushroom");

    private final String getRegularToppingsName;

    RegularTopping(String getRegularToppings) {
        this.getRegularToppingsName = getRegularToppings;
    }

    public String getGetRegularToppingsName() {
        return getRegularToppingsName;
    }
}

