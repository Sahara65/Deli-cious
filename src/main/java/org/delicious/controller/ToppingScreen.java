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
            System.out.println(bold+"""
                    
                    ███████╗███████╗██╗     ███████╗ ██████╗████████╗    ██╗   ██╗ ██████╗ ██╗   ██╗██████╗     ████████╗██╗   ██╗██████╗ ███████╗     ██████╗ ███████╗    ████████╗ ██████╗ ██████╗ ██████╗ ██╗███╗   ██╗ ██████╗ ███████╗██╗
                    ██╔════╝██╔════╝██║     ██╔════╝██╔════╝╚══██╔══╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║██╔══██╗    ╚══██╔══╝╚██╗ ██╔╝██╔══██╗██╔════╝    ██╔═══██╗██╔════╝    ╚══██╔══╝██╔═══██╗██╔══██╗██╔══██╗██║████╗  ██║██╔════╝ ██╔════╝██║
                    ███████╗█████╗  ██║     █████╗  ██║        ██║        ╚████╔╝ ██║   ██║██║   ██║██████╔╝       ██║    ╚████╔╝ ██████╔╝█████╗      ██║   ██║█████╗         ██║   ██║   ██║██████╔╝██████╔╝██║██╔██╗ ██║██║  ███╗███████╗██║
                    ╚════██║██╔══╝  ██║     ██╔══╝  ██║        ██║         ╚██╔╝  ██║   ██║██║   ██║██╔══██╗       ██║     ╚██╔╝  ██╔═══╝ ██╔══╝      ██║   ██║██╔══╝         ██║   ██║   ██║██╔═══╝ ██╔═══╝ ██║██║╚██╗██║██║   ██║╚════██║╚═╝
                    ███████║███████╗███████╗███████╗╚██████╗   ██║          ██║   ╚██████╔╝╚██████╔╝██║  ██║       ██║      ██║   ██║     ███████╗    ╚██████╔╝██║            ██║   ╚██████╔╝██║     ██║     ██║██║ ╚████║╚██████╔╝███████║██╗
                    ╚══════╝╚══════╝╚══════╝╚══════╝ ╚═════╝   ╚═╝          ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝       ╚═╝      ╚═╝   ╚═╝     ╚══════╝     ╚═════╝ ╚═╝            ╚═╝    ╚═════╝ ╚═╝     ╚═╝     ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚══════╝╚═╝
                                    
                    1. 𝑻𝒐𝒑𝒑𝒊𝒏𝒈𝒔
                    2. 𝑺𝒂𝒖𝒄𝒆𝒔
                    3. 𝑺𝒊𝒅𝒆𝒔
                    4. 𝑪𝒐𝒏𝒕𝒊𝒏𝒖𝒆 𝒐𝒏𝒘𝒂𝒓𝒅𝒔!
                    """);

            switch (userInputs(new Scanner(System.in))) {
                case 1 -> selectTopping();
                case 2 -> selectSauce();
                case 3 -> selectSide();
                case 4 -> play = false;
                default -> System.out.println(red + bold + "Invalid input! Please enter numbers 1-4." + reset + yellow);

            }
        }
        return new ArrayList<>(toppingsSet);
    }

    private void selectTopping() {
        System.out.println(bold+"""
                                
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

                1. 𝑳𝒆𝒕𝒕𝒖𝒄𝒆
                2. 𝑷𝒆𝒑𝒑𝒆𝒓𝒔
                3. 𝑶𝒏𝒊𝒐𝒏𝒔
                4. 𝑻𝒐𝒎𝒂𝒕𝒐𝒆𝒔
                5. 𝑱𝒂𝒍𝒂𝒑𝒆𝒏𝒐𝒔
                6. 𝑪𝒖𝒄𝒖𝒎𝒃𝒆𝒓𝒔
                7. 𝑷𝒊𝒄𝒌𝒍𝒆𝒔
                8. 𝑮𝒖𝒂𝒄𝒂𝒎𝒐𝒍𝒆
                9. 𝑴𝒖𝒔𝒉𝒓𝒐𝒐𝒎𝒔
                10. 𝑳𝒆𝒕❜𝒔 𝒌𝒆𝒆𝒑 𝒊𝒕 𝒎𝒐𝒗𝒊𝒏𝒈!
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
                default -> System.out.println(red + bold + "Invalid Input! Please type only numbers 1-10." + reset + yellow);
            }
        }
    }

    private void selectSauce() {
        System.out.println(bold+"""
                                
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
                                
                1. 𝑴𝒂𝒚𝒐
                2. 𝑴𝒖𝒔𝒕𝒂𝒓𝒅
                3. 𝑲𝒆𝒕𝒄𝒉𝒖𝒑
                4. 𝑹𝒂𝒏𝒄𝒉
                5. 𝑻𝒉𝒐𝒖𝒔𝒂𝒏𝒅 𝑰𝒔𝒍𝒂𝒏𝒅𝒔
                6. 𝑽𝒊𝒏𝒂𝒊𝒈𝒓𝒆𝒕𝒕𝒆
                7. 𝑳𝒆𝒕❜𝒔 𝒌𝒆𝒆𝒑 𝒊𝒕 𝒎𝒐𝒗𝒊𝒏𝒈!
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
                default -> System.out.println(red + bold + "Invalid Input! Please type only numbers 1-7." + reset + yellow);
            }
        }
    }

    private void selectSide() {
        System.out.println(bold+"""
                                
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
                
                1. 𝑨𝒖 𝑱𝒖𝒔
                2. 𝑺𝒂𝒖𝒄𝒆
                3. 𝑳𝒆𝒕❜𝒔 𝒌𝒆𝒆𝒑 𝒊𝒕 𝒎𝒐𝒗𝒊𝒏𝒈!
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
                }
                default -> System.out.println(red + bold + "Invalid Input! Please type only numbers 1-2." + reset + yellow);
            }
        }
    }
}
