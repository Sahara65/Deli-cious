package org.delicious.Model.Sides;

public enum DrinkType {
    COCA_COLA("Coke Cola"),
    SPRITE("Sprite"),
    FANTA("Fanta"),
    WATER("Water"),
    PEPSI("Pepsi"),
    DR_PEPPER("Dr. Pepper");

    private final String drinkName;

    DrinkType(String name) {
        this.drinkName = name;
    }

    public String getDrinkName() {
        return drinkName;
    }
}
