package org.delicious.model.io;

import org.delicious.model.order.Order;
import org.delicious.model.order.OrderedItem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptManager {

    public static String finalizeOrder(Order currentOrder) {
        String orderSummary = generateOrderSummary(currentOrder);

        try {
            saveReceipt(orderSummary);
        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
            return "Failed to save receipt.";
        }

        return orderSummary;
    }

    private static String generateOrderSummary(Order currentOrder) {
        StringBuilder summary = new StringBuilder();
        double totalCost = 0.0;

        for (OrderedItem item : currentOrder.getItemsInCart()) {
            System.out.println(item);
            summary.append(item.toString()).append("\n");
            totalCost += item.getPrice();
        }
        summary.append("Total Cost: $").append(totalCost);
        return summary.toString();
    }

    private static void saveReceipt(String orderSummary) throws IOException {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String formattedDateTime = now.format(formatter);
        String fileName = "Receipts/" + formattedDateTime + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(orderSummary);
        } catch (IOException e) {
            throw new IOException("Error writing to receipt file: " + e.getMessage(), e);
        }
    }
}
