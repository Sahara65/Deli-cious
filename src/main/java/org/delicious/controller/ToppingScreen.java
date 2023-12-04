package org.delicious.controller;

import org.delicious.model.items.RegularTopping;

import java.util.*;

import static org.delicious.controller.HomeScreen.userInputs;
import static org.delicious.view.AnsiColorCodes.*;

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
                    System.out.println(italic + "You have selected Lettuce! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Lettuce"));
                }
                case 2 -> {
                    System.out.println(italic + "You have selected Peppers! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Peppers"));
                }
                case 3 -> {
                    System.out.println(italic + "You have selected Onions! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Onions"));
                }
                case 4 -> {
                    System.out.println(italic + "You have selected Tomatoes! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Tomatoes"));
                }
                case 5 -> {
                    System.out.println(italic + "You have selected Jalapenos! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Jalapenos"));
                }
                case 6 -> {
                    System.out.println(italic + "You have selected Cucumbers! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Cucumbers"));
                }
                case 7 -> {
                    System.out.println(italic + "You have selected Pickles! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Pickles"));
                }
                case 8 -> {
                    System.out.println(italic + "You have selected Guacamole! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Guacamole"));
                }
                case 9 -> {
                    System.out.println(italic + "You have selected Mushrooms! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Mushrooms"));
                }
                case 10 -> {
                    System.out.println(italic + "Moving right along!");
                    System.out.println("Here are all of your toppings:" + reset + yellow);
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
                    System.out.println(italic + "You have selected Mayo! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Mayo"));
                }
                case 2 -> {
                    System.out.println(italic + "You have selected Mustard! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Mustard"));
                }
                case 3 -> {
                    System.out.println(italic + "You have selected Ketchup! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Ketchup"));
                }
                case 4 -> {
                    System.out.println(italic + "You have selected Ranch! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Ranch"));
                }
                case 5 -> {
                    System.out.println(italic + "You have selected Thousand Islands! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Thousand Islands"));
                }
                case 6 -> {
                    System.out.println(italic + "You have selected Vinaigrette! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Vinaigrette"));
                }
                case 7 -> {
                    System.out.println(italic + "Moving on...");
                    System.out.println("Here are all of your toppings:" + reset + yellow);
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
                    System.out.println(italic + "You have selected Au Jus! Please continue selecting!"  + reset + yellow);
                    toppingsSet.add(new RegularTopping("Au Jus"));
                }
                case 2 -> {
                    System.out.println(italic + "You have selected Sauce! Please continue selecting!" + reset + yellow);
                    toppingsSet.add(new RegularTopping("Sauce"));
                }
                case 3 -> {
                    System.out.println(italic + "Moving on...");
                    System.out.println("Here are all of your toppings:" + reset + yellow);
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
