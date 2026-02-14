package com.techelevator.Product1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private static final Scanner input = new Scanner(System.in);

    public static void menuDisplay(List<Product> productInventory) {

        while (true) { // Want to repeat over and over again
            try { // Want to catch an error
                System.out.println("(1) Display Media Items");
                System.out.println("(2) Purchase");
                System.out.println("(3) Exit");

                System.out.print("Please select one of these three options: ");
                int userInput = input.nextInt();

                input.nextLine();

                if (userInput == 1) {
                    UserOptions.submenu(productInventory);

                } else if (userInput == 2) {
                    PurchaseMenu.startPurchaseMenu(productInventory);

                } else if (userInput == 3) {
                    System.out.println("Thank you for using the vending machine. Goodbye.");
                    break;

                } else {
                    System.out.println("Please select only 1, 2, or 3.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please type one number only.");
                input.nextLine();
            }
        }
    }
}
