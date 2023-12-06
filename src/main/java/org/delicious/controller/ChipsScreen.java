package org.delicious.controller;

import org.delicious.model.sides.*;

import java.util.Scanner;

import static org.delicious.controller.HomeScreen.userInputs;
import static org.delicious.view.AnsiColorCodes.*;

public class ChipsScreen {
    public static Chip createChip() {
        ChipType chipChoice = addChips();

        return new Chip(chipChoice);
    }

    public static ChipType addChips() {
        System.out.println(bold+"""
                
                ███████╗███████╗██╗     ███████╗ ██████╗████████╗    ██╗   ██╗ ██████╗ ██╗   ██╗██████╗      ██████╗██╗  ██╗██╗██████╗ ███████╗██╗
                ██╔════╝██╔════╝██║     ██╔════╝██╔════╝╚══██╔══╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║██╔══██╗    ██╔════╝██║  ██║██║██╔══██╗██╔════╝██║
                ███████╗█████╗  ██║     █████╗  ██║        ██║        ╚████╔╝ ██║   ██║██║   ██║██████╔╝    ██║     ███████║██║██████╔╝███████╗██║
                ╚════██║██╔══╝  ██║     ██╔══╝  ██║        ██║         ╚██╔╝  ██║   ██║██║   ██║██╔══██╗    ██║     ██╔══██║██║██╔═══╝ ╚════██║╚═╝
                ███████║███████╗███████╗███████╗╚██████╗   ██║          ██║   ╚██████╔╝╚██████╔╝██║  ██║    ╚██████╗██║  ██║██║██║     ███████║██╗
                ╚══════╝╚══════╝╚══════╝╚══════╝ ╚═════╝   ╚═╝          ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝     ╚═════╝╚═╝  ╚═╝╚═╝╚═╝     ╚══════╝╚═╝
                             ⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                             ⠀⠀⠀⠀⣠⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                             ⠀⠀⠀⣰⣿⣯⣈⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣂⣀⠀⠀⠀⠀⠀⠀⠀
                             ⠀⠀⢰⡿⠟⢻⣿⡏⢁⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣷⣤⡀⠀⠀⠀⠀
                             ⠀⠀⢿⣷⣶⣿⣿⡇⢸⣿⡟⢻⣿⣿⣷⣶⣦⣤⣄⣈⠙⠻⢿⣏⣉⣿⣶⡄⠀⠀
                             ⠀⠀⠀⠈⠉⠙⠛⠃⠘⣿⣿⣾⣿⣿⢛⣩⣿⣿⡿⠋⣠⠞⢿⣿⡿⠟⠉⠀⠀⠀
                             ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣟⠙⢻⣿⣿⣿⠟⠁⠠⠾⠟⠀⠉⠀⠀⠀⠀⢀⠀⠀
                             ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠛⠚⢿⡟⠁⠀⠀⠀⠀⠀⢀⣠⣤⣶⣾⣿⣿⠀⠀
                             ⠀⠀⠀⠀⠀⣀⣠⣴⠶⣶⣶⡆⠀⠋⠀⠀⠀⠀⣠⣴⣾⠉⣿⣿⣅⣉⣿⡿⠀⠀
                             ⠀⠀⣠⣶⣿⣿⣿⣯⣤⣿⡿⠀⠀⠀⠀⠀⠀⠀⠘⢿⣷⣴⣿⣿⣿⣿⣿⡇⠀⠀
                             ⠀⠀⠙⣿⣇⣨⣿⣿⣿⣿⠁⠀⢰⣶⣶⡄⢠⣤⣤⣤⣤⣤⠄⠀⠚⢿⣿⠀⠀⠀
                             ⠀⠀⠀⠈⢿⣿⣿⣿⠛⠃⠀⠀⠸⣿⣿⣿⣿⡿⠿⣿⡿⠁⠐⢿⣿⣿⡏⠀⠀⠀
                             ⠀⠀⠀⠀⠀⠙⠻⣿⣿⠀⠀⠀⠀⢿⡟⢻⣧⣤⡶⠋⠀⠀⠀⠀⠉⠛⠁⠀⠀⠀
                             ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣧⣬⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                             ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     \s
                                
                1. 𝑳𝒂𝒚𝒔
                2. 𝑪𝒉𝒆𝒆𝒕𝒐𝒔
                3. 𝑫𝒐𝒓𝒊𝒕𝒐𝒔
                4. 𝑷𝒐𝒑𝒄𝒐𝒓𝒏
                5. 𝑵𝒂𝒄𝒉𝒐𝒔
                """);

        ChipType chipChoice = null;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println(italic + "You have selected Lays!" + reset + yellow);
                chipChoice = ChipType.LAYS;
            }
            case 2 -> {
                System.out.println(italic + "You have selected Cheetos!" + reset + yellow);
                chipChoice = ChipType.CHEETOS;
            }
            case 3 -> {
                System.out.println(italic + "You have selected Doritos!" + reset + yellow);
                chipChoice = ChipType.DORITOS;
            }
            case 4 -> {
                System.out.println(italic + "You have selected Popcorn!" + reset + yellow);
                chipChoice = ChipType.POPCORN;
            }
            case 5 -> {
                System.out.println(italic + "You have selected Nachos!" + reset + yellow);
                chipChoice = ChipType.NACHOS;
            }
            default -> System.out.println(red + bold + "Invalid input! Please enter numbers 1-5." + reset + yellow);
        }
        return chipChoice;
    }
}
