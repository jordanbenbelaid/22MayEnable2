package com.qa.calculator;

public class Calculator {
	
	public double sum;

	public double add(double x, double y) {
		sum = x + y;
		return sum;
	}
	
	public double subtract(double x, double y) {
		sum = x - y;
		return sum;	
		}
	
	public double multiply(double x, double y) {
		sum = x * y;
		return sum;	
		}
	
	public double divide(double x, double y) {
		sum = x / y;
		return sum;	
		}
}
