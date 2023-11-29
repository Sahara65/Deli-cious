package org.delicious.Model.Sandwich;

public class SignatureSandwiches {

    public static Sandwich createBLTSandwich(){

        Sandwich blt = new Sandwich(BreadSize.EIGHT_INCH, BreadType.WHITE, false);
        //blt.addPremiumTopping(PremiumTopping.BACON);
        //blt.addRegularTopping(RegularTopping.LETTUCE);
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


}
