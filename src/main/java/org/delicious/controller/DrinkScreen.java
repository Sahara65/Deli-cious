package org.delicious.controller;

import org.delicious.model.sides.DrinkType;

import java.util.Scanner;

import static org.delicious.controller.HomeScreen.userInputs;

public class DrinkScreen {
    public static DrinkType addDrink() {
        // Drink 🥤
        System.out.println("""
                Please select your drink!
                                
                1. Coke Cola
                2. Sprite
                3. Fanta
                4. Water
                5. Pepsi
                6. Dr. Pepper
                """);

        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected Coke Cola!");
                DrinkType drinkChoice = DrinkType.COCA_COLA;
            }
            case 2 -> {
                System.out.println("You have selected Sprite!");
                DrinkType drinkChoice = DrinkType.SPRITE;
            }
            case 3 -> {
                System.out.println("You have selected Fanta!");
                DrinkType drinkChoice = DrinkType.FANTA;
            }
            case 4 -> {
                System.out.println("You have selected Water!");
                DrinkType drinkChoice = DrinkType.WATER;
            }
            case 5 -> {
                System.out.println("You have selected Pepsi!");
                DrinkType drinkChoice = DrinkType.PEPSI;
            }
            case 6 -> {
                System.out.println("You have selected Dr. Pepper!");
                DrinkType drinkChoice = DrinkType.DR_PEPPER;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-6.");
        }
        return null;
    }
}
