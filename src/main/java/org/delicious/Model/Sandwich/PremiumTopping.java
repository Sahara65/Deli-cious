package org.delicious.Model.Sandwich;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PremiumTopping {
    private final ArrayList<String> MEAT =
            new ArrayList<>(List.of("Steak", "Ham", "Chicken", "Salami", "Roast Beef", "Bacon"));
    private final ArrayList<String> CHEESE =
            new ArrayList<>(List.of("American Cheese", "Cheddar Cheese", "Provolone Cheese", "Swiss"));
    //Making it so that reference can not be reassigned for the hashmap, not making it immutable
    private static final HashMap<String, Integer> count = new HashMap<>();
    private String name;
    private boolean isExtra;

    private String typeOfTopping;




    PremiumTopping(String name, boolean isExtra, ){
        this.name = name;
        if((count.getOrDefault(name, 0) + 1) == 2){
            isExtra = true;
        }
    }



    void setExtra(boolean extra){
        this.isExtra = extra;
    };

    boolean isExtra(){return this.isExtra;};


    public String toString(){
        return "";
    };

    public String priceLookupString(){
        return "";
    }


    public ArrayList<String> getMEAT() {
        return MEAT;
    }

    public ArrayList<String> getCHEESE() {
        return CHEESE;
    }

    public HashMap<String, Integer> getCount() {
        return count;
    }
}
