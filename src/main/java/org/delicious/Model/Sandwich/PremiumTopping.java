package org.delicious.Model.Sandwich;

public class PremiumTopping extends Toppings{
    //Generic enum so we can use MeatTopping and CheeseTopping interchangeably
    private final Enum<?> toppingType;
    private boolean isExtra;
    private boolean isMeat;
    private final String type;
    public PremiumTopping(Enum<?> toppingType, boolean isMeat) {
        this.toppingType = toppingType;
        this.isMeat = true;
        this.type =
    }

    public Enum<?> getToppingType() {
        return toppingType;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }

    public boolean isExtra() {
        return isExtra;
    }

    @Override
    public String toString(){

        Class<?> enumClass = toppingType.getDeclaringClass();


        if(isExtra){
            return "EXTRA_" + toppingType.name().toUpperCase();
        }else{
            return toppingType.name().toUpperCase();
        }
    }
}
