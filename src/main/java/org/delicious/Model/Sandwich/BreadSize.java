package org.delicious.Model.Sandwich;

public enum BreadSize {
    FOUR_INCHES(4),
    EIGHT_INCHES(8),
    TWELVE_INCHES(12);

    private final int size;

    BreadSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
