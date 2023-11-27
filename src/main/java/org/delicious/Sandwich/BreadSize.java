package org.delicious.Sandwich;

public enum BreadSize {
    Four_Inches(4),
    Eight_Inches(8),
    Twelve_Inches(12);

    private final int size;

    BreadSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
