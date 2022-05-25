package com.qa.demo;

public class Runner {

	public static void main(String[] args) {
		//Creating an empty object using the default constructor
		Car myCar = new Car();
		
		
		//Creating an object using everything constructor
		Car jordanCar = new Car(3, "BMW", 140);	
		
		System.out.println(jordanCar);
	}

}
