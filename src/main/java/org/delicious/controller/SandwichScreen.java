package org.delicious.controller;

import org.delicious.model.items.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.delicious.controller.HomeScreen.userInputs;
import static org.delicious.controller.ToppingScreen.*;

public class SandwichScreen {
    public static void createSandwich() {
        BreadType breadChoice = selectBread();
        BreadSize breadSizeChoice = selectBreadSize();
        Sandwich sandwich = new Sandwich(breadSizeChoice, breadChoice);

        PremiumTopping meatChoice = selectMeat();
        if (meatChoice != null) {
            sandwich.addTopping(meatChoice);
            if (selectExtra()) {
                PremiumTopping extraMeatChoice = new PremiumTopping(meatChoice.getName());
                extraMeatChoice.setExtra(true);
                sandwich.addTopping(extraMeatChoice);
            }
        }

        PremiumTopping cheeseChoice = selectCheese();
        if (cheeseChoice != null) {
            sandwich.addTopping(cheeseChoice);
            if (selectExtra()) {
                PremiumTopping extraCheeseChoice = new PremiumTopping(cheeseChoice.getName());
                extraCheeseChoice.setExtra(true);
                sandwich.addTopping(extraCheeseChoice);
            }
        }
        // TODO create a choose Regular Topping Screen this Screen will be looped back too until the user selects the
        //  option "I am happy with my current Topping selections". This screen will allow you to choose between the
        //  toppings, sauces, or sides. The switch case will call the existing methods.
        //  Need to adjust in a way that the Topping Screen will keep adding the topping to the sandwich then allow you
        //  to choose their next regular topping.

        RegularTopping topping = (RegularTopping) selectTopping();
        RegularTopping sauce = (RegularTopping) selectSauce();
        RegularTopping side = selectSide();

        sandwich.addTopping(topping);
        sandwich.addTopping(sauce);
        sandwich.addTopping(side);

        boolean isToasted = selectToasted();
        sandwich.setToasted(isToasted);

        System.out.println("Your sandwich will cost:" + sandwich.getPrice());
    }

    private static BreadType selectBread() {
        // Bread 🍞
        System.out.println("""
                Please select your desired bread!
                                
                1. White Bread
                2. Wheat Bread
                3. Rye Bread
                4. Wrap
                """);

        BreadType type = BreadType.WHITE;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected White Bread!");
            }
            case 2 -> {
                System.out.println("You have selected Wheat Bread!");
                type = BreadType.WHEAT;
            }
            case 3 -> {
                System.out.println("You have selected Rye Bread!");
                type = BreadType.RYE;
            }
            case 4 -> {
                System.out.println("You have selected Wrap!");
                type = BreadType.WRAP;
            }
        }
        return type;
    }

    private static BreadSize selectBreadSize() {
        // Size 📏
        System.out.println("""
                Please select your desired sandwich size!
                                
                1. 4 inches
                2. 8 inches
                3. 12 inches
                """);

        BreadSize size = BreadSize.EIGHT_INCH;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected 4 inches!");
                size = BreadSize.FOUR_INCH;
            }
            case 2 -> {
                System.out.println("You have selected 8 inches!");
            }
            case 3 -> {
                System.out.println("You have selected 12 inches!");
                size = BreadSize.TWELVE_INCH;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-3.");
        }
        return size;
    }

    private static PremiumTopping selectMeat() {
        // Meat 🥩
        System.out.println("""
                Please select your desired meat!
                                
                1. Steak
                2. Ham
                3. Salami
                4. Roast Beef
                5. Chicken
                6. Bacon
                7. No Meat
                """);


        PremiumTopping meatChoice = null;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected Steak!");
                meatChoice = new PremiumTopping("Steak");
            }
            case 2 -> {
                System.out.println("You have selected Ham!");
                meatChoice = new PremiumTopping("Ham");
            }
            case 3 -> {
                System.out.println("You have selected Salami!");
                meatChoice = new PremiumTopping("Chicken");
            }
            case 4 -> {
                System.out.println("You have selected Roast Beef!");
                meatChoice = new PremiumTopping("Salami");
            }
            case 5 -> {
                System.out.println("You have selected Chicken!");
                meatChoice = new PremiumTopping("Roast Beef");
            }
            case 6 -> {
                System.out.println("You have selected Bacon!");
                meatChoice = new PremiumTopping("Bacon");
            }
            case 7 -> {
                System.out.println("You have selected no meat!");
            }
        }
        return meatChoice;
    }

    private static boolean selectExtra() {
        // Extra Meat
        System.out.println("""
                Would you like extra?
                                
                1. Heck yeah!
                2. No thanks.
                """);

        boolean isExtra = false;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected extra!");
                isExtra = true;
            }
            case 2 -> {
                System.out.println("You have selected no extra!");
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-2.");
        }
        return isExtra;
    }

    private static PremiumTopping selectCheese() {
        // Cheese 🧀
        System.out.println("""
                Please select your desired cheese!
                                
                1. American Cheese
                2. Provolone Cheese
                3. Cheddar Cheese
                4. Swiss Cheese
                5. No Cheese
                """);

        PremiumTopping cheeseChoice = null;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected American Cheese!");
                cheeseChoice = new PremiumTopping("American Cheese");
            }
            case 2 -> {
                System.out.println("You have selected Provolone Cheese!");
                cheeseChoice = new PremiumTopping("Provolone Cheese");
            }
            case 3 -> {
                System.out.println("You have selected Cheddar Cheese!");
                cheeseChoice = new PremiumTopping("Cheddar Cheese");
            }
            case 4 -> {
                System.out.println("You have selected Swiss Cheese!");
                cheeseChoice = new PremiumTopping("Swiss Cheese");
            }
            case 5 -> {
                System.out.println("You have selected no cheese!");
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-5.");
        }
        return cheeseChoice;
    }

    private static boolean selectExtraCheese() {
        // Extra Meat
        System.out.println("""
                Would you like extra?
                                
                1. Heck yeah!
                2. No thanks.
                """);

        boolean isExtra = false;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected extra!");
                isExtra = true;
            }
            case 2 -> {
                System.out.println("You have selected no extra!");
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-2.");
        }
        return isExtra;
    }



    private static boolean selectToasted() {
        // Toasted 🔥
        System.out.println("""
                Would you like your sandwich toasted?
                                
                1. Heck yeah!
                2. No thanks.
                """);

        boolean isToasted = false;
        switch (
                userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected toasted!");
                isToasted = true;
            }
            case 2 -> {
                System.out.println("You have selected not toasted!");
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-2.");
        }
        return isToasted;
    }
}