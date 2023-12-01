package org.delicious.controllerwithpaulscreen;

import org.delicious.model.items.BreadType;
import org.delicious.model.items.Sandwich;

/*public class CliScreenSandwich extends CliScreen {
    public CliScreenSandwich() {
        super();

        heading = """
                            SANDWICH MENU
                            -----------
                """;
        menu = """
                    1    White Bread
                    2    Wheat Bread
                    3    Rye Bread
                    4    Wrap
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
            case "1" -> selectBreadSize(BreadType.WHITE);
            case "2" -> selectBreadSize(BreadType.WHEAT);
            case "3" -> selectBreadSize(BreadType.RYE);
            case "4" -> selectBreadSize(BreadType.WRAP);
            default -> badInput();
        }
        return false;

    }
    private void selectBreadSize(BreadType type){
        selectToppings(new Sandwich());
    }

    private

    private void showReportsScreen() {
        AccountingLedgerApp.reportsScreen.show();
    }

    private void displayPayments() {
        System.out.println("Listing your Payments:\n");
        displayTransactions(ledger.findDebits());
    }

    private void displayDeposits() {
        System.out.println("Listing your Deposits:\n");
        displayTransactions(ledger.findCredits());
    }

    private void displayAllTransactions() {
        displayTransactions(ledger.findAll());
    }

}

 */