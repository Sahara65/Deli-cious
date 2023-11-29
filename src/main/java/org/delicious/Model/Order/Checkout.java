// Dipesh's Code
package org.delicious.Model.Order;

import org.delicious.Model.IO.ReceiptManager;
import java.io.IOException;

public class Checkout {
    private Order currentOrder;

    public Checkout(Order order) {
        this.currentOrder = order;
    }

    public String finalizeOrder() {
        String orderSummary = currentOrder.getOrderSummary();

        try {
            ReceiptManager.saveReceipt(orderSummary);
        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }

        return orderSummary;
    }
}
