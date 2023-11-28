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
        this.name = name;
        this.type = type;
        this.price = price;
    }

    // Public Getter for name
    public String getName() {
        return name;
    }

    // Public Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public Getter for type
    public ToppingType getType() {
        return type;
    }

    // Public Setter for type
    public void setType(ToppingType type) {
        this.type = type;
    }

    // Public Getter for price
    public double getPrice() {
        return price;
    }

    // Public Setter for price
    public void setPrice(double price) {
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
               "name='" + name + '\'' +
               ", type=" + type +
               ", price=" + price +
               ", isPremium=" + isPremium() +
               '}';
    }
}
