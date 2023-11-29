package org.delicious.Model.Sides;

public enum ChipType {
    LAYS("Lays"),
    CHEETOS("Cheetos"),
    DORITOS("Doritos"),
    POPCORN("Popcorn"),
    NACHOS("Nachos");

    private final String chipName;

    ChipType(String chipName) {
        this.chipName = chipName;
    }

    public String getChipName() {
        return chipName;
    }
}
