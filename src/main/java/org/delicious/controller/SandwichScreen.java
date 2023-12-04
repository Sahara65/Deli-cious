package org.delicious.controller;

import org.delicious.model.items.*;

import java.util.List;
import java.util.Scanner;

import static org.delicious.controller.HomeScreen.userInputs;
import static org.delicious.view.AnsiColorCodes.*;

public class SandwichScreen {
    public static void createSandwich() {
        BreadType breadChoice = selectBread();
        BreadSize breadSizeChoice = selectBreadSize();
        Sandwich sandwich = new Sandwich(breadSizeChoice, breadChoice);

        PremiumTopping meatChoice = selectMeat();
        if (meatChoice != null) {
            sandwich.addPremiumToppings(meatChoice);
            if (selectExtra()) {
                PremiumTopping extraMeatChoice = new PremiumTopping(meatChoice.getName());
                extraMeatChoice.setExtra(true);
                sandwich.addPremiumToppings(extraMeatChoice);
            }
        }

        PremiumTopping cheeseChoice = selectCheese();
        if (cheeseChoice != null) {
            sandwich.addPremiumToppings(cheeseChoice);
            if (selectExtra()) {
                PremiumTopping extraCheeseChoice = new PremiumTopping(cheeseChoice.getName());
                extraCheeseChoice.setExtra(true);
                sandwich.addPremiumToppings(extraCheeseChoice);
            }
        }

        ToppingScreen toppingScreen = new ToppingScreen();
        List<RegularTopping> toppings = toppingScreen.createToppings();

        sandwich.addAllRegularToppings(toppings);

        boolean isToasted = selectToasted();
        sandwich.setToasted(isToasted);

        System.out.println(bold + "Your sandwich will cost:" + sandwich.getPrice() + reset + yellow);
    }

