package com.qa.demo;

public class Owl extends FlyingBird {
    private int altitude;

    @Override
    public void fly() {
        this.setAltitude(this.getAltitude() + 1000);
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}