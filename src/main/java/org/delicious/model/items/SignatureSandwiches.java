package org.delicious.model.items;

public class SignatureSandwiches {

    public static Sandwich createBLTSandwich() {

        /*Sandwich blt = new Sandwich(BreadSize.EIGHT_INCH, BreadType.WHITE, false);
        blt.addPremiumTopping(new PremiumTopping(MeatTopping.BACON, true));
        blt.addRegularTopping();
        blt.addRegularTopping(RegularTopping.TOMATO);
        blt.addRegularTopping(RegularTopping.MAYO);
        return blt;
    }

    public static Sandwich createPhillyCheeseSteakSandwich() {
        Sandwich phillyCheeseSteak = new Sandwich(BreadSize.EIGHT_INCH, BreadType.WHITE, false);
        //phillyCheeseSteak.addPremiumTopping(MeatTopping.STEAK);
        //phillyCheeseSteak.addPremiumTopping(CheeseTopping.PROVOLONE);
        phillyCheeseSteak.addRegularTopping(RegularTopping.ONION);
        phillyCheeseSteak.addRegularTopping(RegularTopping.MUSHROOM);
        return phillyCheeseSteak;
    }
         */

        return new Sandwich(BreadSize.FOUR_INCH, BreadType.RYE);
    }
}
