package com.techelevator.Product1;
import com.techelevator.Product1.ChangeCalculator;


import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class PurchaseMenu {
    private static BigDecimal balance = new BigDecimal("0");
    private static final Scanner scan = new Scanner(System.in);

    public static void startPurchaseMenu(List<Product> products) {
        while (true) {
            System.out.println("Current Money Provided: $" + balance);
            System.out.println("1. Feed Money");
            System.out.println("2. Select Item");
            System.out.println("3. Finish Transaction");
            System.out.print("Pick an option (1–3): ");

            String input = scan.nextLine();

            if (input.equals("1")) {
                feedMoney();
            } else if (input.equals("2")) {
                selectProduct(products);
            } else if (input.equals("3")) {
                finishTransaction();
                break;
            } else {
                System.out.println("That’s not a valid choice. Try again.");
            }
        }
    }

    private static void feedMoney() {
        System.out.print("Enter amount to add (1, 5, 10, 20, or 50 only): ");
        String amountStr = scan.nextLine();

        try {
            int amount = Integer.parseInt(amountStr);
            if (amount == 1 || amount == 5 || amount == 10 || amount == 20 || amount == 50) {
                balance = balance.add(BigDecimal.valueOf(amount));
                TransactionLogger.logFeedMoney(
                        BigDecimal.valueOf(amount),
                        balance
                );

            } else {
                System.out.println("Sorry, only 1, 5, 10, 20, or 50 dollar bills are accepted.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a whole number like 1, 5, or 10.");
        }
    }

    private static void selectProduct(List<Product> products) {

        System.out.println("\n==============================================================");
        System.out.println("                        AVAILABLE ITEMS");
        System.out.println("==============================================================");
        System.out.printf("%-6s | %-35s | %-7s | %-5s%n",
                "ID", "NAME", "PRICE", "QTY");
        System.out.println("--------------------------------------------------------------");

        for (Product p : products) {

            String qty = p.getQuantity() > 0 ? String.valueOf(p.getQuantity()) : "SOLD OUT";

            // Trim long names to keep table clean
            String name = p.getName();
            if (name.length() > 35) {
                name = name.substring(0, 32) + "...";
            }

            System.out.printf("%-6s | %-35s | $%-6.2f | %-5s%n",
                    p.getId(),
                    name,
                    p.getPrice(),
                    qty);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.print("Type the product ID you want to buy: ");

        String userId = scan.nextLine().trim().toUpperCase();

        for (Product p : products) {
            if (p.getId().equalsIgnoreCase(userId)) {

                if (p.getQuantity() == 0) {
                    System.out.println("Oops! That item is sold out.");
                    return;
                }

                if (balance.compareTo(BigDecimal.valueOf(p.getPrice())) >= 0) {
                    balance = balance.subtract(BigDecimal.valueOf(p.getPrice()));
                    p.setQuantity(p.getQuantity() - 1);
                    TransactionLogger.logPurchase(p, balance);


                    System.out.println("You bought: " + p.getName());
                    System.out.println("Cost: $" + p.getPrice());
                    System.out.println("Money left: $" + balance);
                    printMessage(p.getType());
                    return;
                } else {
                    System.out.println("You don’t have enough money for that item.");
                    return;
                }
            }
        }

        System.out.println("Hmm, we couldn’t find that product. Check the ID and try again.");
    }

    private static void finishTransaction() {
        TransactionLogger.logGiveChange(balance);
        ChangeCalculator.giveChange(balance);
        balance = BigDecimal.ZERO;
    }



    private static void printMessage(String type) {
        switch (type.toUpperCase()) {
            case "BOOK":
                System.out.println("Enjoy your literary adventure! We hope this story captivates your imagination.");
                break;
            case "MOVIE":
                System.out.println("Enjoy your literary adventure! We hope this story captivates your imagination.");
                break;
            case "ALBUM":
                System.out.println("Let the music play! We hope these tracks bring you joy and get your feet tapping.");
                break;
            case "VIDEOGAME":
                System.out.println("Get ready to level up! We hope you have a blast exploring and conquering in your new game.");
                break;
            case "AUDIOBOOK":
                System.out.println("Sit back, relax, and let the story unfold. Enjoy your new audiobook!");
                break;
        }
    }
}
