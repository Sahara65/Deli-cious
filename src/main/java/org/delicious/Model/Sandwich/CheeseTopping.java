package org.delicious.Model.Sandwich;

public enum CheeseTopping {

    AMERICAN("American Cheese"),
    CHEDDAR("Cheddar Cheese"),
    PROVOLONE("Provolone Cheese"),
    SWISS("Swiss");

    private final String toppingName;

    CheeseTopping(String toppingName) {
        this.toppingName = toppingName;
    }

    public String getToppingName() {
        return toppingName;
    }
}
