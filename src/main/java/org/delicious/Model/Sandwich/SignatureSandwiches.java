package org.delicious.Model.Sandwich;

import java.util.ArrayList;
import java.util.List;

// Dipesh's Code
public class SignatureSandwiches {

    public static Sandwich createBLTSandwich() {

        Sandwich blt = new Sandwich(BreadSize.EIGHT_INCHES, BreadType.WHITE);
        blt.addPremiumTopping(PremiumToppings.BACON);
        blt.addRegularTopping(RegularToppings.LETTUCE);
        blt.addRegularTopping(RegularToppings.TOMATO);
        blt.addRegularTopping(RegularToppings.MAYO);
        return blt;
    }

    public static Sandwich createPhillyCheeseSteakSandwich() {
        Sandwich phillyCheeseSteak = new Sandwich(BreadSize.EIGHT_INCHES, BreadType.WHITE);
        phillyCheeseSteak.addPremiumTopping(PremiumToppings.STEAK);
        phillyCheeseSteak.addPremiumTopping(PremiumToppings.PROVOLONE);
        phillyCheeseSteak.addRegularTopping(RegularToppings.ONION);
        phillyCheeseSteak.addRegularTopping(RegularToppings.MUSHROOM);
        return phillyCheeseSteak;
    }
}
