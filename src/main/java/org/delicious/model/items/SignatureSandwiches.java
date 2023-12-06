package org.delicious.model.items;

import java.util.List;

public class SignatureSandwiches {

    public static Sandwich createBLTSandwich() {

        Sandwich blt = new Sandwich(BreadSize.EIGHT_INCH, BreadType.WHITE);
        blt.addPremiumTopping(new PremiumTopping("Bacon"));
        blt.addPremiumTopping(new PremiumTopping("Cheese"));
        List<RegularTopping> regularToppings = List.of(new RegularTopping("Lettuce"), new RegularTopping("Tomato"),
                new RegularTopping("Ranch"));
        blt.addAllRegularToppings(regularToppings);
        blt.setToasted(true);
        return blt;
    }

    public static Sandwich createPhillyCheeseSteakSandwich() {
        Sandwich phillyCheeseSteak = new Sandwich(BreadSize.EIGHT_INCH, BreadType.WHITE);
        phillyCheeseSteak.addPremiumTopping(new PremiumTopping("Steak"));
        phillyCheeseSteak.addPremiumTopping(new PremiumTopping("American Cheese"));
        List<RegularTopping> regularToppings = List.of(new RegularTopping("Peppers"), new RegularTopping("Mayo"));

        phillyCheeseSteak.setToasted(true);
        return phillyCheeseSteak;
    }

}

