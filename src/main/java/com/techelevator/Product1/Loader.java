package com.techelevator.Product1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loader {

    public static List<Product> loadProducts(String fileName) {
        List<Product> itemsInProduct = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(new File(fileName))) {

            while (fileScanner.hasNextLine()) {
                String currentLine = fileScanner.nextLine();
                String[] splitUsingCommas = currentLine.split(",");

                String productType = splitUsingCommas[0];
                String title = splitUsingCommas[1];
                int year = Integer.parseInt(splitUsingCommas[2]);
                String genre = splitUsingCommas[3];
                String productId = splitUsingCommas[4];
                double productPrice = Double.parseDouble(splitUsingCommas[5]);
                String special1 = splitUsingCommas[6];
                String special2 = splitUsingCommas[7];
                String special3 = splitUsingCommas[8];
                int availableStock = Integer.parseInt(splitUsingCommas[9]);

                if (productType.equalsIgnoreCase("BOOK")) {
                    Book book = new Book(
                            productId,
                            productType,
                            title,
                            productPrice,
                            year,
                            genre,
                            availableStock,
                            special1,
                            special2,
                            special3
                    );
                    itemsInProduct.add(book);

                } else if (productType.equalsIgnoreCase("MOVIE")) {
                    Movie movie = new Movie(
                            productId,
                            productType,
                            title,
                            productPrice,
                            year,
                            genre,
                            availableStock,
                            special1,
                            special2,
                            special3
                    );
                    itemsInProduct.add(movie);

                } else if (productType.equalsIgnoreCase("ALBUM")) {
                    Album album = new Album(
                            productId,
                            productType,
                            title,
                            productPrice,
                            year,
                            genre,
                            availableStock,
                            special1,
                            special2,
                            special3
                    );
                    itemsInProduct.add(album);

                } else if (productType.equalsIgnoreCase("VIDEOGAME")) {
                    VideoGame videoGame = new VideoGame(
                            productId,
                            productType,
                            title,
                            productPrice,
                            year,
                            genre,
                            availableStock,
                            special1,
                            special2,
                            special3
                    );
                    itemsInProduct.add(videoGame);

                } else if (productType.equalsIgnoreCase("AUDIOBOOK")) {
                    AudioBook audioBook = new AudioBook(
                            productId,
                            productType,
                            title,
                            productPrice,
                            year,
                            genre,
                            availableStock,
                            special1,
                            special2,
                            special3
                    );
                    itemsInProduct.add(audioBook);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

        return itemsInProduct;
    }
}
