package com.techelevator.Product1;

import java.io.PrintWriter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class UserOptions {
    private static final Scanner scan = new Scanner(System.in);

    public static void submenu(List<Product> productInventory) {
        try {
            while (true) {
                System.out.println("(A) Books");
                System.out.println("(B) Movies");
                System.out.println("(C) Albums");
                System.out.println("(D) Video Games");
                System.out.println("(E) Audio Books");
                System.out.println("(F) Return All");
                System.out.println("(G) Return to the Main Menu.");

                System.out.print("Please select one of these options (A to F): ");
                String userInput = scan.nextLine();

                UserOptions userOptions = new UserOptions();

                switch (userInput.toLowerCase(Locale.ROOT)) {
                    case "a":
                        System.out.println("\n~~~~~ Book List ~~~~~");
                        System.out.println("---------------------------------");
                        System.out.printf( "%-8s|%-10s|%-40s|%-9s|%5s\n" ,"ID","Type","Name","Price","Quantity");
                        userOptions.bookList(productInventory);
                        break;
                    case "b":
                        System.out.println("\n~~~~~ Movie List ~~~~~");
                        System.out.println("---------------------------------");
                        System.out.printf("%-8s|%-10s|%-40s|%-9s|%5s\n" ,"ID","Type","Name","Price","Quantity");
                        userOptions.movieList(productInventory);
                        break;
                    case "c":
                        System.out.println("\n~~~~~ Album List ~~~~~");
                        System.out.println("---------------------------------");
                        System.out.printf( "%-8s|%-10s|%-40s|%-9s|%5s\n" ,"ID","Type","Name","Price","Quantity");
                        userOptions.albumList(productInventory);
                        break;
                    case "d":
                        System.out.println("\n~~~~~ Video Game List ~~~~~");
                        System.out.println("---------------------------------");
                        System.out.printf( "%-8s|%-10s|%-40s|%-9s|%5s\n" ,"ID","Type","Name","Price","Quantity");
                        userOptions.videoGameList(productInventory);
                        break;
                    case "e":
                        System.out.println("\n~~~~~ Audio Book List ~~~~~");
                        System.out.println("---------------------------------");
                        System.out.printf( "%-8s|%-10s|%-40s|%-9s|%5s\n" ,"ID","Type","Name","Price","Quantity");
                        userOptions.audioBookList(productInventory);
                        break;
                    case "f":
                        System.out.println("\n~~~~~ All Product List ~~~~~");
                        System.out.println("---------------------------------");
                        System.out.printf( "%-8s|%-10s|%-40s|%-9s|%5s\n" ,"ID","Type","Name","Price","Quantity");
                        userOptions.allProductList(productInventory);
                        break;


                    case "g":
                        System.out.println("Returning to main menu.");
                        return;
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred. Please try again.");
        }
    }


    public void bookList(List<Product> productList) {
        for (Product product : productList) {
            if (product.getType().equalsIgnoreCase("book")) {
                System.out.printf( "%-8s|%-10s|%-40s|$%8.2f|%5d\n" ,product.getId(), product.getType(), product.getName() , product.getPrice() ,
                        product.getQuantity());
            }
        }
    }

    public void movieList(List<Product> productList) {
        for (Product product : productList) {
            if (product.getType().equalsIgnoreCase("movie")) {
                System.out.printf( "%-8s|%-10s|%-40s|$%8.2f|%5d\n" ,product.getId(), product.getType(), product.getName() , product.getPrice() ,
                        product.getQuantity());
            }
        }
    }

    public void albumList(List<Product> productList) {
        for (Product product : productList) {
            if (product.getType().equalsIgnoreCase("album")) {
                System.out.printf( "%-8s|%-10s|%-40s|$%8.2f|%5d\n" ,product.getId(), product.getType(), product.getName() , product.getPrice() ,
                        product.getQuantity());
            }
        }
    }

    public void videoGameList(List<Product> productList) {
        for (Product product : productList) {
            if (product.getType().equalsIgnoreCase("videogame")) {
                System.out.printf( "%-8s|%-10s|%-40s|$%8.2f|%5d\n" ,product.getId(), product.getType(), product.getName() , product.getPrice() ,
                        product.getQuantity());
            }
        }
    }

    public void audioBookList(List<Product> productList) {
        for (Product product : productList) {
            if (product.getType().equalsIgnoreCase("audiobook")) {
                System.out.printf( "%-8s|%-10s|%-40s|$%8.2f|%5d\n" ,product.getId(), product.getType(), product.getName() , product.getPrice() ,
                        product.getQuantity());
            }
        }
    }

    public void allProductList(List<Product> productList) {
        for (Product product : productList) {
            System.out.printf( "%-8s|%-10s|%-40s|$%8.2f|%5d\n" ,product.getId(), product.getType(), product.getName() , product.getPrice() ,
                    product.getQuantity());

        }
    }
}

