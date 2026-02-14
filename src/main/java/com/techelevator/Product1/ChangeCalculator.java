package com.techelevator.Product1;

import java.math.BigDecimal;

public class ChangeCalculator {

    public static void giveChange(BigDecimal balance) {
        int cents = balance.multiply(BigDecimal.valueOf(100)).intValue();

        int dollars = cents / 100;
        cents %= 100;

        int quarters = cents / 25;
        cents %= 25;

        int dimes = cents / 10;
        cents %= 10;

        int nickels = cents / 5;

        System.out.println("---------------------------------");
        System.out.println("        CHANGE RETURNED");
        System.out.println("---------------------------------");
        System.out.println("        Dollars : " + dollars);
        System.out.println("        Quarters: " + quarters);
        System.out.println("        Dimes   : " + dimes);
        System.out.println("        Nickels : " + nickels);
        System.out.println("---------------------------------");

    }
}
