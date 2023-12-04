package org.delicious.controller;

import org.delicious.model.io.ReceiptManager;
import org.delicious.model.order.Order;

import java.util.Scanner;

import static org.delicious.controller.ChipsScreen.createChip;
import static org.delicious.controller.DrinkScreen.createDrink;
import static org.delicious.controller.HomeScreen.userInputs;
import static org.delicious.controller.SandwichScreen.createSandwich;
import static org.delicious.view.AnsiColorCodes.*;

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

            System.out.println(bold + """
                    1. 𝑨𝒅𝒅 𝒂 𝑺𝒂𝒏𝒅𝒘𝒊𝒄𝒉!
                    2. 𝑨𝒅𝒅 𝒂 𝑫𝒓𝒊𝒏𝒌!
                    3. 𝑨𝒅𝒅 𝑪𝒉𝒊𝒑𝒔!
                    4. 𝑪𝒉𝒆𝒄𝒌𝒐𝒖𝒕!
                    0. 𝑳𝒆𝒕❜𝒔 𝑪𝒂𝒏𝒄𝒆𝒍 𝒕𝒉𝒆 𝑶𝒓𝒅𝒆𝒓 𝒂𝒏𝒅 𝑹𝒆𝒕𝒖𝒓𝒏 𝒃𝒂𝒄𝒌 𝒕𝒐 𝒕𝒉𝒆 𝑯𝒐𝒎𝒆 𝑺𝒄𝒓𝒆𝒆𝒏!
                    """);

            switch (userInputs(scanner)) {
                case 1 -> createSandwich();
                case 2 -> createDrink();
                case 3 -> createChip();
                case 4 -> goCheckout(scanner);
                case 0 -> {
                    System.out.println(red + bold + """                 
                                                    
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

//                    progressBar();
                    running = false;
                }
                default ->
                        System.out.println(red + bold + "Invalid Input! Please type only numbers 0-4." + reset + yellow);
            }
        }
    }

    // TODO: Make the first if statement work properly within goCheckout()

    private static void goCheckout(Scanner scanner) {
        if (currentOrder.getItemsInCart() == null) {
            System.out.println(red + bold + "You have not ordered anything yet!" + reset + yellow);
        }
        String orderSummary = ReceiptManager.finalizeOrder(currentOrder);
        System.out.println(orderSummary);

        System.out.println("Do you want to proceed with the checkout? (Y/N)");
        char confirmation = (char) HomeScreen.userCharInputs();

        if (Character.toLowerCase(confirmation) == 'y') {
            System.out.println(bold + """
                    Thank you for your order!
                    Your food will be prepared and delivered shortly!
                    Here's your receipt and have a fantastic day!
                    """);

            // TODO - Insert receipt here

            currentOrder.getItemsInCart().clear();

            HomeScreen.display(scanner);

        } else {
            display(scanner);
        }
        if (Character.toLowerCase(confirmation) == 'n') {
            System.out.println(bold + red + """
                    Order had been cancelled. Have a fantastic day!
                    
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
                    """);
//            progressBar();
            HomeScreen.display(scanner);
        } else {
            System.out.println(red + bold + "Invalid input! Please enter Y or N." + reset + yellow);
            goCheckout(scanner);
        }
    }
}
