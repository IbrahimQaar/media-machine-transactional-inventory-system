package com.techelevator.Product1;
public class Album extends Product {
    private String artist;
    private String numberOfTracks;
    private String recordLabel;

    public Album(String id, String type, String name, double price, int year, String genre,
                 int quantity, String artist, String numberOfTracks, String recordLabel) {
        super(id, type, name, price, year, genre, quantity);
        this.artist = artist;
        this.numberOfTracks = numberOfTracks;
        this.recordLabel = recordLabel;
    }

    public String getArtist() {
        return artist;
    }

    public String getNumberOfTracks() {
        return numberOfTracks;
    }

    public String getRecordLabel() {
        return recordLabel;
    }
}
