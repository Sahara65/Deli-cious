package org.delicious.Model.Sandwich;

public enum PremiumToppings {
    STEAK("Steak"),
    HAM("Ham"),
    CHICKEN("Chicken"),
    SALAMI("Salami"),
    ROAST_BEEF("Roast Beef"),
    BACON("Bacon"),

    AMERICAN("American Cheese"),
    CHEDDAR("Cheddar Cheese"),
    PROVOLONE("Provolone Cheese"),
    SWISS("Swiss");

    private final String premiumToppingsName;

    PremiumToppings(String getPremiumToppingsName) {
        this.premiumToppingsName = getPremiumToppingsName;
    }

    public String getPremiumToppingsName() {
        return premiumToppingsName;
    }

}
