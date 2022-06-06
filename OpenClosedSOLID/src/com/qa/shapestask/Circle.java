package com.qa.shapestask;

public class Circle implements Shape {

	private double radius;

    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
	
}
