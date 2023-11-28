package org.delicious.Model.Sides;

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
