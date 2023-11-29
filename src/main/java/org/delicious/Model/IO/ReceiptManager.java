
package org.delicious.Model.IO;

        import java.io.BufferedWriter;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.time.LocalDateTime;
        import java.time.format.DateTimeFormatter;

public class ReceiptManager {

    public static void saveReceipt(String orderSummary) throws IOException {
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
