package org.delicious.Model.Sandwich;

public enum MeatTopping implements PremiumTopping{
    STEAK("Steak", 0, false),
    HAM("Ham", 0, false),
    CHICKEN("Chicken", 0, false),
    SALAMI("Salami", 0, false),
    ROAST_BEEF("Roast Beef", 0, false),
    BACON("Bacon", 0),
    ;

    private final String toppingName;
    private int count;
    private boolean isExtra;

    MeatTopping(String toppingName, int count) {
        this.toppingName = toppingName;
        this.count = count;
    }

    public String getToppingName() {
        return toppingName;
    }

    @Override
    public Enum<?> getToppingType() {
        return null;
    }

    @Override
    public void setExtra(boolean extra) {

    }

    @Override
    public boolean isExtra() {
        return this.count == 2;

    }
}
