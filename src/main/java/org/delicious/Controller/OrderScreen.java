package org.delicious.Controller;

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
        userInputs(new Scanner(System.in));

        // Toasted 🔥
        System.out.println("""
                Would you like your sandwich toasted?
                
                1. Heck yeah!
                2. No thanks.
                """);
        userInputs(new Scanner(System.in));

        // Size 📏
        System.out.println("""
                Please select your desired sandwich size!
                
                1. 4 inches
                2. 8 inches
                3. 12 inches
                """);
        userInputs(new Scanner(System.in));

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
        userInputs(new Scanner(System.in));

        // Extra Meat
        System.out.println("""
                Would you like extra meat?
                
                1. Heck yeah!
                2. No thanks.
                """);
        userInputs(new Scanner(System.in));

        // Cheese 🧀
        System.out.println("""
                Please select your desired cheese!
                
                1. American Cheese
                2. Provolone Cheese
                3. Cheddar Cheese
                4. Swiss Cheese
                5. No Cheese
                """);
        userInputs(new Scanner(System.in));

        // Extra Cheese
        System.out.println("""
                Would you like extra cheese?
                
                1. Heck yeah! Cheese it up!!
                2. No thanks.
                """);
        userInputs(new Scanner(System.in));

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
        userInputs(new Scanner(System.in));

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
        userInputs(new Scanner(System.in));

        // Sides
        System.out.println("""
                Please select your desired sides!
                
                1. Au Jus
                2. Sauce
                """);
        userInputs(new Scanner(System.in));
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
