package com.qa.runner;

import java.util.Scanner;

import com.qa.calculator.Calculator;

public class Runner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Calculator calc = new Calculator();

		System.out.println("Enter first number");
		double a = input.nextDouble();
		
		System.out.println("Enter second number");
		double b = input.nextDouble();
		
		input.nextLine();
		
		System.out.println("What operator would you like to use?");
		String operator = input.nextLine();
		
		switch (operator) {
			case "Addition":
				System.out.println("The solution to your question is " + calc.add(a,b)) ;
				break;
			case "Subtract":
				System.out.println("The solution to your question is " + calc.subtract(a,b)) ;
				break;
			case "Multiply":
				System.out.println("The solution to your question is " + calc.multiply(a,b)) ;
				break;
			case "Divide":
				System.out.println("The solution to your question is " + calc.divide(a,b)) ;
				break;
		}
		
	}

}
