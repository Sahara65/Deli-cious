package org.delicious.Sandwich;

public enum PremiumToppings {
    STEAK("Steak", 1.00),
    HAM("Ham", 1.00),
    CHICKEN("Chicken", 1.00),
    SALAMI("Salami", 1.00),
    ROAST_BEEF("Roast Beef", 1.00),
    BACON("Bacon", 1.00),

    AMERICAN("American Cheese", .75),
    CHEDDAR("Cheddar Cheese", .75),
    PROVOLONE("Provolone Cheese", .75),
    SWISS("Swiss", .75);

    private final String getPremiumToppingsName;
    private final double price;

    PremiumToppings(String getPremiumToppingsName, double price) {
        this.getPremiumToppingsName = getPremiumToppingsName;
        this.price = price;
    }

    public String getGetPremiumToppingsName() {
        return getPremiumToppingsName;
    }

    public double getPrice() {
        return price;
    }
}
