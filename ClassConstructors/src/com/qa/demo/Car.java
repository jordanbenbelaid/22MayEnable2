package com.qa.demo;

public class Car {

	private int doors;
	private String make;
	private int horsepower;
	
	//Default constructor
	public Car() {	}
	
	//Everything constructor - constructors shouldnt be the same!
	public Car(int doors, String make, int horsepower) {
		this.doors = doors;
		this.make = make;
		this.horsepower = horsepower;
	}
	
	//COnstructors cannot have the same data type layout
	public Car(int doors, String make) {
		this.doors = doors;
		this.make = make;
	}
//	public Car(String make, int doors) {
//		this.make = make;
//		this.horsepower = doors;
//	}
	
	
	
	//This is allowed, because the order of the data types is different
	public Car(String make, int horsepower) {
		this.make = make;
		this.horsepower = horsepower;
	}
}
