package org.delicious.Model.Sandwich;

// Dipesh's Code
public abstract class Toppings {

    private double price;

    // Public Getter for price
    public double getPrice() {
        return price;
    }

    // Public Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "-";
    }
}