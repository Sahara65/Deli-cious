package org.delicious.controller;

import org.delicious.model.items.RegularTopping;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static org.delicious.controller.HomeScreen.userInputs;


// TODO - Combine cases that are for no toppings with the case that is for displaying toppings/moving to next menu

public class ToppingScreen {
    public List<RegularTopping> createToppings() {
        boolean play = true;

        List<RegularTopping> toppings = new ArrayList<>();
        while (play){
            System.out.println("""
                Please select your desired sides!
                                
                1. Toppings
                2. Sauces
                3. Sides
                4. Continue
                """);

            RegularTopping regularTopping = null;
            switch (userInputs(new Scanner(System.in))) {
                case 1 -> regularTopping = selectTopping();
                case 2 -> regularTopping = selectSauce();
                case 3 -> regularTopping = selectSide();
                case 4 -> play = false;
            }
            toppings.add(regularTopping);
        }
        return toppings;
    }

    static RegularTopping selectTopping() {

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
                10. Let's move on to the Sauce!
                """);

        List<RegularTopping> toppings = new ArrayList<>();
        boolean exit = false;



            switch (userInputs(new Scanner(System.in))) {
                case 1 -> {
                    System.out.println("You have selected Lettuce!");
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

                    System.out.println("Your toppings are:");
                    for (RegularTopping topping : toppings) {
                        System.out.println(topping.getName());
                    }
                    selectSauce();
                }
                default -> System.out.println("Invalid Input! Please type only numbers 1-10.");
            }
        return toppings;
    }

    static RegularTopping selectSauce() {
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

        List<RegularTopping> selectedSauces = new ArrayList<>();
        boolean exit = false;


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

        List<RegularTopping> selectedSides = new ArrayList<>();
        boolean exit = false;

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

                    // TODO - move to next menu

                }
                default -> System.out.println("Invalid Input! Please type only numbers 1-2.");
            }

        return (RegularTopping) selectedSides;
    }
}
