package org.delicious.Model.IO;

import org.delicious.Model.Order.Order;
import org.delicious.Model.Order.OrderedItem;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

        for (OrderedItem item : currentOrder.getItems()) {
            summary.append(item.getOrderInformation()).append("\n");
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

    public static Map<String, Double> loadPrices(String csvFileName) throws IOException {
        Map<String, Double> prices = new HashMap<>();
        try (Scanner scanner = new Scanner(new File(csvFileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String itemName = parts[0];
                    double price = Double.parseDouble(parts[1]);
                    prices.put(itemName, price);
                }
            }
        } catch (FileNotFoundException e) {
            throw new IOException("Price file not found: " + e.getMessage(), e);
        }
        return prices;
    }

    // Additional methods as per your application requirements
}
