package org.delicious.controller;

import org.delicious.model.items.RegularTopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.delicious.controller.HomeScreen.userInputs;

public class ToppingScreen {

    private final List<RegularTopping> toppings = new ArrayList<>();

    public List<RegularTopping> createToppings() {
        boolean play = true;

        while (play) {
            System.out.println("""
                    
                    ███████╗███████╗██╗     ███████╗ ██████╗████████╗    ██╗   ██╗ ██████╗ ██╗   ██╗██████╗     ████████╗██╗   ██╗██████╗ ███████╗     ██████╗ ███████╗    ████████╗ ██████╗ ██████╗ ██████╗ ██╗███╗   ██╗ ██████╗ ███████╗██╗
                    ██╔════╝██╔════╝██║     ██╔════╝██╔════╝╚══██╔══╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║██╔══██╗    ╚══██╔══╝╚██╗ ██╔╝██╔══██╗██╔════╝    ██╔═══██╗██╔════╝    ╚══██╔══╝██╔═══██╗██╔══██╗██╔══██╗██║████╗  ██║██╔════╝ ██╔════╝██║
                    ███████╗█████╗  ██║     █████╗  ██║        ██║        ╚████╔╝ ██║   ██║██║   ██║██████╔╝       ██║    ╚████╔╝ ██████╔╝█████╗      ██║   ██║█████╗         ██║   ██║   ██║██████╔╝██████╔╝██║██╔██╗ ██║██║  ███╗███████╗██║
                    ╚════██║██╔══╝  ██║     ██╔══╝  ██║        ██║         ╚██╔╝  ██║   ██║██║   ██║██╔══██╗       ██║     ╚██╔╝  ██╔═══╝ ██╔══╝      ██║   ██║██╔══╝         ██║   ██║   ██║██╔═══╝ ██╔═══╝ ██║██║╚██╗██║██║   ██║╚════██║╚═╝
                    ███████║███████╗███████╗███████╗╚██████╗   ██║          ██║   ╚██████╔╝╚██████╔╝██║  ██║       ██║      ██║   ██║     ███████╗    ╚██████╔╝██║            ██║   ╚██████╔╝██║     ██║     ██║██║ ╚████║╚██████╔╝███████║██╗
                    ╚══════╝╚══════╝╚══════╝╚══════╝ ╚═════╝   ╚═╝          ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝       ╚═╝      ╚═╝   ╚═╝     ╚══════╝     ╚═════╝ ╚═╝            ╚═╝    ╚═════╝ ╚═╝     ╚═╝     ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚══════╝╚═╝
                                    
                    1. Toppings
                    2. Sauces
                    3. Sides
                    4. Continue
                    """);

            switch (userInputs(new Scanner(System.in))) {
                case 1 -> selectTopping();
                case 2 -> selectSauce();
                case 3 -> selectSide();
                case 4 -> play = false;
            }
        }
        return toppings;
    }

