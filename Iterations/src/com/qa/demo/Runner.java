package com.qa.demo;

public class Runner {

	public static void main(String[] args) {
	//	whileLoop();
	//	doWhileLoop();
		forLoop();
	}

	//WHILE LOOP
	public static void whileLoop() {
		int num = 1;

		while (num < 6) {
			num++;
			System.out.println(num);
		}

		System.out.println("No more numbers available!");
	}
	
	//DO WHILE LOOP
	public static void doWhileLoop() {
		int num = 1;
		
		do {
			num++;
			
			if(num % 2 == 0) {
				System.out.println(num);
				num++;
			} else {
				num = num + 2;
				System.out.println(num);
			}
		
		} while(num < 30);
		System.out.println("Number exceeds limit!");
	}
	
	//FOR LOOP
	public static void forLoop() {
		
		//first part (int i = 0) is the start point, second part is the range, 
		//third part is incrementing or decrementing
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}
}







