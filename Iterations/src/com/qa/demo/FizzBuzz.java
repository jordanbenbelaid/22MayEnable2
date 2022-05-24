package com.qa.demo;

public class FizzBuzz {

	public static void main(String[] args) {
		buzzin();
	}
	
	public static int buzzin() {
		for(int i = 1; i < 100; i++) {
			if(i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 ==0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			}  else {
				System.out.println(i);
			}
		}
		return 0;
	}

}
