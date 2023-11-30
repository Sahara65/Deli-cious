package org.delicious.model.sandwich;

// Dipesh's Code
public abstract class Topping {

    private String name;
    private double price;

    // Public Getter for price
    public abstract double getName();


    @Override
    public String toString() {
        return "    -" + name.toUpperCase();
    }
}
