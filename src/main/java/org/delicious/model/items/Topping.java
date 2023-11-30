package org.delicious.model.items;

// Dipesh's Code
public abstract class Topping {

    private String name;
    private double price;

    // Public Getter for price
    public abstract String getName();

    public abstract double getPrice();
    public abstract String priceLookupString();

    @Override
    public String toString() {
        return "    -" + name.toUpperCase();
    }
}
