package org.delicious.controller;

import org.delicious.model.sides.Drink;
import org.delicious.model.sides.DrinkSize;
import org.delicious.model.sides.DrinkType;

import java.util.Scanner;

import static org.delicious.controller.HomeScreen.userCharInputs;
import static org.delicious.controller.HomeScreen.userInputs;

public class DrinkScreen {
    public static void createDrink() {
        DrinkType drinkType = addDrink();
        DrinkSize drinkSizeChoice = addDrinkSize();

        Drink drink = new Drink(drinkType, drinkSizeChoice);
    }
    public static DrinkType addDrink() {
        // Drink 🥤
        System.out.println("""
                Please select your drink!
                                
                1. Coca Cola
                2. Sprite
                3. Fanta
                4. Water
                5. Pepsi
                6. Dr. Pepper
                """);

        DrinkType drinkChoice = null;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected Coke Cola!");
                drinkChoice = DrinkType.COCA_COLA;
            }
            case 2 -> {
                System.out.println("You have selected Sprite!");
                drinkChoice = DrinkType.SPRITE;
            }
            case 3 -> {
                System.out.println("You have selected Fanta!");
                drinkChoice = DrinkType.FANTA;
            }
            case 4 -> {
                System.out.println("You have selected Water!");
                drinkChoice = DrinkType.WATER;
            }
            case 5 -> {
                System.out.println("You have selected Pepsi!");
                drinkChoice = DrinkType.PEPSI;
            }
            case 6 -> {
                System.out.println("You have selected Dr. Pepper!");
                drinkChoice = DrinkType.DR_PEPPER;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-6.");
        }
        return drinkChoice;
    }
    public static DrinkSize addDrinkSize() {
        System.out.println("""
                Please select your drink size!
                                
                1. Small
                2. Medium
                3. Large
                """);

        DrinkSize drinkSizeChoice = null;
        switch (userInputs(new Scanner(System.in))) {
            case 1 -> {
                System.out.println("You have selected Small!");
                drinkSizeChoice = DrinkSize.SMALL;
            }
            case 2 -> {
                System.out.println("You have selected Medium!");
                drinkSizeChoice = DrinkSize.MEDIUM;
            }
            case 3 -> {
                System.out.println("You have selected Large!");
                drinkSizeChoice = DrinkSize.LARGE;
            }
            default -> System.out.println("Invalid Input! Please type only numbers 1-3.");
        }
        return drinkSizeChoice;
    }
}
