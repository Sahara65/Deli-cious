package org.delicious.Model.Order;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Checkout {
    private final Order currentOrder;

    public Checkout(Order order) {
        this.currentOrder = order;
    }

    public String finalizeOrder() {
        String orderSummary = currentOrder.getOrderSummary();

        try {
            saveReceipt(orderSummary);
        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());

        }

        return orderSummary;
    }

    private void saveReceipt(String orderSummary) throws IOException {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String formattedDateTime = now.format(formatter);


        String fileName = formattedDateTime + ".txt";


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(orderSummary);
        } catch (IOException e) {
            throw new IOException("Error writing to receipt file: " + e.getMessage(), e);
        }
    }
}
