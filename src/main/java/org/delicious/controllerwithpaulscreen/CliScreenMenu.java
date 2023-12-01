package org.delicious.controllerwithpaulscreen;

public class CliScreenMenu extends CliScreen{
    public CliScreenMenu() {
        super();

        heading = """                              
                ██████╗░██╗░░░░░░█████╗░░█████╗░███████╗░░░░░░░░█████╗░███╗░░██╗░░░░░░░░░█████╗░██████╗░██████╗░███████╗██████╗░██╗
                ██╔══██╗██║░░░░░██╔══██╗██╔══██╗██╔════╝░░░░░░░░██╔══██╗████╗░██║░░░░░░░░██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗██║
                ██████╔╝██║░░░░░███████║██║░░╚═╝█████╗░░░░░░░░░░███████║██╔██╗██║░░░░░░░░██║░░██║██████╔╝██║░░██║█████╗░░██████╔╝██║
                ██╔═══╝░██║░░░░░██╔══██║██║░░██╗██╔══╝░░░░░░░░░░██╔══██║██║╚████║░░░░░░░░██║░░██║██╔══██╗██║░░██║██╔══╝░░██╔══██╗╚═╝
                ██║░░░░░███████╗██║░░██║╚█████╔╝███████╗░░░░░░░░██║░░██║██║░╚███║░░░░░░░░╚█████╔╝██║░░██║██████╔╝███████╗██║░░██║██╗
                ╚═╝░░░░░╚══════╝╚═╝░░╚═╝░╚════╝░╚══════╝░░░░░░░░╚═╝░░╚═╝╚═╝░░╚══╝░░░░░░░░░╚════╝░╚═╝░░╚═╝╚═════╝░╚══════╝╚═╝░░╚═╝╚═╝
                """;
        menu = """
                1 Add a Sandwich!
                2 Add a Drink!
                3 Add Chips!
                4 Checkout!
                0 Cancel Order and Return to Home.
                """;
        menuPrompt = """
                Select an option (by number):  \s
                """;

        status = "Ready";

    }


    @Override
    protected boolean doInputUntilDone() {
        String input = requestStringInput();
        switch (input.toUpperCase()) {
            case "1" -> displaySandwichOptions();
            case "2" -> displayDrinkOptions();
            case "3" -> displayChipOptions();
            case "4" -> showCheckoutScreen();
            case "0" -> {
                return true;
            }
            default -> badInput();
        }
        return false;

    }

    private void displaySandwichOptions() {
        System.out.println("Listing your Sandwich Options:\n");
        TempMain.sandwichScreen.show();
    }

    private void displayDrinkOptions() {
        System.out.println("Listing your Drink Options:\n");
        TempMain.drinkScreen.show();
    }

    private void displayChipOptions() {
        System.out.println("Listing your Chip Options:\n");
        TempMain.chipScreen.show();
    }

    private void showCheckoutScreen() {
        System.out.println("Listing your Checkout Options:\n");
        TempMain.checkoutScreen.show();
    }

}
