package org.delicious.Model.Sandwich;

public enum BreadSize {
    FOUR_INCH(4),
    EIGHT_INCH(8),
    TWELVE_INCH(12);

    private final int size;

    BreadSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
