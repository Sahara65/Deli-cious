package org.delicious.Controller;

import org.delicious.Model.Sandwich.*;

import java.util.Scanner;

import static org.delicious.Controller.HomeScreen.userInputs;
import static org.delicious.View.AnsiColorCodes.red;
import static org.delicious.View.AnsiColorCodes.reset;

public class OrderScreen {
    public static void display(Scanner scanner) {

        System.out.println("""
                                
                ██████╗░██╗░░░░░░█████╗░░█████╗░███████╗░░░░░░░░█████╗░███╗░░██╗░░░░░░░░░█████╗░██████╗░██████╗░███████╗██████╗░██╗
                ██╔══██╗██║░░░░░██╔══██╗██╔══██╗██╔════╝░░░░░░░░██╔══██╗████╗░██║░░░░░░░░██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗██║
                ██████╔╝██║░░░░░███████║██║░░╚═╝█████╗░░░░░░░░░░███████║██╔██╗██║░░░░░░░░██║░░██║██████╔╝██║░░██║█████╗░░██████╔╝██║
                ██╔═══╝░██║░░░░░██╔══██║██║░░██╗██╔══╝░░░░░░░░░░██╔══██║██║╚████║░░░░░░░░██║░░██║██╔══██╗██║░░██║██╔══╝░░██╔══██╗╚═╝
                ██║░░░░░███████╗██║░░██║╚█████╔╝███████╗░░░░░░░░██║░░██║██║░╚███║░░░░░░░░╚█████╔╝██║░░██║██████╔╝███████╗██║░░██║██╗
                ╚═╝░░░░░╚══════╝╚═╝░░╚═╝░╚════╝░╚══════╝░░░░░░░░╚═╝░░╚═╝╚═╝░░╚══╝░░░░░░░░░╚════╝░╚═╝░░╚═╝╚═════╝░╚══════╝╚═╝░░╚═╝╚═╝
                """);

        System.out.println("""
                1. Add a Sandwich!
                2. Add a Drink!
                3. Add Chips!
                4. Checkout!
                0. Cancel Order and Return to Home.
                """);

        while (true) {
            switch (userInputs(scanner)) {
                case 1 -> addSandwich();
                case 2 -> addDrink();
                case 3 -> addChips();
                case 4 -> goCheckout();
                case 0 -> {
                    HomeScreen.display(scanner);
                    System.out.println(red + """                 
                                                    
                            ███╗░░██╗░█████╗░░██╗░░░░░░░██╗
                            ████╗░██║██╔══██╗░██║░░██╗░░██║
                            ██╔██╗██║██║░░██║░╚██╗████╗██╔╝
                            ██║╚████║██║░░██║░░████╔═████║░
                            ██║░╚███║╚█████╔╝░░╚██╔╝░╚██╔╝░
                            ╚═╝░░╚══╝░╚════╝░░░░╚═╝░░░╚═╝░░
                                                    
                            ██████╗░███████╗████████╗██╗░░░██╗██████╗░███╗░░██╗██╗███╗░░██╗░██████╗░░░░░░░░░░
                            ██╔══██╗██╔════╝╚══██╔══╝██║░░░██║██╔══██╗████╗░██║██║████╗░██║██╔════╝░░░░░░░░░░
                            ██████╔╝█████╗░░░░░██║░░░██║░░░██║██████╔╝██╔██╗██║██║██╔██╗██║██║░░██╗░░░░░░░░░░
                            ██╔══██╗██╔══╝░░░░░██║░░░██║░░░██║██╔══██╗██║╚████║██║██║╚████║██║░░╚██╗░░░░░░░░░
                            ██║░░██║███████╗░░░██║░░░╚██████╔╝██║░░██║██║░╚███║██║██║░╚███║╚██████╔╝██╗██╗██╗
                            ╚═╝░░╚═╝╚══════╝░░░╚═╝░░░░╚═════╝░╚═╝░░╚═╝╚═╝░░╚══╝╚═╝╚═╝░░╚══╝░╚═════╝░╚═╝╚═╝╚═╝
                            """ + reset);
                }
                default -> System.out.println("Invalid Input! Please type only numbers 0-4.");
            }
        }
    }

