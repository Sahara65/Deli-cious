package org.delicious.controllerwithpaulscreen;

public class TempMain {
    static CliScreen welcomeScreen;
    static CliScreen menuScreen;
    static CliScreen sandwichScreen;
    static CliScreen toppingScreen;
    static CliScreen chipScreen;
    static CliScreen drinkScreen;
    static CliScreen checkoutScreen;
    public static void main(String[] args) {
        welcomeScreen = new CliScreen();
        menuScreen = new CliScreenMenu();
        sandwichScreen = new CliScreen();
        toppingScreen = new CliScreen();
        chipScreen = new CliScreen();
        drinkScreen = new CliScreen();
        checkoutScreen = new CliScreen();
        welcomeScreen.show();
    }
}
