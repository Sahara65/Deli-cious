package org.delicious.Sandwich;



package org.delicious.Sandwich;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String size; // e.g., "4 inch", "8 inch", "12 inch"
    private String breadType; // e.g., "white", "wheat", "rye", "wrap"
    private List<Toppings> toppings; // List of Toppings

    // Constructor
    public Sandwich(String size, String breadType) {
        this.size = size;
        this.breadType = breadType;
        this.toppings = new ArrayList<>(); // Initialize the toppings list
    }

    // Getter for size
    public String getSize() {
        return size;
    }

    // Setter for size
    public void setSize(String size) {
        this.size = size;
    }

    // Getter for breadType
    public String getBreadType() {
        return breadType;
    }

    // Setter for breadType
    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    // Getter for toppings
    public List<Toppings> getToppings() {
        return toppings;
    }

    // Method to add a topping
    public void addTopping(Toppings topping) {
        toppings.add(topping);
    }

    // Method to calculate the price of the sandwich
    public double calculatePrice() {
        double price = /* base price based on size and bread type */;
        for (Toppings topping : toppings) {
            price += topping.getPrice();
        }
        return price;
    }

    // ToString method for easy printing
    @Override
    public String toString() {
        return "Sandwich{" +
               "size='" + size + '\'' +
               ", breadType='" + breadType + '\'' +
               ", toppings=" + toppings +
               '}';
    }
}
