package org.delicious.controller;

import org.delicious.model.items.BreadSize;
import org.delicious.model.items.BreadType;
import org.delicious.model.items.PremiumTopping;
import org.delicious.model.items.Sandwich;

import java.util.Scanner;

import static org.delicious.controller.HomeScreen.userInputs;

public class SandwichScreen {
    public static void createSandwich() {
        BreadType breadChoice = selectBread();
        BreadSize breadSizeChoice = selectBreadSize();
        PremiumTopping meatChoice = selectMeat();
        PremiumTopping cheeseChoice = selectCheese();
        RegularTopping toppingChoice = selectTopping();
        RegularTopping sauceChoice = selectSauce();
        RegularTopping sideChoice = selectSide();
        boolean toastedChoice = selectToasted();

        Sandwich sandwich = new Sandwich(breadSizeChoice, breadChoice, meatChoice, cheeseChoice, );
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

        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected White Bread!");
                return BreadType.WHITE;
            }
            case 2 -> {
                System.out.println("You have selected Wheat Bread!");
                return BreadType.WHEAT;
            }
            case 3 -> {
                System.out.println("You have selected Rye Bread!");
                return BreadType.RYE;
            }
            case 4 -> {
                System.out.println("You have selected Wrap!");
                return BreadType.WRAP;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-4.");
        }
        return null;
    }

    private static BreadSize selectBreadSize() {
        // Size 📏
        System.out.println("""
                Please select your desired sandwich size!
                                
                1. 4 inches
                2. 8 inches
                3. 12 inches
                """);

        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected 4 inches!");
                return BreadSize.FOUR_INCH;
            }
            case 2 -> {
                System.out.println("You have selected 8 inches!");
                return BreadSize.EIGHT_INCH;
            }
            case 3 -> {
                System.out.println("You have selected 12 inches!");
                return BreadSize.TWELVE_INCH;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-3.");
        }
        return null;
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


        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected Steak!");
//                Sandwich.addTopping(meatChoice);
                return new PremiumTopping("Steak");
            }
            case 2 -> {
                System.out.println("You have selected Ham!");
//                Sandwich.addTopping(meatChoice);
                PremiumTopping meatChoice = new PremiumTopping("Ham");
            }
            case 3 -> {
                System.out.println("You have selected Salami!");
                PremiumTopping meatChoice = new PremiumTopping("Chicken");
            }
            case 4 -> {
                System.out.println("You have selected Roast Beef!");
                PremiumTopping meatChoice = new PremiumTopping("Salami");
            }
            case 5 -> {
                System.out.println("You have selected Chicken!");
                PremiumTopping meatChoice = new PremiumTopping("Roast Beef");
            }
            case 6 -> {
                System.out.println("You have selected Bacon!");
                PremiumTopping meatChoice = new PremiumTopping("Bacon");
            }
            case 7 -> System.out.println("You have selected no meat!");
        }
        return null;
    }

    private static boolean selectExtra() {
        // Extra Meat
        System.out.println("""
                Would you like extra?
                                
                1. Heck yeah!
                2. No thanks.
                """);

        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected extra!");
                return true;
            }
            case 2 -> {
                System.out.println("You have selected no extra!");
                return false;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-2.");
        }
        return false;
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

        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected American Cheese!");
                return new PremiumTopping("American Cheese");
            }
            case 2 -> {
                System.out.println("You have selected Provolone Cheese!");
                return new PremiumTopping("Provolone Cheese");
            }
            case 3 -> {
                System.out.println("You have selected Cheddar Cheese!");
                return new PremiumTopping("Cheddar Cheese");
            }
            case 4 -> {
                System.out.println("You have selected Swiss Cheese!");
                return new PremiumTopping("Swiss Cheese");
            }
            case 5 -> {
                System.out.println("You have selected no cheese!");
                return null;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-5.");
        }
        return null;
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
                RegularTopping toppingChoice = RegularTopping.LETTUCE;
            }
            case 2 -> {
                System.out.println("You have selected Peppers!");
                RegularTopping toppingChoice = RegularTopping.PEPPER;
            }
            case 3 -> {
                System.out.println("You have selected Onions!");
                RegularTopping toppingChoice = RegularTopping.ONION;
            }
            case 4 -> {
                System.out.println("You have selected Tomatoes!");
                RegularTopping toppingChoice = RegularTopping.TOMATO;
            }
            case 5 -> {
                System.out.println("You have selected Jalapenos!");
                RegularTopping toppingChoice = RegularTopping.JALAPENO;
            }
            case 6 -> {
                System.out.println("You have selected Cucumbers!");
                RegularTopping toppingChoice = RegularTopping.CUCUMBER;
            }
            case 7 -> {
                System.out.println("You have selected Pickles!");
                RegularTopping toppingChoice = RegularTopping.PICKLES;
            }
            case 8 -> {
                System.out.println("You have selected Guacamole!");
                RegularTopping toppingChoice = RegularTopping.GUACAMOLE;
            }
            case 9 -> {
                System.out.println("You have selected Mushrooms!");
                RegularTopping toppingChoice = RegularTopping.MUSHROOM;
            }
            case 10 -> {
                System.out.println("You have selected no toppings!");
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
                RegularTopping sauceChoice = RegularTopping.MAYO;
            }
            case 2 -> {
                System.out.println("You have selected Mustard!");
                RegularTopping sauceChoice = RegularTopping.MUSTARD;

            }
            case 3 -> {
                System.out.println("You have selected Ketchup!");
                RegularTopping sauceChoice = RegularTopping.KETCHUP;
            }
            case 4 -> {
                System.out.println("You have selected Ranch!");
                RegularTopping sauceChoice = RegularTopping.RANCH;
            }
            case 5 -> {
                System.out.println("You have selected Thousand Islands!");
                RegularTopping sauceChoice = RegularTopping.THOUSAND_ISLANDS;
            }
            case 6 -> {
                System.out.println("You have selected Vinaigrette!");
                RegularTopping sauceChoice = RegularTopping.VINAIGRETTE;
            }
            case 7 -> {
                System.out.println("You have selected no sauce!");
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

        switch (

                userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected Au Jus!");
                RegularTopping auJusChoice = RegularTopping.AU_JUS;
            }
            case 2 -> {
                System.out.println("You have selected Sauce!");
                RegularTopping sauceChoice = RegularTopping.SAUCE;
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
    }
}
