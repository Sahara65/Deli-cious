package org.delicious.Applications;

import java.util.Scanner;

public class OrderScreen {
    public void display() {


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
                0. Cancel Order
                """);

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        switch(userChoice) {
//            case 1 -> addSandwich();
//            case 2 -> addBeverage();
//            case 3 -> addChips();
//            case 4 -> goCheckout();
            case 0 -> new HomeScreen().display();
            default -> System.out.println("Invalid Input!");
        }
    }
}
