package org.delicious.controller;

import org.delicious.model.items.RegularTopping;

import java.util.*;

import static org.delicious.controller.HomeScreen.userInputs;

public class ToppingScreen {

    private final Set<RegularTopping> toppingsSet = new HashSet<>();

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
        return new ArrayList<>(toppingsSet);
    }

    private void selectTopping() {
        System.out.println("""
                                
                ███████╗███████╗██╗     ███████╗ ██████╗████████╗    ██╗   ██╗ ██████╗ ██╗   ██╗██████╗     ████████╗ ██████╗ ██████╗ ██████╗ ██╗███╗   ██╗ ██████╗ ███████╗██╗
                ██╔════╝██╔════╝██║     ██╔════╝██╔════╝╚══██╔══╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║██╔══██╗    ╚══██╔══╝██╔═══██╗██╔══██╗██╔══██╗██║████╗  ██║██╔════╝ ██╔════╝██║
                ███████╗█████╗  ██║     █████╗  ██║        ██║        ╚████╔╝ ██║   ██║██║   ██║██████╔╝       ██║   ██║   ██║██████╔╝██████╔╝██║██╔██╗ ██║██║  ███╗███████╗██║
                ╚════██║██╔══╝  ██║     ██╔══╝  ██║        ██║         ╚██╔╝  ██║   ██║██║   ██║██╔══██╗       ██║   ██║   ██║██╔═══╝ ██╔═══╝ ██║██║╚██╗██║██║   ██║╚════██║╚═╝
                ███████║███████╗███████╗███████╗╚██████╗   ██║          ██║   ╚██████╔╝╚██████╔╝██║  ██║       ██║   ╚██████╔╝██║     ██║     ██║██║ ╚████║╚██████╔╝███████║██╗
                ╚══════╝╚══════╝╚══════╝╚══════╝ ╚═════╝   ╚═╝          ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝       ╚═╝    ╚═════╝ ╚═╝     ╚═╝     ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚══════╝╚═╝
                                
                                                          ██████████            ██████             \s
                                                    ░░░░░░██████████████    ████████████           \s
                                            ████████░░░░░░░░░░░░░░░░████  ██████░░██████           \s
                                        ████████████████░░░░░░░░░░░░▒▒▒▒▒▒████░░░░░░████           \s
                                    ████████      ░░██████░░░░░░░░░░▒▒▒▒████▒▒░░░░░░████           \s
                                  ██████          ░░░░████████░░░░▒▒▒▒▒▒████░░░░░░░░████           \s
                                ██████        ░░░░░░░░████████████▒▒▒▒██████░░░░░░░░████           \s
                              ██████        ░░░░░░░░░░░░░░░░░░██▒▒▒▒██████▓▓░░░░░░░░▓▓██           \s
                              ████        ░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒████▓▓░░░░░░░░░░░░░░████         \s
                                        ░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒██░░░░░░░░░░░░░░░░░░████         \s
                        ████▒▒        ░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒████░░░░░░░░░░░░░░▒▒▒▒▓▓████       \s
                    ▓▓████████████    ░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒████░░░░░░░░░░░░░░▒▒▒▒▒▒████       \s
                  ██████████████████████████░░░░░░░░░░░░░░░░▒▒▒▒████░░░░░░░░░░░░░░░░▒▒▒▒████       \s
                  ████░░░░░░░░░░██████████████████░░░░░░░░░░▒▒▒▒████░░░░░░░░░░░░░░░░▒▒▒▒▒▒██       \s
                ████████░░░░░░░░░░░░░░░░░░░░▓▓██████░░░░░░░░▒▒▒▒▓▓██░░░░░░░░░░░░░░░░▒▒▒▒▒▒████     \s
                ██████████░░░░░░░░░░░░░░░░░░░░░░██████░░░░░░▒▒▒▒▒▒████░░░░░░░░░░░░░░▒▒▒▒▒▒████     \s
                    ▒▒████░░░░░░░░░░░░░░░░░░░░░░░░████▒▒░░▒▒▒▒▒▒▒▒████░░░░░░░░░░░░░░▒▒▒▒▒▒████     \s
                        ████░░░░░░░░░░░░░░░░░░░░░░██████▒▒▒▒▒▒████████░░░░░░░░░░░░░░▒▒▒▒▒▒████     \s
                        ████░░░░░░░░░░░░░░░░░░░░░░▓▓████▒▒▒▒▒▒██████░░░░░░░░░░░░░░░░▒▒▒▒▒▒████     \s
                        ████░░░░░░░░░░░░░░░░░░░░░░░░████▒▒▒▒████░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒████     \s
                        ████░░░░░░░░░░░░░░░░░░░░░░░░████▒▒████▓▓░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒████     \s
                        ████░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒████░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒████     \s
                        ████░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒████░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒████     \s
                          ████░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒████░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒████       \s
                          ████░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒████░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒████       \s
                          ██████░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▓▓████░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒████       \s
                            ████░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒████░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒████         \s
                            ██████░░░░░░░░░░░░░░░░░░░░░░░░░░████░░░░░░░░░░░░▒▒▒▒▒▒▒▒██████         \s
                              ██████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒████           \s
                                ██████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒██████           \s
                                  ██████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒██████             \s
                                    ██████░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒██████               \s
                                      ████████░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒████████                 \s
                                          ████████▒▒░░░░░░░░░░▒▒▒▒▒▒▒▒██████████                   \s
                                             ████████████████████████████████

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
                    toppingsSet.add(new RegularTopping("Lettuce"));
                    System.out.println(toppingsSet.add(new RegularTopping("Lettuce")));
                }
                case 2 -> {
                    System.out.println("You have selected Peppers!");
                    toppingsSet.add(new RegularTopping("Peppers"));
                }
                case 3 -> {
                    System.out.println("You have selected Onions!");
                    toppingsSet.add(new RegularTopping("Onions"));
                }
                case 4 -> {
                    System.out.println("You have selected Tomatoes!");
                    toppingsSet.add(new RegularTopping("Tomatoes"));
                }
                case 5 -> {
                    System.out.println("You have selected Jalapenos!");
                    toppingsSet.add(new RegularTopping("Jalapenos"));
                }
                case 6 -> {
                    System.out.println("You have selected Cucumbers!");
                    toppingsSet.add(new RegularTopping("Cucumbers"));
                }
                case 7 -> {
                    System.out.println("You have selected Pickles!");
                    toppingsSet.add(new RegularTopping("Pickles"));
                }
                case 8 -> {
                    System.out.println("You have selected Guacamole!");
                    toppingsSet.add(new RegularTopping("Guacamole"));
                }
                case 9 -> {
                    System.out.println("You have selected Mushrooms!");
                    toppingsSet.add(new RegularTopping("Mushrooms"));
                }
                case 10 -> {
                    System.out.println("Moving right along!");
                    System.out.println("Here are all of your toppings:");
                    for (RegularTopping topping : toppingsSet) {
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
                                                                                                       \s
                                                    ██              ██                                 \s
                                                  ██░░██          ██▒▒██                               \s
                                                  ██░░██          ██▒▒██                               \s
                                                  ██░░██          ██▒▒██                               \s
                                                ██████████      ██████████                             \s
                                              ██░░░░░░░░░░██  ██▒▒▒▒▒▒▒▒▒▒██                           \s
                                              ██████████████  ██████████████                           \s
                                              ██░░░░░░░░░░██  ██▒▒▒▒▒▒▒▒▒▒██                           \s
                                              ██░░░░░░░░░░██  ██▒▒▒▒▒▒▒▒▒▒██                           \s
                                              ██░░░░░░░░░░██  ██▒▒▒▒▒▒▒▒▒▒██                           \s
                                              ██░░░░░░░░░░██  ██▒▒▒▒▒▒▒▒▒▒██                           \s
                                              ██░░░░░░░░░░██  ██▒▒▒▒▒▒▒▒▒▒██                           \s
                                              ██░░░░░░░░░░██  ██▒▒▒▒▒▒▒▒▒▒██                           \s
                                              ██░░░░░░░░░░██  ██▒▒▒▒▒▒▒▒▒▒██                           \s
                                              ██░░░░░░░░░░██  ██▒▒▒▒▒▒▒▒▒▒██                           \s
                                              ██░░░░░░░░░░██  ██▒▒▒▒▒▒▒▒▒▒██                           \s
                                              ██████████████  ██████████████                           \s
                                
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
                    toppingsSet.add(new RegularTopping("Mayo"));
                }
                case 2 -> {
                    System.out.println("You have selected Mustard!");
                    toppingsSet.add(new RegularTopping("Mustard"));
                }
                case 3 -> {
                    System.out.println("You have selected Ketchup!");
                    toppingsSet.add(new RegularTopping("Ketchup"));
                }
                case 4 -> {
                    System.out.println("You have selected Ranch!");
                    toppingsSet.add(new RegularTopping("Ranch"));
                }
                case 5 -> {
                    System.out.println("You have selected Thousand Islands!");
                    toppingsSet.add(new RegularTopping("Thousand Islands"));
                }
                case 6 -> {
                    System.out.println("You have selected Vinaigrette!");
                    toppingsSet.add(new RegularTopping("Vinaigrette"));
                }
                case 7 -> {
                    System.out.println("Moving on...");
                    System.out.println("Here are all of your toppings:");
                    for (RegularTopping sauces : toppingsSet) {
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

                                                                                        ▒▒▒▒▓▓               \s
                                                                                    ████      ██▓▓           \s
                                                                                  ██      ░░░░██▓▓           \s
                                                                                ██      ░░████               \s
                                                                              ▓▓    ░░▓▓██                   \s
                                                  ▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓  ░░  ▓▓                       \s
                                            ██████                        ░░      ██                         \s
                                        ▓▓▓▓      ░░                          ░░  ▒▒████                     \s
                                      ██    ░░                              ░░    ░░    ██                   \s
                                    ▓▓  ░░▒▒    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒    ░░▒▒▒▒    ▒▒░░  ▓▓                 \s
                                    ██  ░░▒▒    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒    ░░▒▒▒▒    ▒▒░░  ██                 \s
                                  ██  ░░▒▒  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ▒▒  ▒▒▒▒    ░░▒▒  ▒▒▒▒▒▒  ▒▒░░  ██               \s
                                  ██  ▒▒  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ▒▒  ▒▒▒▒    ░░▒▒  ▒▒  ▒▒▒▒▒▒  ▒▒  ██               \s
                                  ██  ▒▒  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒            ▒▒▒▒  ▒▒▒▒▒▒  ▒▒  ██               \s
                                  ██  ░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒▒▒▒▒░░  ██               \s
                                  ██    ░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                ▒▒▒▒▒▒▒▒▒▒░░    ██               \s
                                  ██      ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░      ██               \s
                                  ██▓▓            ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░              ██               \s
                                  ██▒▒                            ░░░░░░              ░░    ██               \s
                                  ██▓▓  ▒▒▒▒                                        ▒▒▒▒    ██               \s
                                  ██  ▒▒  ▒▒▒▒                                  ░░▒▒▒▒░░    ██               \s
                                  ██░░      ▒▒      ▒▒▒▒▒▒▒▒        ▒▒▒▒▒▒▒▒    ░░▒▒░░      ██               \s
                                    ██      ▒▒    ▒▒▒▒░░░░▒▒▒▒    ▒▒▒▒░░░░▒▒▒▒    ▒▒      ▓▓                 \s
                                    ██        ▓▓▒▒▒▒        ▒▒▓▓▓▓▒▒        ▒▒▒▒▓▓        ██                 \s
                                    ██░░                                    ░░░░░░░░    ░░██                 \s
                                      ▓▓                                    ░░      ░░  ▓▓                   \s
                                      ██░░                                            ░░██                   \s
                                      ░░▓▓░░                                        ░░▓▓░░                   \s
                                          ▓▓░░                            ░░      ░░▓▓░░                     \s
                                            ████░░                  ░░        ░░████                         \s
                                                ██▓▓▓▓░░░░            ░░░░▓▓▓▓██                             \s
                                                    ░░▓▓██░░▓▓██▓▓████████                                   \s
                
                1. Au Jus
                2. Sauce
                3. Let's keep it moving!
                """);

        boolean exit = false;
        while (!exit) {
            switch (userInputs(new Scanner(System.in))) {
                case 1 -> {
                    System.out.println("You have selected Au Jus!");
                    toppingsSet.add(new RegularTopping("Au Jus"));
                }
                case 2 -> {
                    System.out.println("You have selected Sauce!");
                    toppingsSet.add(new RegularTopping("Sauce"));
                }
                case 3 -> {
                    System.out.println("Moving on...");
                    System.out.println("Here are all of your toppings:");
                    for (RegularTopping sides : toppingsSet)
                        System.out.println(sides.getName());

                    exit = true;
                    // TODO - move to next menu
                }
                default -> System.out.println("Invalid Input! Please type only numbers 1-2.");
            }
        }
    }
}
