package org.delicious.controller;

import org.delicious.model.items.RegularTopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.delicious.controller.HomeScreen.userInputs;
import static org.delicious.view.AnsiColorCodes.*;

public class ToppingScreen {

    private final List<RegularTopping> toppings = new ArrayList<>();

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
            }
        }
        return toppings;
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
                10. 𝑳𝒆𝒕❜𝒔 𝒎𝒐𝒗𝒆 𝒐𝒏 𝒕𝒐 𝒕𝒉𝒆 𝑺𝒂𝒖𝒄𝒆!
                """);

        boolean exit = false;
        while (!exit) {
            switch (userInputs(new Scanner(System.in))) {
                case 1 -> {
                    System.out.println(italic + "You have selected Lettuce! Please continue selecting!" + reset + yellow);
                    toppings.add(new RegularTopping("Lettuce"));
                }
                case 2 -> {
                    System.out.println(italic + "You have selected Peppers!" + reset + yellow);
                    toppings.add(new RegularTopping("Peppers"));
                }
                case 3 -> {
                    System.out.println(italic + "You have selected Onions!" + reset + yellow);
                    toppings.add(new RegularTopping("Onions"));
                }
                case 4 -> {
                    System.out.println(italic + "You have selected Tomatoes!" + reset + yellow);
                    toppings.add(new RegularTopping("Tomatoes"));
                }
                case 5 -> {
                    System.out.println(italic + "You have selected Jalapenos!" + reset + yellow);
                    toppings.add(new RegularTopping("Jalapenos"));
                }
                case 6 -> {
                    System.out.println(italic + "You have selected Cucumbers!" + reset + yellow);
                    toppings.add(new RegularTopping("Cucumbers"));
                }
                case 7 -> {
                    System.out.println(italic + "You have selected Pickles!" + reset + yellow);
                    toppings.add(new RegularTopping("Pickles"));
                }
                case 8 -> {
                    System.out.println(italic + "You have selected Guacamole!" + reset + yellow);
                    toppings.add(new RegularTopping("Guacamole"));
                }
                case 9 -> {
                    System.out.println(italic + "You have selected Mushrooms!" + reset + yellow);
                    toppings.add(new RegularTopping("Mushrooms"));
                }
                case 10 -> {
                    System.out.println(italic + "Moving right along!");
                    System.out.println("Here are all of your toppings:" + reset + yellow);
                    for (RegularTopping topping : toppings) {
                        System.out.println(topping.getName());
                    }
                    exit = true;
                }
                default -> System.out.println(red + bold + "Invalid Input! Please type only numbers 1-10.");
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
                    System.out.println(italic + "You have selected Mayo!" + reset + yellow);
                    toppings.add(new RegularTopping("Mayo"));
                }
                case 2 -> {
                    System.out.println(italic + "You have selected Mustard!" + reset + yellow);
                    toppings.add(new RegularTopping("Mustard"));
                }
                case 3 -> {
                    System.out.println(italic + "You have selected Ketchup!" + reset + yellow);
                    toppings.add(new RegularTopping("Ketchup"));
                }
                case 4 -> {
                    System.out.println(italic + "You have selected Ranch!" + reset + yellow);
                    toppings.add(new RegularTopping("Ranch"));
                }
                case 5 -> {
                    System.out.println(italic + "You have selected Thousand Islands!" + reset + yellow);
                    toppings.add(new RegularTopping("Thousand Islands"));
                }
                case 6 -> {
                    System.out.println(italic + "You have selected Vinaigrette!" + reset + yellow);
                    toppings.add(new RegularTopping("Vinaigrette"));
                }
                case 7 -> {
                    System.out.println(italic + "Moving on...");
                    System.out.println("Here are all of your toppings:" + reset + yellow);
                    for (RegularTopping sauces : toppings) {
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
                    System.out.println(italic + "You have selected Au Jus!"  + reset + yellow);
                    toppings.add(new RegularTopping("Au Jus"));
                }
                case 2 -> {
                    System.out.println(italic + "You have selected Sauce!" + reset + yellow);
                    toppings.add(new RegularTopping("Sauce"));
                }
                case 3 -> {
                    System.out.println(italic + "Moving on...");
                    System.out.println("Here are all of your toppings:" + reset + yellow);
                    for (RegularTopping sides : toppings)
                        System.out.println(sides.getName());

                    exit = true;
                    // TODO - move to next menu
                }
                default -> System.out.println(red + bold +"Invalid Input! Please type only numbers 1-2." + reset + yellow);
            }
        }
    }
}
