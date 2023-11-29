package org.delicious.Model.Sandwich;

// Dipesh's Code
public abstract class Toppings {
    private double price;

    public Toppings(String name, ToppingType type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ToppingType getType() {
        return type;
    }

    public void setType(ToppingType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPremium() {
        return type == ToppingType.MEAT || type == ToppingType.CHEESE;
    }


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