package com.techelevator.Product1;

public class Product {
        private String id;
        private String type;
        private String name;
        private double price;
        private int year;
        private String genre;
        private int quantity;

    public Product(String id, String type, String name, double price,
                   int year, String genre, int quantity) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
        this.year = year;
        this.genre = genre;
        this.quantity = quantity;
    }

    public String getId() {
            return id;
        }

        public String getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

