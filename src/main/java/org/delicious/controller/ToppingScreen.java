package org.delicious.controller;

import org.delicious.model.items.RegularTopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.delicious.controller.HomeScreen.userInputs;

public class ToppingScreen {
    static List<RegularTopping> selectTopping() {
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
                11. View Toppings and Continue
                """);
//        RegularTopping toppingChoice = null;

        List<RegularTopping> selectedToppings = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            switch (userInputs(new Scanner(System.in))) {
                case 1 -> {
                    System.out.println("You have selected Lettuce!");
                    selectedToppings.add(new RegularTopping("Lettuce"));
                }
                case 2 -> {
                    System.out.println("You have selected Peppers!");
                    selectedToppings.add(new RegularTopping("Peppers"));
                }
                case 3 -> {
                    System.out.println("You have selected Onions!");
                    selectedToppings.add(new RegularTopping("Onions"));
                }
                case 4 -> {
                    System.out.println("You have selected Tomatoes!");
                    selectedToppings.add(new RegularTopping("Tomatoes"));
                }
                case 5 -> {
                    System.out.println("You have selected Jalapenos!");
                    selectedToppings.add(new RegularTopping("Jalapenos"));
                }
                case 6 -> {
                    System.out.println("You have selected Cucumbers!");
                    selectedToppings.add(new RegularTopping("Cucumbers"));
                }
                case 7 -> {
                    System.out.println("You have selected Pickles!");
                    selectedToppings.add(new RegularTopping("Pickles"));
                }
                case 8 -> {
                    System.out.println("You have selected Guacamole!");
                    selectedToppings.add(new RegularTopping("Guacamole"));
                }
                case 9 -> {
                    System.out.println("You have selected Mushrooms!");
                    selectedToppings.add(new RegularTopping("Mushrooms"));
                }
                case 10 -> {
                    System.out.println("You have selected no toppings!");
                }
                case 11 -> {
                    System.out.println("Your toppings are:");
//                    for (RegularTopping topping : selectedToppings) {
//                        System.out.println(topping.getName());
//                    }
                }
                case 12 -> {
                    System.out.println("Exiting topping selection...");
                }
                default -> System.out.println("Invalid Input! Please type only numbers 1-10.");
            }
        }
        return selectedToppings;
    }

    static List<RegularTopping> selectSauce() {
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

//        RegularTopping sauceChoice = null;

        List<RegularTopping> selectedSauces = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            switch (userInputs(new Scanner(System.in))) {
                case 1 -> {
                    System.out.println("You have selected Mayo!");
                    selectedSauces.add(new RegularTopping("Mayo"));
                }
                case 2 -> {
                    System.out.println("You have selected Mustard!");
                    selectedSauces.add(new RegularTopping("Mustard"));
                }
                case 3 -> {
                    System.out.println("You have selected Ketchup!");
                    selectedSauces.add(new RegularTopping("Ketchup"));
                }
                case 4 -> {
                    System.out.println("You have selected Ranch!");
                    selectedSauces.add(new RegularTopping("Ranch"));
                }
                case 5 -> {
                    System.out.println("You have selected Thousand Islands!");
                    selectedSauces.add(new RegularTopping("Thousand Islands"));
                }
                case 6 -> {
                    System.out.println("You have selected Vinaigrette!");
                    selectedSauces.add(new RegularTopping("Vinaigrette"));
                }
                case 7 -> {
                    System.out.println("You have selected no sauce!");
                }
                default -> System.out.println("Invalid Input! Please type only numbers 1-7.");
            }
        }
        return selectedSauces;
    }

    static RegularTopping selectSide() {
        // Sides
        System.out.println("""
                Please select your desired sides!
                                
                1. Au Jus
                2. Sauce
                3. No sides
                """);
//        RegularTopping sideChoice = null;

        List<RegularTopping> selectedSides = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            switch (userInputs(new Scanner(System.in))) {
                case 1 -> {
                    System.out.println("You have selected Au Jus!");
                    selectedSides.add(new RegularTopping("Au Jus"));
                }
                case 2 -> {
                    System.out.println("You have selected Sauce!");
                    selectedSides.add(new RegularTopping("Sauce"));
                }
                case 3 -> {
                    System.out.println("You have selected no sides!");
                }
                default -> System.out.println("Invalid Input! Please type only numbers 1-2.");
            }
        }
        return (RegularTopping) selectedSides;
    }
}
