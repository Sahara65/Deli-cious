package org.delicious.controller;

import org.delicious.model.items.*;

import java.util.Scanner;

import static org.delicious.controller.HomeScreen.userInputs;

public class SandwichScreen {
    public static void createSandwich() {
        BreadType breadChoice = selectBread();
        BreadSize breadSizeChoice = selectBreadSize();

        Sandwich sandwich = new Sandwich(breadSizeChoice, breadChoice);
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
                BreadType type = BreadType.WHITE;
                selectBreadSize();
            }
            case 2 -> {
                System.out.println("You have selected Wheat Bread!");
                BreadType type = BreadType.WHEAT;
                selectBreadSize();
            }
            case 3 -> {
                System.out.println("You have selected Rye Bread!");
                BreadType type = BreadType.RYE;
                selectBreadSize();
            }
            case 4 -> {
                System.out.println("You have selected Wrap!");
                BreadType type = BreadType.WRAP;
                selectBreadSize();
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
                BreadSize size = BreadSize.FOUR_INCH;
                selectMeat();
            }
            case 2 -> {
                System.out.println("You have selected 8 inches!");
                BreadSize size = BreadSize.EIGHT_INCH;
                selectMeat();
            }
            case 3 -> {
                System.out.println("You have selected 12 inches!");
                BreadSize size = BreadSize.TWELVE_INCH;
                selectMeat();
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
                PremiumTopping meatChoice = new PremiumTopping("Steak");
                selectExtra();
            }
            case 2 -> {
                System.out.println("You have selected Ham!");
                PremiumTopping meatChoice = new PremiumTopping("Ham");
                selectExtra();
            }
            case 3 -> {
                System.out.println("You have selected Salami!");
                PremiumTopping meatChoice = new PremiumTopping("Chicken");
                selectExtra();
            }
            case 4 -> {
                System.out.println("You have selected Roast Beef!");
                PremiumTopping meatChoice = new PremiumTopping("Salami");
                selectExtra();
            }
            case 5 -> {
                System.out.println("You have selected Chicken!");
                PremiumTopping meatChoice = new PremiumTopping("Roast Beef");
                selectExtra();
            }
            case 6 -> {
                System.out.println("You have selected Bacon!");
                PremiumTopping meatChoice = new PremiumTopping("Bacon");
                selectExtra();
            }
            case 7 -> {
                System.out.println("You have selected no meat!");
                selectExtra();
            }
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
                Boolean isExtra = true;
            }
            case 2 -> {
                System.out.println("You have selected no extra!");
                Boolean isExtra = false;
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
                PremiumTopping cheeseChoice = new PremiumTopping("American Cheese");
                selectTopping();
            }
            case 2 -> {
                System.out.println("You have selected Provolone Cheese!");
                PremiumTopping cheeseChoice = new PremiumTopping("Provolone Cheese");
                selectTopping();
            }
            case 3 -> {
                System.out.println("You have selected Cheddar Cheese!");
                PremiumTopping cheeseChoice = new PremiumTopping("Cheddar Cheese");
                selectTopping();
            }
            case 4 -> {
                System.out.println("You have selected Swiss Cheese!");
                PremiumTopping cheeseChoice = new PremiumTopping("Swiss Cheese");
                selectTopping();
            }
            case 5 -> {
                System.out.println("You have selected no cheese!");
                PremiumTopping cheeseChoice = null;
                selectTopping();
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
