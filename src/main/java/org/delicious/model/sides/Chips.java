package org.delicious.model.sides;

public class Chips {
    private final ChipType type;

    public Chips(ChipType type) {
        this.type = type;
    }

    public ChipType getType() {
        return type;
    }
}
