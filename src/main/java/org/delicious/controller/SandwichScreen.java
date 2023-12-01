package org.delicious.controller;

import org.delicious.model.items.*;

import java.util.Scanner;

import static org.delicious.controller.HomeScreen.userInputs;

public class SandwichScreen {
    public static void createSandwich() {
        BreadType breadChoice = selectBread();
        BreadSize breadSizeChoice = selectBreadSize();
        Sandwich sandwich = new Sandwich(breadSizeChoice, breadChoice);

        PremiumTopping meatChoice = selectMeat();
        if (meatChoice != null) {
            sandwich.addTopping(meatChoice);
            if (selectExtra()){
                PremiumTopping extraMeatChoice = new PremiumTopping(meatChoice.getName());
                extraMeatChoice.setExtra(true);
                sandwich.addTopping(extraMeatChoice);
            }
        }

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
                type = BreadType.WHITE;
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
                // selectBreadSize();
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
                size = BreadSize.EIGHT_INCH;

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
                isExtra = false;
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
                cheeseChoice = null;

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
                isExtra = false;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-2.");
        }
        return isExtra;
    }

    private static RegularTopping selectTopping() {
        // Toppings 🥬
        System.out.println("""
                Please select your desired toppings!
                                
                1. Lettuce
                2. Peppers
                3. Onions
                4. Tomatoes
                5. Jalapenos
                6. Cucumbers
                7. Pickles
                8. Guacamole
                9. Mushrooms
                10. No Toppings
                """);

        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected Lettuce!");
                RegularTopping toppingChoice = new RegularTopping("Lettuce");
                selectSauce();
            }
            case 2 -> {
                System.out.println("You have selected Peppers!");
                RegularTopping toppingChoice = new RegularTopping("Peppers");
                selectSauce();
            }
            case 3 -> {
                System.out.println("You have selected Onions!");
                RegularTopping toppingChoice = new RegularTopping("Onions");
                selectSauce();
            }
            case 4 -> {
                System.out.println("You have selected Tomatoes!");
                RegularTopping toppingChoice = new RegularTopping("Tomatoes");
                selectSauce();
            }
            case 5 -> {
                System.out.println("You have selected Jalapenos!");
                RegularTopping toppingChoice = new RegularTopping("Jalapenos");
                selectSauce();
            }
            case 6 -> {
                System.out.println("You have selected Cucumbers!");
                RegularTopping toppingChoice = new RegularTopping("Cucumbers");
                selectSauce();
            }
            case 7 -> {
                System.out.println("You have selected Pickles!");
                RegularTopping toppingChoice = new RegularTopping("Pickles");
                selectSauce();
            }
            case 8 -> {
                System.out.println("You have selected Guacamole!");
                RegularTopping toppingChoice = new RegularTopping("Guacamole");
                selectSauce();
            }
            case 9 -> {
                System.out.println("You have selected Mushrooms!");
                RegularTopping toppingChoice = new RegularTopping("Mushrooms");
                selectSauce();
            }
            case 10 -> {
                System.out.println("You have selected no toppings!");
                RegularTopping toppingChoice = null;
                selectSauce();
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-10.");
        }
        return null;
    }

    private static RegularTopping selectSauce() {
        // Sauce 🫙
        System.out.println("""
                Please select your desired sauce!
                                
                1. Mayo
                2. Mustard
                3. Ketchup
                4. Ranch
                5. Thousand Islands
                6. Vinaigrette
                7. No Sauce
                """);

        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected Mayo!");
                RegularTopping sauceChoice = new RegularTopping("Mayo");
                selectSide();
            }
            case 2 -> {
                System.out.println("You have selected Mustard!");
                RegularTopping sauceChoice = new RegularTopping("Mustard");
                selectSide();
            }
            case 3 -> {
                System.out.println("You have selected Ketchup!");
                RegularTopping sauceChoice = new RegularTopping("Ketchup");
                selectSide();
            }
            case 4 -> {
                System.out.println("You have selected Ranch!");
                RegularTopping sauceChoice = new RegularTopping("Ranch");
                selectSide();
            }
            case 5 -> {
                System.out.println("You have selected Thousand Islands!");
                RegularTopping sauceChoice = new RegularTopping("Thousand Islands");
                selectSide();
            }
            case 6 -> {
                System.out.println("You have selected Vinaigrette!");
                RegularTopping sauceChoice = new RegularTopping("Vinaigrette");
                selectSide();
            }
            case 7 -> {
                System.out.println("You have selected no sauce!");
                RegularTopping sauceChoice = null;
                selectSide();
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-7.");
        }
        return null;
    }

    private static RegularTopping selectSide() {
        // Sides
        System.out.println("""
                Please select your desired sides!
                                
                1. Au Jus
                2. Sauce
                """);

        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected Au Jus!");
                RegularTopping sideChoice = new RegularTopping("Au Jus");
                selectToasted();
            }
            case 2 -> {
                System.out.println("You have selected Sauce!");
                RegularTopping sideChoice = new RegularTopping("Sauce");
                selectToasted();
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-2.");
        }
        return null;
    }

    private static boolean selectToasted() {
        // Toasted 🔥
        System.out.println("""
                Would you like your sandwich toasted?
                                
                1. Heck yeah!
                2. No thanks.
                """);

        switch (
                userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected toasted!");
                return true;
            }
            case 2 -> {
                System.out.println("You have selected not toasted!");
                return false;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-2.");
        }
        return false;
    }
}