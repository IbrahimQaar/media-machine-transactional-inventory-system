package com.techelevator.Product1;

public class VideoGame extends Product{
    private String platform;
    private String developer;
    private String ageRating;

    public VideoGame(String id, String type, String name, double price, int year, String genre,
                     int quantity, String platform, String developer, String ageRating) {
        super(id, type, name, price, year, genre, quantity);
        this.platform = platform;
        this.developer = developer;
        this.ageRating = ageRating;
    }

    public String getPlatform() {
        return platform;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public String getDeveloper() {
        return developer;
    }
}
