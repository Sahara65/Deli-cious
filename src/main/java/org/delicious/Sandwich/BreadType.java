package org.delicious.Sandwich;

public enum BreadType {
    WHITE("White", 5.50),
    WHEAT("Wheat", 5.50),
    RYE("Rye", 5.50),
    WRAP("Wrap", 5.50);

    private final String name;
    private final double price;

    BreadType(String name, double price) {
        this.name = name();
        this.price = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