    private void selectTopping() {
        System.out.println("""
                
                ███████╗███████╗██╗     ███████╗ ██████╗████████╗    ██╗   ██╗ ██████╗ ██╗   ██╗██████╗     ████████╗ ██████╗ ██████╗ ██████╗ ██╗███╗   ██╗ ██████╗ ███████╗██╗
                ██╔════╝██╔════╝██║     ██╔════╝██╔════╝╚══██╔══╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║██╔══██╗    ╚══██╔══╝██╔═══██╗██╔══██╗██╔══██╗██║████╗  ██║██╔════╝ ██╔════╝██║
                ███████╗█████╗  ██║     █████╗  ██║        ██║        ╚████╔╝ ██║   ██║██║   ██║██████╔╝       ██║   ██║   ██║██████╔╝██████╔╝██║██╔██╗ ██║██║  ███╗███████╗██║
                ╚════██║██╔══╝  ██║     ██╔══╝  ██║        ██║         ╚██╔╝  ██║   ██║██║   ██║██╔══██╗       ██║   ██║   ██║██╔═══╝ ██╔═══╝ ██║██║╚██╗██║██║   ██║╚════██║╚═╝
                ███████║███████╗███████╗███████╗╚██████╗   ██║          ██║   ╚██████╔╝╚██████╔╝██║  ██║       ██║   ╚██████╔╝██║     ██║     ██║██║ ╚████║╚██████╔╝███████║██╗
                ╚══════╝╚══════╝╚══════╝╚══════╝ ╚═════╝   ╚═╝          ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝       ╚═╝    ╚═════╝ ╚═╝     ╚═╝     ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚══════╝╚═╝
                                
                1. Lettuce
                2. Peppers
                3. Onions
                4. Tomatoes
                5. Jalapenos
                6. Cucumbers
                7. Pickles
                8. Guacamole
                9. Mushrooms
                10. Let's move on to the Sauce!
                """);

        boolean exit = false;
        while (!exit) {
            switch (userInputs(new Scanner(System.in))) {
                case 1 -> {
                    System.out.println("You have selected Lettuce! Please continue selecting!");
                    toppings.add(new RegularTopping("Lettuce"));
                }
                case 2 -> {
                    System.out.println("You have selected Peppers!");
                    toppings.add(new RegularTopping("Peppers"));
                }
                case 3 -> {
                    System.out.println("You have selected Onions!");
                    toppings.add(new RegularTopping("Onions"));
                }
                case 4 -> {
                    System.out.println("You have selected Tomatoes!");
                    toppings.add(new RegularTopping("Tomatoes"));
                }
                case 5 -> {
                    System.out.println("You have selected Jalapenos!");
                    toppings.add(new RegularTopping("Jalapenos"));
                }
                case 6 -> {
                    System.out.println("You have selected Cucumbers!");
                    toppings.add(new RegularTopping("Cucumbers"));
                }
                case 7 -> {
                    System.out.println("You have selected Pickles!");
                    toppings.add(new RegularTopping("Pickles"));
                }
                case 8 -> {
                    System.out.println("You have selected Guacamole!");
                    toppings.add(new RegularTopping("Guacamole"));
                }
                case 9 -> {
                    System.out.println("You have selected Mushrooms!");
                    toppings.add(new RegularTopping("Mushrooms"));
                }
                case 10 -> {
                    System.out.println("Moving right along!");
                    System.out.println("Here are all of your toppings:");
                    for (RegularTopping topping : toppings) {
                        System.out.println(topping.getName());
                    }
                    exit = true;
                }
                default -> System.out.println("Invalid Input! Please type only numbers 1-10.");
            }
        }
    }

