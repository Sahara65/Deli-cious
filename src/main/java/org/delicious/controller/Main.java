package org.delicious.controller;

import org.delicious.model.items.PremiumTopping;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PremiumTopping meatChoice;
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        HomeScreen.display(scanner);
    }
}
