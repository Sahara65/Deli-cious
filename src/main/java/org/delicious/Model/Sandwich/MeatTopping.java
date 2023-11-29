package org.delicious.Model.Sandwich;

public enum MeatTopping{
    STEAK("Steak"),
    HAM("Ham"),
    CHICKEN("Chicken"),
    SALAMI("Salami"),
    ROAST_BEEF("Roast Beef"),
    BACON("Bacon"),
    ;

    private final String toppingName;

    MeatTopping(String toppingName) {
        this.toppingName = toppingName;
    }

    public String getToppingName() {
        return toppingName;
    }

}
