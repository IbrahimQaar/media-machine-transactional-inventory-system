package com.techelevator.Product1;
public class Book extends Product {
    private String author;
    private String isbn;
    private String pageCount;

    public Book(String id, String type, String name, double price, int year,
                String genre, int quantity, String author, String isbn, String pageCount) {
        super(id, type, name, price, year, genre, quantity);
        this.author = author;
        this.isbn = isbn;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPageCount() {
        return pageCount;
    }
}

