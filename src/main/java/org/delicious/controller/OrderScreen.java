package org.delicious.controller;

import java.util.Scanner;

import static org.delicious.controller.ChipsScreen.addChips;
import static org.delicious.controller.DrinkScreen.addDrink;
import static org.delicious.controller.HomeScreen.userInputs;
import static org.delicious.controller.SandwichScreen.addSandwich;
import static org.delicious.view.AnsiColorCodes.red;
import static org.delicious.view.AnsiColorCodes.reset;

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

    private static void goCheckout() {
    }
}
