package org.delicious.controller;

import org.delicious.model.sides.ChipType;

import java.util.Scanner;

import static org.delicious.controller.HomeScreen.userInputs;

public class ChipsScreen {

    // TODO for Sahara have a createChips() method similar to the to the createSandwich() method in the SandwichScreen class.
    public static ChipType addChips() {
        System.out.println("""
                Please select your chips!
                                
                1. Lays
                2. Cheetos
                3. Doritos
                4. Popcorn
                5. Nachos
                """);

        // TODO initialize chipChoice outside of the switch case and have the method return chipChoice instead of null.
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected Lays!");
                ChipType chipChoice = ChipType.LAYS;
            }
            case 2 -> {
                System.out.println("You have selected Cheetos!");
                ChipType chipChoice = ChipType.CHEETOS;
            }
            case 3 -> {
                System.out.println("You have selected Doritos!");
                ChipType chipChoice = ChipType.DORITOS;
            }
            case 4 -> {
                System.out.println("You have selected Popcorn!");
                ChipType chipChoice = ChipType.POPCORN;
            }
            case 5 -> {
                System.out.println("You have selected Nachos!");
                ChipType chipChoice = ChipType.NACHOS;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-5.");
        }
        return null;
    }
}
