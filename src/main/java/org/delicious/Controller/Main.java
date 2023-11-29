package org.delicious.Controller;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        HomeScreen homeScreen = new HomeScreen();
        HomeScreen.display(scanner);
    }
}