    private void selectSauce() {
        System.out.println("""
                
                ███████╗███████╗██╗     ███████╗ ██████╗████████╗    ██╗   ██╗ ██████╗ ██╗   ██╗██████╗     ███████╗ █████╗ ██╗   ██╗ ██████╗███████╗███████╗██╗
                ██╔════╝██╔════╝██║     ██╔════╝██╔════╝╚══██╔══╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║██╔══██╗    ██╔════╝██╔══██╗██║   ██║██╔════╝██╔════╝██╔════╝██║
                ███████╗█████╗  ██║     █████╗  ██║        ██║        ╚████╔╝ ██║   ██║██║   ██║██████╔╝    ███████╗███████║██║   ██║██║     █████╗  ███████╗██║
                ╚════██║██╔══╝  ██║     ██╔══╝  ██║        ██║         ╚██╔╝  ██║   ██║██║   ██║██╔══██╗    ╚════██║██╔══██║██║   ██║██║     ██╔══╝  ╚════██║╚═╝
                ███████║███████╗███████╗███████╗╚██████╗   ██║          ██║   ╚██████╔╝╚██████╔╝██║  ██║    ███████║██║  ██║╚██████╔╝╚██████╗███████╗███████║██╗
                ╚══════╝╚══════╝╚══════╝╚══════╝ ╚═════╝   ╚═╝          ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝    ╚══════╝╚═╝  ╚═╝ ╚═════╝  ╚═════╝╚══════╝╚══════╝╚═╝
                                
                1. Mayo
                2. Mustard
                3. Ketchup
                4. Ranch
                5. Thousand Islands
                6. Vinaigrette
                7. Let's keep it moving!
                """);

        boolean exit = false;

        while (!exit) {
            switch (userInputs(new Scanner(System.in))) {
                case 1 -> {
                    System.out.println("You have selected Mayo!");
                    toppings.add(new RegularTopping("Mayo"));
                }
                case 2 -> {
                    System.out.println("You have selected Mustard!");
                    toppings.add(new RegularTopping("Mustard"));
                }
                case 3 -> {
                    System.out.println("You have selected Ketchup!");
                    toppings.add(new RegularTopping("Ketchup"));
                }
                case 4 -> {
                    System.out.println("You have selected Ranch!");
                    toppings.add(new RegularTopping("Ranch"));
                }
                case 5 -> {
                    System.out.println("You have selected Thousand Islands!");
                    toppings.add(new RegularTopping("Thousand Islands"));
                }
                case 6 -> {
                    System.out.println("You have selected Vinaigrette!");
                    toppings.add(new RegularTopping("Vinaigrette"));
                }
                case 7 -> {
                    System.out.println("Moving on...");
                    System.out.println("Here are all of your toppings:");
                    for (RegularTopping sauces : toppings) {
                        System.out.println(sauces.getName());
                        exit = true;
                    }

                }
                default -> System.out.println("Invalid Input! Please type only numbers 1-7.");
            }
        }
    }

    private void selectSide() {
        System.out.println("""
                
                ███████╗███████╗██╗     ███████╗ ██████╗████████╗    ██╗   ██╗ ██████╗ ██╗   ██╗██████╗     ███████╗██╗██████╗ ███████╗███████╗██╗
                ██╔════╝██╔════╝██║     ██╔════╝██╔════╝╚══██╔══╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║██╔══██╗    ██╔════╝██║██╔══██╗██╔════╝██╔════╝██║
                ███████╗█████╗  ██║     █████╗  ██║        ██║        ╚████╔╝ ██║   ██║██║   ██║██████╔╝    ███████╗██║██║  ██║█████╗  ███████╗██║
                ╚════██║██╔══╝  ██║     ██╔══╝  ██║        ██║         ╚██╔╝  ██║   ██║██║   ██║██╔══██╗    ╚════██║██║██║  ██║██╔══╝  ╚════██║╚═╝
                ███████║███████╗███████╗███████╗╚██████╗   ██║          ██║   ╚██████╔╝╚██████╔╝██║  ██║    ███████║██║██████╔╝███████╗███████║██╗
                ╚══════╝╚══════╝╚══════╝╚══════╝ ╚═════╝   ╚═╝          ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝    ╚══════╝╚═╝╚═════╝ ╚══════╝╚══════╝╚═╝
                                
                1. Au Jus
                2. Sauce
                3. Let's keep it moving!
                """);

        boolean exit = false;
        while (!exit) {
            switch (userInputs(new Scanner(System.in))) {
                case 1 -> {
                    System.out.println("You have selected Au Jus!");
                    toppings.add(new RegularTopping("Au Jus"));
                }
                case 2 -> {
                    System.out.println("You have selected Sauce!");
                    toppings.add(new RegularTopping("Sauce"));
                }
                case 3 -> {
                    System.out.println("Moving on...");
                    System.out.println("Here are all of your toppings:");
                    for (RegularTopping sides : toppings)
                        System.out.println(sides.getName());

                    exit = true;
                    // TODO - move to next menu
                }
                default -> System.out.println("Invalid Input! Please type only numbers 1-2.");
            }
        }
    }
}