    private static BreadType selectBread() {
        System.out.println(bold + """
                                
                ▒███████╗███████╗██╗     ███████╗ ██████╗████████╗    ██╗   ██╗ ██████╗ ██╗   ██╗██████╗     ██████╗ ██████╗ ███████╗ █████╗ ██████╗ ██╗
                 ██╔════╝██╔════╝██║     ██╔════╝██╔════╝╚══██╔══╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║██╔══██╗    ██╔══██╗██╔══██╗██╔════╝██╔══██╗██╔══██╗██║
                 ███████╗█████╗  ██║     █████╗  ██║        ██║        ╚████╔╝ ██║   ██║██║   ██║██████╔╝    ██████╔╝██████╔╝█████╗  ███████║██║  ██║██║
                 ╚════██║██╔══╝  ██║     ██╔══╝  ██║        ██║         ╚██╔╝  ██║   ██║██║   ██║██╔══██╗    ██╔══██╗██╔══██╗██╔══╝  ██╔══██║██║  ██║╚═╝
                 ███████║███████╗███████╗███████╗╚██████╗   ██║          ██║   ╚██████╔╝╚██████╔╝██║  ██║    ██████╔╝██║  ██║███████╗██║  ██║██████╔╝██╗
                 ╚══════╝╚══════╝╚══════╝╚══════╝ ╚═════╝   ╚═╝          ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═════╝ ╚═╝
                                
                                                                ██████████████                         \s
                                                        ████████▓▓▓▓██░░░░██▓▓████                     \s
                                                ████████░░░░░░░░██▓▓██░░░░██▓▓▓▓▓▓██                   \s
                                            ████░░██▓▓▓▓██░░░░░░██▓▓▓▓██░░██▓▓▓▓▓▓▓▓██                 \s
                                        ████░░░░░░░░██▓▓▓▓██░░░░██▓▓▓▓██░░██▓▓▓▓▓▓▓▓██                 \s
                                      ██▓▓▓▓██░░░░░░░░██▓▓▓▓██░░██▓▓▓▓██░░██▓▓▓▓▓▓██                   \s
                                    ██▓▓▓▓▓▓▓▓██░░░░░░██▓▓▓▓██░░██▓▓▓▓██░░██▓▓▓▓▓▓██                   \s
                                    ██▓▓▓▓▓▓▓▓▓▓██░░░░██▓▓▓▓██░░██▓▓▓▓▓▓██▓▓▓▓▓▓▓▓██                   \s
                                    ██▓▓▓▓▓▓▓▓▓▓▓▓██░░██▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██                     \s
                                    ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████                       \s
                                    ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████                           \s
                                      ████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████                               \s
                                          ████████▓▓▓▓▓▓▓▓▓▓▓▓██████                                   \s
                                                  ████████████                                         \s
                                
                                
                                
                1. 𝑾𝒉𝒊𝒕𝒆 𝑩𝒓𝒆𝒂𝒅
                2. 𝑾𝒉𝒆𝒂𝒕 𝑩𝒓𝒆𝒂𝒅
                3. 𝑹𝒚𝒆 𝑩𝒓𝒆𝒂𝒅
                4. 𝑾𝒓𝒂𝒑
                """);

        BreadType type = BreadType.WHITE;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> System.out.println(italic + "You have selected White Bread!" + reset + yellow);
            case 2 -> {
                System.out.println(italic + "You have selected Wheat Bread!" + reset + yellow);
                type = BreadType.WHEAT;
            }
            case 3 -> {
                System.out.println(italic + "You have selected Rye Bread!" + reset + yellow);
                type = BreadType.RYE;
            }
            case 4 -> {
                System.out.println(italic + "You have selected Wrap!" + reset + yellow);
                type = BreadType.WRAP;
            }
        }
        return type;
    }

    private static BreadSize selectBreadSize() {
        System.out.println(bold + """
                                
                ███████╗███████╗██╗     ███████╗ ██████╗████████╗    ██╗   ██╗ ██████╗ ██╗   ██╗██████╗     ███████╗ █████╗ ███╗   ██╗██████╗ ██╗    ██╗██╗ ██████╗██╗  ██╗    ███████╗██╗███████╗███████╗██╗
                ██╔════╝██╔════╝██║     ██╔════╝██╔════╝╚══██╔══╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║██╔══██╗    ██╔════╝██╔══██╗████╗  ██║██╔══██╗██║    ██║██║██╔════╝██║  ██║    ██╔════╝██║╚══███╔╝██╔════╝██║
                ███████╗█████╗  ██║     █████╗  ██║        ██║        ╚████╔╝ ██║   ██║██║   ██║██████╔╝    ███████╗███████║██╔██╗ ██║██║  ██║██║ █╗ ██║██║██║     ███████║    ███████╗██║  ███╔╝ █████╗  ██║
                ╚════██║██╔══╝  ██║     ██╔══╝  ██║        ██║         ╚██╔╝  ██║   ██║██║   ██║██╔══██╗    ╚════██║██╔══██║██║╚██╗██║██║  ██║██║███╗██║██║██║     ██╔══██║    ╚════██║██║ ███╔╝  ██╔══╝  ╚═╝
                ███████║███████╗███████╗███████╗╚██████╗   ██║          ██║   ╚██████╔╝╚██████╔╝██║  ██║    ███████║██║  ██║██║ ╚████║██████╔╝╚███╔███╔╝██║╚██████╗██║  ██║    ███████║██║███████╗███████╗██╗
                ╚══════╝╚══════╝╚══════╝╚══════╝ ╚═════╝   ╚═╝          ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝    ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝  ╚══╝╚══╝ ╚═╝ ╚═════╝╚═╝  ╚═╝    ╚══════╝╚═╝╚══════╝╚══════╝╚═╝
                                
                                                                          ██                                   \s
                                                                    ██▓▓░░░░▓▓                                 \s
                                                              ██▓▓██  ▒▒░░    ██                               \s
                                                          ████      ██  ▒▒▓▓    ██                             \s
                                            ▓▓██    ████▓▓░░░░░░░░  ░░▓▓  ▒▒░░  ░░▓▓                           \s
                                          ██    ████  ░░  ██    ▒▒▒▒    ▓▓  ▒▒░░    ██                         \s
                                        ██      ▒▒░░▒▒      ██    ▒▒▒▒    ██  ▒▒▓▓    ████                     \s
                                      ████░░      ▒▒▒▒▒▒      ██    ░░▒▒    ██  ░░▒▒      ██████               \s
                                ██▓▓▓▓  ██░░░░      ▒▒▒▒░░    ░░██    ░░░░    ▓▓  ░░▒▒░░  ░░██░░▓▓▒▒           \s
                            ████      ▒▒██░░░░░░      ▒▒▒▒▒▒      ██    ▒▒▒▒    ██  ▒▒▒▒▓▓    ██    ████       \s
                        ████    ▒▒▒▒▒▒░░██░░░░░░░░      ▒▒░░▒▒      ██    ░░▒▒    ██    ░░▒▒░░██▒▒▒▒    ██     \s
                      ██░░  ▒▒▒▒░░░░░░░░██░░░░░░░░░░      ▒▒▒▒▒▒░░  ░░▓▓    ▒▒▒▒  ░░██    ▒▒░░░░██░░▒▒▒▒░░▓▓   \s
                    ██  ▒▒▒▒░░░░░░░░░░░░██░░░░░░░░░░░░      ▒▒▒▒░░░░    ██    ▒▒▒▒  ░░██░░▒▒░░░░██░░░░░░▒▒  ██ \s
                  ██  ▒▒░░░░░░░░░░░░░░░░██░░░░░░░░░░░░░░      ▒▒▒▒░░      ██░░░░▒▒░░░░██░░▒▒▓▓░░██░░░░░░░░▒▒  ██
                  ██  ▒▒░░░░░░░░▓▓░░░░░░██░░░░░░░░░░░░░░░░      ▒▒░░▒▒░░░░██░░░░▒▒▒▒░░██░░▒▒▒▒░░██░░░░░░░░▒▒  ██
                ██  ▒▒░░░░██████▒▒██░░░░██░░░░░░░░░░░░░░░░░░░░    ▒▒▒▒░░░░██░░░░▒▒▒▒░░██░░▒▒▒▒░░██░░░░░░░░▒▒  ██
                ██  ▒▒░░░░██▒▒▒▒▓▓██░░░░░░██░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒░░░░██░░░░▒▒▒▒░░██░░▒▒▒▒░░██░░░░░░░░▒▒  ██
                ██  ▒▒░░██▓▓▓▓▒▒▓▓▓▓████░░░░██░░░░░░░░░░░░░░░░░░░░▒▒▒▒░░░░██░░▓▓▒▒▒▒░░██░░▒▒▒▒░░██░░░░░░░░▒▒  ██
                ██  ▒▒░░██▒▒▒▒▒▒▓▓▓▓▒▒▒▒██░░░░██░░░░░░░░░░░░░░░░░░▒▒▒▒░░░░██░░▒▒░░▒▒░░██░░██████░░░░░░░░▒▒  ██ \s
                ██  ▒▒░░░░██▒▒▒▒▓▓▒▒▓▓██████░░░░██░░░░░░░░░░░░░░░░▒▒▒▒░░░░██░░▒▒▒▒░░░░████░░░░░░░░░░░░░░▒▒  ██ \s
                  ██  ▒▒░░░░██▒▒▓▓████▓▓▒▒▒▒██░░░░██░░░░░░░░░░░░░░▒▒▒▒░░░░██░░▒▒▒▒░░██░░░░░░░░░░░░░░░░░░  ██   \s
                  ██  ▒▒░░░░██████▓▓▓▓▒▒▓▓▓▓██░░░░▒▒██░░░░░░░░░░▒▒▒▒░░░░██░░░░▒▒▒▒████░░░░░░░░░░░░░░    ██     \s
                    ██  ░░░░░░░░░░██▓▓▓▓▓▓▓▓██░░░░░░██░░░░░░░░░░░░▒▒░░░░██░░░░████░░░░░░░░░░░░░░    ████       \s
                      ██    ░░░░░░░░████████░░░░░░░░░░██  ░░░░░░▒▒░░░░████████░░░░░░░░░░░░░░    ████           \s
                        ██▓▓    ░░░░░░▒▒▒▒░░░░░░░░░░░░░░▓▓░░░░░░██████░░░░░░░░░░░░░░░░      ████               \s
                            ████      ░░░░░░░░░░░░░░░░░░░░██████░░░░░░░░░░░░░░░░      ██████                   \s
                                ██████            ░░░░░░░░░░░░░░░░              ██████                         \s
                                  ░░  ██▒▒██▓▓████                ████▒▒▒▒▒▒▓▓▓▓                               \s
                                                  ████████████████                                             \s
                                
                                
                1. 4 𝒊𝒏𝒄𝒉𝒆𝒔
                2. 8 𝒊𝒏𝒄𝒉𝒆𝒔
                3. 12 𝒊𝒏𝒄𝒉𝒆𝒔
                """);

        BreadSize size = BreadSize.EIGHT_INCH;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println(italic + "You have selected 4 inches!" + reset + yellow);
                size = BreadSize.FOUR_INCH;
            }
            case 2 -> System.out.println(italic + "You have selected 8 inches!" + reset + yellow);
            case 3 -> {
                System.out.println(italic + "You have selected 12 inches!" + reset + yellow);
                size = BreadSize.TWELVE_INCH;
            }
        }
        return size;
    }

    private static PremiumTopping selectMeat() {
        System.out.println(bold + """
                                
                ███████╗███████╗██╗     ███████╗ ██████╗████████╗    ██╗   ██╗ ██████╗ ██╗   ██╗██████╗     ███╗   ███╗███████╗ █████╗ ████████╗██╗
                ██╔════╝██╔════╝██║     ██╔════╝██╔════╝╚══██╔══╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║██╔══██╗    ████╗ ████║██╔════╝██╔══██╗╚══██╔══╝██║
                ███████╗█████╗  ██║     █████╗  ██║        ██║        ╚████╔╝ ██║   ██║██║   ██║██████╔╝    ██╔████╔██║█████╗  ███████║   ██║   ██║
                ╚════██║██╔══╝  ██║     ██╔══╝  ██║        ██║         ╚██╔╝  ██║   ██║██║   ██║██╔══██╗    ██║╚██╔╝██║██╔══╝  ██╔══██║   ██║   ╚═╝
                ███████║███████╗███████╗███████╗╚██████╗   ██║          ██║   ╚██████╔╝╚██████╔╝██║  ██║    ██║ ╚═╝ ██║███████╗██║  ██║   ██║   ██╗
                ╚══════╝╚══════╝╚══════╝╚══════╝ ╚═════╝   ╚═╝          ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝    ╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝
                                
                ⠀⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠄⠀⠀⠀⠠⠀⠀⠀⠠⠀⠀⠠⠀⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠄⠀⠀⠀⠄⠀⠀⠠⠀⠀⠀⠠⠀⠀⠀⠠⠀
                ⠀⠀⠄⠀⠀⠀⠀⠀⣀⠠⠀⠀⠀⠄⠀⠀⢸⡟⡙⠳⣄⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠠⠀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀
                ⠀⠀⠀⠀⠀⢰⣾⡷⠷⢛⢻⡤⠀⠀⠀⣶⣿⡽⣬⢳⣌⠷⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠠⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠠⠀⠀⠀⠠⠀⠀⠀⠈⠀⠀⠀⠁⠀⠀⠄⠀⠀⠀⠀⠂
                ⠀⠀⠀⠀⠀⠈⢿⣆⠰⠈⡄⡇⠀⠀⠀⠙⠛⠿⠻⠿⠾⢿⣶⣟⣿⢿⣶⣶⣦⣴⣤⣶⣶⣶⣛⢞⡛⢳⠛⡞⠶⠶⠦⣤⣤⣄⣀⠀⠀⠀⠀⠠⠀⠀⠀⠐⠀⠀⠀⠐⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠀⠂⠀⠀⠐⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠙⣧⠌⡐⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣿⢛⠛⣉⣉⢉⡉⢉⠉⠙⠛⠛⠳⠿⢶⣽⣆⣳⢤⡢⢤⣉⠟⣲⢦⣄⡀⠀⠀⠀⠀⠀⠐⠀⠀⠀⠀⠀⠀⠀⠂⠀⠀⠐⠀⠀⠀⠀⠀⠀⠀⠠⠀
                ⠀⠀⠂⠀⠀⠀⠀⠀⠈⣧⠐⢻⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⠞⡋⣈⠉⠉⠄⠛⠳⢼⣄⡋⠜⡠⢃⡐⢠⠀⣀⠈⡉⠛⠻⢿⣾⣽⣶⣭⣞⣽⢦⡀⠀⠂⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠂⠀⠀⠐⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡈⠰⣇⠀⠀⠰⠀⠀⠀⠀⣰⣿⢁⠎⠰⠀⡀⠁⠈⠰⢆⡀⠈⠹⢷⣇⡆⠸⣀⠱⢀⠶⢀⠁⠆⡀⢀⢉⠿⢿⣿⣿⣏⢿⣆⠀⠀⠆⢀⣶⡀⠈⠀⠀⠀⠀⠀⠀⠀⠆⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠠⠀⠀⠀⠠⠀⠀⠀⢸⣧⠁⠜⣧⡀⠀⢀⣠⣤⠖⢻⣇⠎⡌⢂⠅⡠⠁⠌⡀⠀⠌⢡⠃⠆⡌⡙⠳⢦⣕⣂⠆⢂⠌⡐⢀⠂⠄⡈⠛⠮⣝⡻⣯⣿⣇⠀⠀⣼⢛⣿⡄⠀⠀⠀⠀⠀⠂⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀
                ⠄⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⡐⢂⠌⢳⣞⢋⠡⠄⣈⡿⣏⠞⣄⠣⠌⡄⢡⠂⠄⡁⠂⠀⠉⢆⡡⢍⠓⢦⣘⠹⢻⣶⣬⣤⡁⠌⡐⢀⠂⡐⣨⠷⠧⣽⣻⢿⣦⣸⡍⢾⣿⣄⠀⠀⠂⠀⠀⠀⠂⠀⠀⠠⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠂⠀⠀⣰⡿⢷⡈⠄⡃⠜⣳⣎⡴⠟⣁⢻⣝⢦⡉⢖⡈⢆⠨⠐⠠⢈⠐⢠⠘⡄⢊⡜⢢⢌⠳⣡⠞⣧⣙⠻⠿⡴⢮⠴⠴⢀⠂⡔⠠⢌⠙⠺⢿⣿⣶⣹⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠀⠀⠀
                ⠂⠀⠀⠐⠀⠀⠀⠀⣶⢿⡟⡼⡁⢎⢀⠣⠔⣌⢻⢶⣄⠊⢿⣶⡍⢦⠱⡌⢢⠉⡔⢀⠊⡄⠒⡈⢆⡘⢆⢪⡑⢦⠹⣘⢻⢧⡄⠀⠀⡀⠀⠀⠀⠀⠁⠈⢮⡐⡀⠉⠻⣷⣟⣿⣿⣆⠀⠀⠐⠀⠀⠀⠂⠀⠀⠀⠀⠀
                ⠀⠀⠂⠀⠀⠀⠀⣰⢧⣻⣟⠴⡱⢈⠤⠘⡰⠌⣎⢻⣾⢯⣂⠻⣏⣮⠱⡌⢥⠊⡔⠨⡐⠄⠃⢌⠰⡈⢆⡡⢚⠤⣋⢬⢣⢏⢿⡄⠀⢰⠉⠶⢦⣔⣀⡀⠀⠙⢶⣠⠀⠀⠙⢿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠐⠀⠀⠀
                ⠂⠀⠀⠀⠀⠀⠠⣿⠠⣿⡿⢬⡑⠎⡄⢃⠰⡁⢎⠲⣭⢻⣽⣎⠽⣷⣫⠜⡦⡙⢤⠃⡔⡉⠌⡄⢂⡑⠢⡐⠣⢜⡰⢊⢦⢋⡞⡇⠐⠨⣏⢢⠁⢆⠩⡙⠷⣤⡀⠙⠆⢈⠀⡀⢻⣿⣿⡆⠐⠀⠀⠀⠀⠀⠀⠀⠐⠀
                ⠀⠀⠀⠀⠀⠀⠀⣿⠰⣽⣿⢦⡙⡜⣈⠆⠤⠑⡌⠳⣌⠷⣛⣿⣷⡹⣿⣮⠱⣍⠦⡩⠔⡡⢊⠐⡄⠢⠑⡨⢑⠢⣡⠋⣆⢣⣾⠃⠁⢢⣿⠠⢍⢢⠱⠌⢦⡉⠿⣗⣆⡀⠂⠄⡀⠹⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠂⠀⠀⠹⣟⣾⣿⢦⢳⡘⠴⡈⢆⠡⢌⠱⣌⠳⣝⡞⣿⣷⣽⣻⣷⣌⢣⢃⠧⠑⢂⠐⠤⠑⡈⢄⠃⢆⢡⠚⢤⢣⠇⢂⠁⣿⠇⡍⢆⠣⢎⡍⢦⡘⢦⡙⢯⣳⡌⠠⠐⡀⠹⣿⣷⠀⠀⠀⠈⠀⠀⠀⠁⠀
                ⠀⠀⠁⠀⠀⠀⠀⠀⠹⣿⣿⣏⣶⠩⢖⡉⢆⠢⢈⠒⡌⠳⡜⣽⡞⣿⣷⣿⣏⡻⢾⡐⢎⡑⢂⠌⠢⡑⡈⢄⠊⠔⢢⢉⠲⡌⢌⠂⢸⡧⡙⡜⡬⢓⢎⡜⣢⢙⠦⡜⣡⠏⣽⡔⠡⢈⠧⣹⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠐⠀⢀⣠⠶⣿⣽⣿⣟⣾⡝⣢⡙⠤⢃⢂⠡⢌⢣⠹⡜⣿⣹⣿⣿⣿⣧⢋⠿⣶⡘⣄⠊⡄⠱⡐⠨⠄⣉⠰⢈⠒⡜⢢⠉⠄⢿⣱⠹⡜⡭⢎⠶⣡⢏⠶⣙⢦⡹⣌⡟⣦⠁⡎⣵⢺⣿⡳⢦⣀⠀⠀⠀⠀⠀
                ⠀⠀⠀⣀⣴⣫⣤⣛⣿⣿⣿⣿⡞⣿⣥⢪⡑⠣⡌⡐⡈⢆⢣⡙⠶⣭⢿⣿⣿⣿⣏⢞⡩⢷⣆⡱⢠⠡⢌⡑⢂⠤⠘⢠⠃⡜⢠⡉⠆⠸⣷⣋⢷⡹⣎⢯⡵⣎⣟⡱⣎⠷⣌⣷⢻⡄⢳⡸⣟⣿⣷⣫⡝⣳⣄⠀⠀⠀
                ⠀⠀⠀⠱⣿⣿⣿⣏⡿⢿⣿⣿⣿⣎⢿⣦⣍⠓⡤⢡⠐⠌⠢⢍⡛⡼⢻⣿⣿⣿⣿⢎⡵⢋⣿⣷⡆⠱⢠⡘⢄⠢⠑⢂⡘⠄⢣⠘⠤⢁⣿⡽⣎⡷⡽⢮⣳⣝⣮⠽⣭⡛⡴⣿⢹⡎⠴⣹⣾⡏⢽⣦⢙⣦⣝⠳⡌⠀
                ⠀⡔⠀⠀⢛⣿⣿⣿⠛⠯⣙⠻⣿⣞⡷⣸⢹⠳⡰⢁⠎⡈⠱⢨⢜⣱⣿⣿⣿⣿⣿⢯⣞⡱⣚⣿⣿⣡⢣⠘⡄⢣⠁⢆⠰⠈⢆⡉⠒⡄⣿⡽⣏⣷⣻⢧⣛⡾⣾⣹⢶⣹⡳⣿⣹⡎⣱⣳⣿⣷⡾⣻⣧⣾⡇⢣⠳⡄
                ⠈⣷⠀⠀⠩⣿⣿⣿⣯⣒⣍⣳⣿⣿⣽⢣⢇⡏⡔⢣⣬⠴⢛⠡⡈⢡⢉⡙⠻⢿⣿⣿⣮⣓⢦⡹⣿⣷⡌⡓⡌⢆⠩⡐⢂⡉⠄⡘⡥⠐⣹⣿⣽⢾⡽⣯⢿⣽⣳⢯⣟⣷⣻⡿⣽⣷⣼⣿⣿⣛⣟⡿⣿⣿⣷⠂⢰⡇
                ⠈⢿⣆⠀⠀⠀⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⣾⡸⣾⡏⢰⠈⡆⢁⡸⠀⡆⠰⢁⠆⢹⣿⣷⢿⡎⣶⠹⣿⣿⣱⠸⣆⠱⡈⠆⡰⢈⡀⢹⡶⠈⢿⣿⣏⣿⡿⣿⣾⣿⣿⣿⣷⣿⣷⣿⣿⣿⢿⣷⣹⣿⡀⣸⡿⠇⠀⣾⡇
                ⠀⠘⢿⣧⡀⠀⠹⣿⣿⡽⣿⣷⢮⣹⣿⣿⣿⣿⣿⡆⠡⢒⠐⠢⠄⠱⢈⠒⢄⠊⣼⣿⣿⣿⡾⣥⠳⡜⣫⢿⣷⣦⡓⢌⠢⡁⢆⠠⢁⢻⡔⣀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⠿⣙⣧⣵⡿⠀⣠⣾⠏⠀
                ⠀⠀⠀⠙⢿⣶⢄⠀⠉⠻⢿⣿⣯⣛⡛⢏⣽⣿⣿⣧⡐⢊⠌⣱⢈⣐⣡⣪⣴⣿⠻⣭⢿⣿⣿⣿⣇⡳⣡⠻⣼⣻⣿⣌⡒⢡⠂⡡⢂⣐⣿⣤⣾⣿⣿⣿⣿⡿⢿⣿⣿⣿⣟⣟⡛⣟⣥⣻⡶⠿⠛⠉⣠⣼⠟⠁⠀⠀
                ⠀⠀⠀⠀⠀⠈⠛⠧⣦⣀⠀⠀⠩⠿⠿⣾⣴⣍⣛⣦⣿⣶⣭⣲⣭⢶⣻⣿⣟⡷⣫⠔⣫⢿⣿⣿⣯⡗⣥⢋⣿⡄⠉⠛⠛⠷⠿⣿⣿⣏⢀⡀⣤⣤⡷⡷⢷⣶⣿⣿⣾⣿⣿⡿⠟⠉⠁⢀⡀⣤⡶⠟⠉⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠶⠦⣤⣀⡀⠉⠉⠛⠻⠷⠧⢾⣱⣦⣎⣻⣷⣾⣿⣿⣿⣿⣾⣿⣿⣿⣿⣶⣏⣜⣻⡷⣤⣄⣀⣀⣠⣴⣟⣿⣿⢿⣶⣷⣟⣮⣻⣽⡿⠿⠛⠉⣀⣀⣦⠼⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⢀⠀⠈⠀⠀⡀⠀⠁⠀⠀⠀⠀⠀⠉⠉⠓⠒⠀⠦⢀⣀⡀⠈⠉⠛⠛⠻⠿⠿⠿⠟⠛⠿⠿⣾⣧⣿⣿⣿⣾⠾⠿⣿⣿⣿⣿⣿⣿⠿⡿⠿⠛⠉⠉⡉⠉⠁⠠⠀⠒⠂⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠈⠀
                ⡀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠉⠈⠁⠀⠀⠀⠀⠀⠠⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠈⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⢀⠀⠀⠀⠀⠀
                ⠀⠠⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⢀⠀⠀⠀⠀⡀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀
                                
                1. 𝑺𝒕𝒆𝒂𝒌
                2. 𝑯𝒂𝒎
                3. 𝑺𝒂𝒍𝒂𝒎𝒊
                4. 𝑹𝒐𝒂𝒔𝒕 𝑩𝒆𝒆𝒇
                5. 𝑪𝒉𝒊𝒄𝒌𝒆𝒏
                6. 𝑩𝒂𝒄𝒐𝒏
                7. 𝑵𝒐 𝑴𝒆𝒂𝒕
                """);


        PremiumTopping meatChoice = null;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println(italic + "You have selected Steak!" + reset + yellow);
                meatChoice = new PremiumTopping("Steak");
            }
            case 2 -> {
                System.out.println(italic + "You have selected Ham!" + reset + yellow);
                meatChoice = new PremiumTopping("Ham");
            }
            case 3 -> {
                System.out.println(italic + "You have selected Salami!" + reset + yellow);
                meatChoice = new PremiumTopping("Chicken");
            }
            case 4 -> {
                System.out.println(italic + "You have selected Roast Beef!" + reset + yellow);
                meatChoice = new PremiumTopping("Salami");
            }
            case 5 -> {
                System.out.println(italic + "You have selected Chicken!" + reset + yellow);
                meatChoice = new PremiumTopping("Roast Beef");
            }
            case 6 -> {
                System.out.println(italic + "You have selected Bacon!" + reset + yellow);
                meatChoice = new PremiumTopping("Bacon");
            }
            case 7 -> System.out.println(italic + green + "You have selected no meat!" + reset + yellow);
        }
        return meatChoice;
    }

    private static boolean selectExtra() {
        System.out.println(bold + """
                                
                ██╗    ██╗ ██████╗ ██╗   ██╗██╗     ██████╗     ██╗   ██╗ ██████╗ ██╗   ██╗    ██╗     ██╗██╗  ██╗███████╗    ███████╗██╗  ██╗████████╗██████╗  █████╗ ██████╗\s
                ██║    ██║██╔═══██╗██║   ██║██║     ██╔══██╗    ╚██╗ ██╔╝██╔═══██╗██║   ██║    ██║     ██║██║ ██╔╝██╔════╝    ██╔════╝╚██╗██╔╝╚══██╔══╝██╔══██╗██╔══██╗╚════██╗
                ██║ █╗ ██║██║   ██║██║   ██║██║     ██║  ██║     ╚████╔╝ ██║   ██║██║   ██║    ██║     ██║█████╔╝ █████╗      █████╗   ╚███╔╝    ██║   ██████╔╝███████║  ▄███╔╝
                ██║███╗██║██║   ██║██║   ██║██║     ██║  ██║      ╚██╔╝  ██║   ██║██║   ██║    ██║     ██║██╔═██╗ ██╔══╝      ██╔══╝   ██╔██╗    ██║   ██╔══██╗██╔══██║  ▀▀══╝\s
                ╚███╔███╔╝╚██████╔╝╚██████╔╝███████╗██████╔╝       ██║   ╚██████╔╝╚██████╔╝    ███████╗██║██║  ██╗███████╗    ███████╗██╔╝ ██╗   ██║   ██║  ██║██║  ██║  ██╗  \s
                 ╚══╝╚══╝  ╚═════╝  ╚═════╝ ╚══════╝╚═════╝        ╚═╝    ╚═════╝  ╚═════╝     ╚══════╝╚═╝╚═╝  ╚═╝╚══════╝    ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝  ╚═╝  \s
                                
                1. 𝑯𝒆𝒄𝒌 𝒚𝒆𝒂𝒉!
                2. 𝑵𝒐 𝒕𝒉𝒂𝒏𝒌𝒔.
                """);

        boolean isExtra = false;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println(italic + "You have selected extra!" + reset + yellow);
                isExtra = true;
            }
            case 2 -> System.out.println(italic + "You have selected no extra!" + reset + yellow);
        }
        return isExtra;
    }

    private static PremiumTopping selectCheese() {
        System.out.println(bold + """
                                
                ███████╗███████╗██╗     ███████╗ ██████╗████████╗    ██╗   ██╗ ██████╗ ██╗   ██╗██████╗      ██████╗██╗  ██╗███████╗███████╗███████╗███████╗██╗
                ██╔════╝██╔════╝██║     ██╔════╝██╔════╝╚══██╔══╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║██╔══██╗    ██╔════╝██║  ██║██╔════╝██╔════╝██╔════╝██╔════╝██║
                ███████╗█████╗  ██║     █████╗  ██║        ██║        ╚████╔╝ ██║   ██║██║   ██║██████╔╝    ██║     ███████║█████╗  █████╗  ███████╗█████╗  ██║
                ╚════██║██╔══╝  ██║     ██╔══╝  ██║        ██║         ╚██╔╝  ██║   ██║██║   ██║██╔══██╗    ██║     ██╔══██║██╔══╝  ██╔══╝  ╚════██║██╔══╝  ╚═╝
                ███████║███████╗███████╗███████╗╚██████╗   ██║          ██║   ╚██████╔╝╚██████╔╝██║  ██║    ╚██████╗██║  ██║███████╗███████╗███████║███████╗██╗
                ╚══════╝╚══════╝╚══════╝╚══════╝ ╚═════╝   ╚═╝          ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝     ╚═════╝╚═╝  ╚═╝╚══════╝╚══════╝╚══════╝╚══════╝╚═╝
                        
                                                      ████████████████                                 \s
                                                    ██                ████████                         \s
                                                  ██          ████████        ████████                 \s
                                                ██          ██░░░░░░░░██              ████             \s
                                                ░░██        ██░░░░░░░░██                ████           \s
                                            ██░░░░██          ████████            ██████  ██           \s
                                          ██  ████                        ████████        ██           \s
                                        ██        ██████            ██████                ██           \s
                                      ██        ██░░░░░░██    ██████                  ██████           \s
                                    ██        ██░░░░░░░░░░████                      ██░░██             \s
                                  ██          ██░░░░░░░░░░██                        ██░░██             \s
                                ██      ████████░░░░░░░░░░██                          ██████           \s
                              ██  ██████      ██░░░░░░░░░░██                              ██           \s
                              ████              ██░░░░░░██          ████                  ██           \s
                            ██                    ██████          ██░░░░██          ████████           \s
                            ██                                    ██░░░░██        ██░░░░██             \s
                            ██                                      ████        ██░░░░██               \s
                            ████████        ██                                  ██░░░░██               \s
                              ██░░██      ██░░██                                ██░░░░██               \s
                              ██░░░░██      ██                                    ██░░░░██             \s
                                ██░░██                ████████                      ██████             \s
                              ██░░░░██              ██░░░░░░░░██                        ██             \s
                              ██░░██              ██░░░░░░░░░░░░██                ██████               \s
                            ████████            ██░░░░░░██████░░░░██      ████████                     \s
                            ██                  ██░░░░██      ████████████                             \s
                            ██                  ██░░██                                                 \s
                            ██                    ██                                                   \s
                            ██                  ████                                                   \s
                              ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                                                       \s
                           
                1. 𝑨𝒎𝒆𝒓𝒊𝒄𝒂𝒏 𝑪𝒉𝒆𝒆𝒔𝒆
                2. 𝑷𝒓𝒐𝒗𝒐𝒍𝒐𝒏𝒆 𝑪𝒉𝒆𝒆𝒔𝒆
                3. 𝑪𝒉𝒆𝒅𝒅𝒂𝒓 𝑪𝒉𝒆𝒆𝒔𝒆
                4. 𝑺𝒘𝒊𝒔𝒔 𝑪𝒉𝒆𝒆𝒔𝒆
                5. 𝑵𝒐 𝑪𝒉𝒆𝒆𝒔𝒆
                """);

        PremiumTopping cheeseChoice = null;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println(italic + "You have selected American Cheese!" + reset + yellow);
                cheeseChoice = new PremiumTopping("American Cheese");
            }
            case 2 -> {
                System.out.println(italic + "You have selected Provolone Cheese!" + reset + yellow);
                cheeseChoice = new PremiumTopping("Provolone Cheese");
            }
            case 3 -> {
                System.out.println(italic + "You have selected Cheddar Cheese!" + reset + yellow);
                cheeseChoice = new PremiumTopping("Cheddar Cheese");
            }
            case 4 -> {
                System.out.println(italic + "You have selected Swiss Cheese!" + reset + yellow);
                cheeseChoice = new PremiumTopping("Swiss Cheese");
            }
            case 5 -> System.out.println(italic + "You have selected no cheese!" + reset + yellow);
        }
        return cheeseChoice;
    }

    private static boolean selectExtraCheese() {
        System.out.println(bold + """
                                
                ██╗    ██╗ ██████╗ ██╗   ██╗██╗     ██████╗     ██╗   ██╗ ██████╗ ██╗   ██╗    ██╗     ██╗██╗  ██╗███████╗    ███████╗██╗  ██╗████████╗██████╗  █████╗ ██████╗\s
                ██║    ██║██╔═══██╗██║   ██║██║     ██╔══██╗    ╚██╗ ██╔╝██╔═══██╗██║   ██║    ██║     ██║██║ ██╔╝██╔════╝    ██╔════╝╚██╗██╔╝╚══██╔══╝██╔══██╗██╔══██╗╚════██╗
                ██║ █╗ ██║██║   ██║██║   ██║██║     ██║  ██║     ╚████╔╝ ██║   ██║██║   ██║    ██║     ██║█████╔╝ █████╗      █████╗   ╚███╔╝    ██║   ██████╔╝███████║  ▄███╔╝
                ██║███╗██║██║   ██║██║   ██║██║     ██║  ██║      ╚██╔╝  ██║   ██║██║   ██║    ██║     ██║██╔═██╗ ██╔══╝      ██╔══╝   ██╔██╗    ██║   ██╔══██╗██╔══██║  ▀▀══╝\s
                ╚███╔███╔╝╚██████╔╝╚██████╔╝███████╗██████╔╝       ██║   ╚██████╔╝╚██████╔╝    ███████╗██║██║  ██╗███████╗    ███████╗██╔╝ ██╗   ██║   ██║  ██║██║  ██║  ██╗  \s
                 ╚══╝╚══╝  ╚═════╝  ╚═════╝ ╚══════╝╚═════╝        ╚═╝    ╚═════╝  ╚═════╝     ╚══════╝╚═╝╚═╝  ╚═╝╚══════╝    ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝  ╚═╝  \s
                                
                1. 𝑯𝒆𝒄𝒌 𝒚𝒆𝒂𝒉!
                2. 𝑵𝒐 𝒕𝒉𝒂𝒏𝒌𝒔.
                """);

        boolean isExtra = false;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected extra!");
                isExtra = true;
            }
            case 2 -> System.out.println("You have selected no extra!");
        }
        return isExtra;
    }

    private static boolean selectToasted() {
        System.out.println(bold + """
                                
                ██╗    ██╗ ██████╗ ██╗   ██╗██╗     ██████╗     ██╗   ██╗ ██████╗ ██╗   ██╗    ██╗     ██╗██╗  ██╗███████╗    ████████╗██╗  ██╗██╗███████╗    ████████╗ ██████╗  █████╗ ███████╗████████╗███████╗██████╗ ██████╗
                ██║    ██║██╔═══██╗██║   ██║██║     ██╔══██╗    ╚██╗ ██╔╝██╔═══██╗██║   ██║    ██║     ██║██║ ██╔╝██╔════╝    ╚══██╔══╝██║  ██║██║██╔════╝    ╚══██╔══╝██╔═══██╗██╔══██╗██╔════╝╚══██╔══╝██╔════╝██╔══██╗╚════██╗
                ██║ █╗ ██║██║   ██║██║   ██║██║     ██║  ██║     ╚████╔╝ ██║   ██║██║   ██║    ██║     ██║█████╔╝ █████╗         ██║   ███████║██║███████╗       ██║   ██║   ██║███████║███████╗   ██║   █████╗  ██║  ██║  ▄███╔╝
                ██║███╗██║██║   ██║██║   ██║██║     ██║  ██║      ╚██╔╝  ██║   ██║██║   ██║    ██║     ██║██╔═██╗ ██╔══╝         ██║   ██╔══██║██║╚════██║       ██║   ██║   ██║██╔══██║╚════██║   ██║   ██╔══╝  ██║  ██║  ▀▀══╝
                ╚███╔███╔╝╚██████╔╝╚██████╔╝███████╗██████╔╝       ██║   ╚██████╔╝╚██████╔╝    ███████╗██║██║  ██╗███████╗       ██║   ██║  ██║██║███████║       ██║   ╚██████╔╝██║  ██║███████║   ██║   ███████╗██████╔╝  ██╗
                 ╚══╝╚══╝  ╚═════╝  ╚═════╝ ╚══════╝╚═════╝        ╚═╝    ╚═════╝  ╚═════╝     ╚══════╝╚═╝╚═╝  ╚═╝╚══════╝       ╚═╝   ╚═╝  ╚═╝╚═╝╚══════╝       ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝   ╚═╝   ╚══════╝╚═════╝   ╚═╝
                                
                                                ▒▒                               \s
                                                ▓▓                               \s
                                                ▓▓▓▓                             \s
                                                ████                             \s
                                              ░░████                             \s
                                              ██▓▓██                             \s
                                        ░░  ████▓▓▓▓    ▒▒                       \s
                                        ▓▓▒▒▓▓██▒▒▓▓  ██░░                       \s
                                      ▓▓██████▒▒▓▓▒▒████  ▒▒                     \s
                                      ██████▒▒▒▒▓▓▒▒██▒▒  ██                     \s
                                      ██▓▓▓▓░░▒▒████▓▓░░▒▒██  ░░                 \s
                                      ██▒▒▒▒░░▒▒▓▓██▓▓▓▓████▓▓░░                 \s
                                      ██▒▒▒▒░░▒▒████▓▓██▓▓████░░                 \s
                                      ██▒▒░░░░▒▒▓▓██▒▒██▒▒██▓▓░░                 \s
                                  ░░  ▒▒▒▒░░░░░░▒▒██░░▒▒▒▒▓▓██                   \s
                                    ██▓▓▓▓░░  ░░▒▒▒▒░░░░▒▒▓▓▓▓                   \s
                                    ░░██▓▓▒▒░░  ░░░░░░░░░░▓▓░░                   \s
                                      ░░▓▓░░░░        ░░▒▒░░                     \s
                                          ░░▒▒░░      ░░                         \s
                                
                1. 𝑯𝒆𝒄𝒌 𝒚𝒆𝒂𝒉!
                2. 𝑵𝒐 𝒕𝒉𝒂𝒏𝒌𝒔.
                """);

        boolean isToasted = false;
        switch (
                userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println(italic + "You have selected toasted!" + reset + yellow);
                isToasted = true;
            }
            case 2 -> System.out.println(italic + "You have selected not toasted!" + reset + yellow);
        }
        return isToasted;
    }
}