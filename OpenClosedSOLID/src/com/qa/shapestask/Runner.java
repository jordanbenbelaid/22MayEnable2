package com.qa.shapestask;

public class Runner {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setRadius(5);
		
		Rectangle rec = new Rectangle();
		rec.setLength(4);
		rec.setWidth(7);

		AreaCalculator acalc = new AreaCalculator();
		
		System.out.println(acalc.calculateShapeArea(circle));
	}

}
