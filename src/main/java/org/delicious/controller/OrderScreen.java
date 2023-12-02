package org.delicious.controller;

import org.delicious.model.io.ReceiptManager;
import org.delicious.model.order.Order;

import java.util.Scanner;

import static org.delicious.controller.ChipsScreen.addChips;
import static org.delicious.controller.DrinkScreen.createDrink;
import static org.delicious.controller.HomeScreen.userInputs;
import static org.delicious.controller.SandwichScreen.createSandwich;
import static org.delicious.view.AnsiColorCodes.red;
import static org.delicious.view.AnsiColorCodes.reset;

public class OrderScreen {
    private static final Order currentOrder = new Order();

    public static void display(Scanner scanner) {

        System.out.println("""
                                
                ██████╗░██╗░░░░░░█████╗░░█████╗░███████╗░░░░░░░░█████╗░███╗░░██╗░░░░░░░░░█████╗░██████╗░██████╗░███████╗██████╗░██╗
                ██╔══██╗██║░░░░░██╔══██╗██╔══██╗██╔════╝░░░░░░░░██╔══██╗████╗░██║░░░░░░░░██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗██║
                ██████╔╝██║░░░░░███████║██║░░╚═╝█████╗░░░░░░░░░░███████║██╔██╗██║░░░░░░░░██║░░██║██████╔╝██║░░██║█████╗░░██████╔╝██║
                ██╔═══╝░██║░░░░░██╔══██║██║░░██╗██╔══╝░░░░░░░░░░██╔══██║██║╚████║░░░░░░░░██║░░██║██╔══██╗██║░░██║██╔══╝░░██╔══██╗╚═╝
                ██║░░░░░███████╗██║░░██║╚█████╔╝███████╗░░░░░░░░██║░░██║██║░╚███║░░░░░░░░╚█████╔╝██║░░██║██████╔╝███████╗██║░░██║██╗
                ╚═╝░░░░░╚══════╝╚═╝░░╚═╝░╚════╝░╚══════╝░░░░░░░░╚═╝░░╚═╝╚═╝░░╚══╝░░░░░░░░░╚════╝░╚═╝░░╚═╝╚═════╝░╚══════╝╚═╝░░╚═╝╚═╝
                """);


        boolean running = true;
        while (running) {
            System.out.println("""
                1. Add a Sandwich!
                2. Add a Drink!
                3. Add Chips!
                4. Checkout!
                0. Cancel Order and Return to Home.
                """);
            switch (userInputs(scanner)) {
                case 1 -> createSandwich();
                case 2 -> createDrink();
                case 3 -> addChips();
                case 4 -> goCheckout(scanner);
                case 0 -> {
                    // HomeScreen.display(scanner); // TODO - No , this is a recursive call
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
                    running = false;
                }
                default -> System.out.println("Invalid Input! Please type only numbers 0-4.");
            }
        }
    }

    private static void goCheckout(Scanner scanner) {
        if (currentOrder.getItemsInCart() == null) {
            System.out.println("You have not ordered anything yet!");
        }
        String orderSummary = ReceiptManager.finalizeOrder(currentOrder);

        System.out.println(orderSummary);

        System.out.println("Do you want to proceed with the checkout? (Y/N)");
        char confirmation = (char) HomeScreen.userCharInputs();


        if (Character.toLowerCase(confirmation) == 'y') {
            System.out.println("""
                    Thank you for your order!
                    Your food will be prepared and delivered shortly!
                    Have a fantastic day!
                    """);

            currentOrder.getItemsInCart().clear();
            HomeScreen.display(scanner);
        } else {
            display(scanner);
        }
        if (Character.toLowerCase(confirmation) == 'n') {
            HomeScreen.display(scanner);
        }
        else {
            System.out.println("Invalid input! Please enter Y or N.");
            goCheckout(scanner);
        }
    }
}
