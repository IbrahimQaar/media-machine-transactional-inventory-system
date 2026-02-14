package com.techelevator.Product1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Purchase {

    private static final Scanner input = new Scanner(System.in);

    public static void purchaseMenu() {
       while (true) {
           try {
               System.out.println("\n~~~~~ Purchase Menu ~~~~~");

               System.out.println("(1) Feed Money");
               System.out.println("(2) Select Product");
               System.out.println("(3) Finish Transaction");
               
               System.out.println("Please select one of these three options: ");
               int userInput = input.nextInt();

               if(userInput == 1){

               } else if (userInput == 2) {

               } else if (userInput == 3) {

               }
           } catch (InputMismatchException e) {
               System.out.println("Please type one number ONLY!");
               input.nextLine();
           }
       }
    }
}
