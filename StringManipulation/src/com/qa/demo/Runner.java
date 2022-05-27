package com.qa.demo;

import com.qa.solution.Solutions;

public class Runner {

	public static void main(String[] args) {
		
		//creating a string from a char array
		char[] makeMeAString = {'H', 'E', 'L', 'L', 'O', 'O'};
		String madeString = new String(makeMeAString);
		System.out.println(madeString);
		
		//substrings
		System.out.println("Hello, this is a test".substring(1, 8));
		
		//replace
		System.out.println("Hello, this is a test".replace("this", "that is such a bad test,"));
		
	}

}
