package com.qa.demo;

public class Arrays {

	public static void main(String[] args) {
		//creating a single dimension array, completely empty
		int[] scores;
		scores = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		//creating a single dimension array, with a dataset already present
		int[] ratings = {1,2,3,4,5,6,7,8,9};
		
		//creating a single dimension array, no data but size 10
		int[] ages = new int[10];
		ages[0] = 2;
		
	//	System.out.println(ratings.length);
		
		//Printing the array values
		for(int i = 0; i < ratings.length; i++) {
			System.out.println(ratings[i]);
		}
		
		
		
		//Creating a mulitdimensional array, empty
		String [][] drinks;
		
		//creating a multidimensional array with a dataset implemented
		String[][] names = {{"Jordan", "Harry", "Ed"},{"Billy", "Lewis", "Omar"},{"Rory"}};

		//Creating a mulitdimensional array, no data but size/s there
		//the '2' is for how many arrays we are making/how many dimensions the array has
		//the '5' is for how many values each array will hold
		String[][] foods = new String[2][5];
		foods[1][0] = "Pizza";
		
		
	}

}
