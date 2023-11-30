package org.delicious.model.sides;

public enum DrinkType {
    Coke_Cola("Coke Cola"),
    Sprite("Sprite"),
    Fanta("Fanta"),
    Water("Water"),
    Pepsi("Pepsi"),
    DrPepper("Dr. Pepper");

    private final String drinkName;

    DrinkType(String name) {
        this.drinkName = name;
    }

    public String getDrinkName() {
        return drinkName;
    }
}
