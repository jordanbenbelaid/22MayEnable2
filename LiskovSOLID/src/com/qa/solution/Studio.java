package com.qa.solution;

public class Studio {
    private int squareFootage;
    private int numberOfBedrooms;;

    public Studio() {
        this.setNumberOfBedrooms(0);
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
    this.numberOfBedrooms = numberOfBedrooms;
    }
}
