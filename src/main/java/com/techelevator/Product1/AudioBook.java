package com.techelevator.Product1;

public class AudioBook extends Product {
    private String narrator;
    private String length;
    private String author;

    public AudioBook(String id, String type, String name, double price, int year, String genre,
                     int quantity, String narrator, String length, String author) {
        super(id, type, name, price, year, genre, quantity);
        this.narrator = narrator;
        this.length = length;
        this.author = author;
    }

    public String getNarrator() {
        return narrator;
    }

    public String getLength() {
        return length;
    }

    public String getAuthor() {
        return author;
    }
}
