package com.techelevator.Product1;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionLogger {

    private static final String LOG_FILE = "Log.txt";

    private static String getTimeStamp() {
        return LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a"));
    }


    private static void writeLine(String line) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            writer.println(line);
        } catch (Exception e) {
            System.out.println("Error writing to Log.txt");
        }
    }


    public static void logFeedMoney(BigDecimal amountAdded, BigDecimal newBalance) {
        writeLine(
                getTimeStamp() +
                        " FEED MONEY: $" + amountAdded +
                        " $" + newBalance
        );
    }

    // Logs when a product is purchased
    public static void logPurchase(Product product, BigDecimal newBalance) {
        writeLine(
                getTimeStamp() + " " +
                        product.getType() + " " +
                        product.getName() + " " +
                        product.getId() + " $" +
                        product.getPrice() + " $" +
                        newBalance
        );
    }

    // Logs when change is given
    public static void logGiveChange(BigDecimal change) {
        writeLine(
                getTimeStamp() +
                        " GIVE CHANGE: $" + change +
                        " $0.00"
        );
    }
}
