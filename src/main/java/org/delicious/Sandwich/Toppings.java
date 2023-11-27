package org.delicious.Sandwich;


public enum ToppingType {
    REGULAR,
    SAUCE,
    SIDE,
    MEAT, // Premium
    CHEESE // Premium
}



public class Toppings {
    private String name;
    private ToppingType type;
    private double price;

    // Constructor
    public Toppings(String name, ToppingType type, double price) {
        this.setName(name);
        this.setType(type);
        this.setPrice(price);
    }

    // Private Getter for name
    private String getName() {
        return name;
    }

    // Private Setter for name
    private void setName(String name) {
        this.name = name;
    }

    // Private Getter for type
    private ToppingType getType() {
        return type;
    }

    // Private Setter for type
    private void setType(ToppingType type) {
        this.type = type;
    }

    // Private Getter for price
    private double getPrice() {
        return price;
    }

    // Private Setter for price
    private void setPrice(double price) {
        this.price = price;
    }

    // Method to check if the topping is premium
    public boolean isPremium() {
        return type == ToppingType.MEAT || type == ToppingType.CHEESE;
    }

    // ToString method for easy printing
    @Override
    public String toString() {
        return "Toppings{" +
               "name='" + this.getName() + '\'' +
               ", type=" + this.getType() +
               ", price=" + this.getPrice() +
               ", isPremium=" + this.isPremium() +
               '}';
    }
}