    private static void addSandwich() {
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
                BreadType breadChoice = BreadType.WHITE;
            }
            case 2 -> {
                System.out.println("You have selected Wheat Bread!");
                BreadType breadChoice = BreadType.WHEAT;
            }
            case 3 -> {
                System.out.println("You have selected Rye Bread!");
                BreadType breadChoice = BreadType.RYE;
            }
            case 4 -> {
                System.out.println("You have selected Wrap!");
                BreadType breadChoice = BreadType.WRAP;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-4.");
        }

        // Toasted 🔥
        System.out.println("""
                Would you like your sandwich toasted?
                                
                1. Heck yeah!
                2. No thanks.
                """);

        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected toasted!");
//                Toasted toastChoice = Toasted.TOASTED;
            }
            case 2 -> {
                System.out.println("You have selected not toasted!");
//                Toasted toastChoice = Toasted.NOT_TOASTED;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-2.");
        }

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
                BreadSize sizeChoice = BreadSize.FOUR_INCH;
            }
            case 2 -> {
                System.out.println("You have selected 8 inches!");
                BreadSize sizeChoice = BreadSize.EIGHT_INCH;
            }
            case 3 -> {
                System.out.println("You have selected 12 inches!");
                BreadSize sizeChoice = BreadSize.TWELVE_INCH;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-3.");
        }

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
                MeatTopping meatChoice = MeatTopping.STEAK;
            }
            case 2 -> {
                System.out.println("You have selected Ham!");
                MeatTopping meatChoice = MeatTopping.HAM;
            }
            case 3 -> {
                System.out.println("You have selected Salami!");
                MeatTopping meatChoice = MeatTopping.SALAMI;
            }
            case 4 -> {
                System.out.println("You have selected Roast Beef!");
                MeatTopping meatChoice = MeatTopping.ROAST_BEEF;
            }
            case 5 -> {
                System.out.println("You have selected Chicken!");
                MeatTopping meatChoice = MeatTopping.CHICKEN;
            }
            case 6 -> {
                System.out.println("You have selected Bacon!");
                MeatTopping meatChoice = MeatTopping.BACON;
            }
            case 7 -> {
                System.out.println("You have selected no meat!");
            }
        }

        // Extra Meat
        System.out.println("""
                Would you like extra meat?
                                
                1. Heck yeah!
                2. No thanks.
                """);
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected extra meat!");
//                MeatTopping meatChoice = MeatTopping.EXTRA_MEAT;
            }
            case 2 -> {
                System.out.println("You have selected no extra meat!");
//                MeatTopping meatChoice = MeatTopping.NO_EXTRA_MEAT;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-2.");
        }

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
                CheeseTopping cheeseChoice = CheeseTopping.AMERICAN;
            }
            case 2 -> {
                System.out.println("You have selected Provolone Cheese!");
                CheeseTopping cheeseChoice = CheeseTopping.PROVOLONE;
            }
            case 3 -> {
                System.out.println("You have selected Cheddar Cheese!");
                CheeseTopping cheeseChoice = CheeseTopping.CHEDDAR;
            }
            case 4 -> {
                System.out.println("You have selected Swiss Cheese!");
                CheeseTopping cheeseChoice = CheeseTopping.SWISS;
            }
            case 5 -> {
                System.out.println("You have selected no cheese!");
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-5.");
        }

        // Extra Cheese
        System.out.println("""
                Would you like extra cheese?
                                
                1. Heck yeah! Cheese it up!!
                2. No thanks.
                """);
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected extra cheese!");
//                CheeseTopping cheeseChoice = CheeseTopping.EXTRA_CHEESE;
            }
            case 2 -> {
                System.out.println("You have selected no extra cheese!");
//                CheeseTopping cheeseChoice = CheeseTopping.NO_EXTRA_CHEESE;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-2.");
        }

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
        }

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
        }

        // Sides
        System.out.println("""
                Please select your desired sides!
                                
                1. Au Jus
                2. Sauce
                """);
        switch (userInputs(new Scanner(System.in))) {
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
    }

    private static void addDrink() {
        // Drink 🥤
        System.out.println("""
                Please select your drink!
                                
                1. Coke Cola
                2. Sprite
                3. Fanta
                4. Water
                5. Pepsi
                6. Dr. Pepper
                """);
        userInputs(new Scanner(System.in));
    }

    private static void addChips() {
        // Chips 🍟
        System.out.println("""
                Please select your chips!
                                
                1. Lays
                2. Cheetos
                3. Doritos
                4. Popcorn
                5. Nachos
                """);
        userInputs(new Scanner(System.in));
    }

    private static void goCheckout() {
    }
}
