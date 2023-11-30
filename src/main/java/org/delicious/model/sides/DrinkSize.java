package org.delicious.model.sides;

public enum DrinkSize {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private final String size;

    DrinkSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
