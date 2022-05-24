package com.qa.demo;

public class ArraySolutions {

	public int[] arrayOne = {1,2,3,4,5,6,7,8,9,10};
	public int[] arrayTwo = new int[10];
	
	public void questionOne() {
		for(int i = 0; i < arrayOne.length; i++) {
			System.out.println(arrayOne[i]);
		}
	}
	
	public void questionTwo() {
		for(int i = 0; i < arrayOne.length; i++) {
			System.out.println(arrayOne[i]*10);
		}
	}
}
