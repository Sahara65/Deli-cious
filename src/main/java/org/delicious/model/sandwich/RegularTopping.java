package org.delicious.model.sandwich;

import java.util.ArrayList;
import java.util.List;

public class RegularTopping {
    private static final ArrayList<String> REGULAR_TOPPINGS =
            new ArrayList<>(List.of("Lettuce", "Onion", "Tomato", "Jalapeno", "Cucumber", "Pickles", "Guacamole",
                    "Mushroom", "Mayo", "Mustard", "Ketchup", "Ranch",
                    "Thousand Islands", "Vinaigrette", "Au Jus", "Mushroom"));
    private final String name;
    private final double price = 0;

    public RegularTopping(String name){
        this.name = name;
    }

    public String getName(){return name;}

}

