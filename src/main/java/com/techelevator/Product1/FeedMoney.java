package com.techelevator.Product1;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FeedMoney {

    public static final Scanner input = new Scanner(System.in);

    public static int addingMoney(){
        int currentMoney = 0;
        System.out.println("We only accept: $1, $5, $10, $20, and $50 dollar bills only!");
        try{
            System.out.println("Please input the amount of money: ");
            int inputMoney = input.nextInt();
            if (inputMoney != 1 && inputMoney != 5 && inputMoney != 10 &&
                    inputMoney != 20 && inputMoney != 50) {
                System.out.println("Amount you put in is not valid!");
            } else {
                currentMoney += inputMoney;
            }
        }
        catch (Exception e) {
            System.out.println("Input is invalid!");
        }
        return currentMoney;
    }
}
