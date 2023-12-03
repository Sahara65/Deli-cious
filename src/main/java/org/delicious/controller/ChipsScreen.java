package org.delicious.controller;

import org.delicious.model.sides.ChipType;

import java.util.Scanner;

import static org.delicious.controller.HomeScreen.userInputs;

public class ChipsScreen {
    
    public static ChipType addChips() {
        System.out.println("""
                Please select your chips!
                                
                1. Lays
                2. Cheetos
                3. Doritos
                4. Popcorn
                5. Nachos
                """);

        ChipType chipChoice = null;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected Lays!");
                chipChoice = ChipType.LAYS;
            }
            case 2 -> {
                System.out.println("You have selected Cheetos!");
                chipChoice = ChipType.CHEETOS;
            }
            case 3 -> {
                System.out.println("You have selected Doritos!");
                chipChoice = ChipType.DORITOS;
            }
            case 4 -> {
                System.out.println("You have selected Popcorn!");
                chipChoice = ChipType.POPCORN;
            }
            case 5 -> {
                System.out.println("You have selected Nachos!");
                chipChoice = ChipType.NACHOS;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-5.");
        }
        return chipChoice;
    }
}
