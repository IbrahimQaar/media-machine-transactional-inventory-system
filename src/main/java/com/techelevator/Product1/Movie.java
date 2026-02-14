package com.techelevator.Product1;
public class Movie extends Product {
        private String director;
        private String runtime;
        private String rating;

    public Movie(String id, String type, String name, double price, int year, String genre,
                 int quantity, String director, String runtime, String rating) {
        super(id, type, name, price, year, genre, quantity);
        this.director = director;
        this.runtime = runtime;
        this.rating = rating;
    }

    public String getDirector() {
            return director;
        }

        public String getRuntime() {
            return runtime;
        }

        public String getRating() {
            return rating;
        }
    }

