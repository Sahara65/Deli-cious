package org.delicious.model.items;

// Dipesh's Code
public abstract class Topping {

    private String name;

    public Topping(String name) {
        this.name = name;
    }
// Public Getter for price

    public String getName() {
        return name;
    }

    public abstract double getPrice();

    public abstract String priceLookupString();

    @Override
    public String toString() {
        return "    -" + name.toUpperCase();
    }
}