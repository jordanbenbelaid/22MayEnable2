package com.qa.example;

public class Conditionals {

	public static void main(String[] args) {
		
		//IF STATEMENTS (The wrong way)
		
//		int num = 60;
//		
//		if(num > 100) {
//			System.out.println("The number is greater than 100");
//		} 
//		
//		if (num > 90) {
//			System.out.println("This num is greater than 90");
//		} 
//		
//		if (num > 80) {
//			System.out.println("This number is greater than 80");
//		}
//		
//		if (num <= 80) {
//			System.out.println("Number is too low");
//		}

		//SWITCH CASES
		
//		int day = 3;
//		String dayName;
//		
//		switch(day) {
//        case 1:
//            System.out.println("Monday you can fall apart");
//            break;
//        case 2:
//            System.out.println("Tuesday,");
//            break;
//        case 3:
//            System.out.println("Wednesday break my heart");
//            break;
//        case 4:
//            System.out.println("Oh, Thursday doesn't even start");
//            break;
//        case 5:
//            System.out.println("It's Friday I'm in love");
//            break;
//        case 6:
//            System.out.println("Saturdaaaay wait");
//            break;
//        case 7:
//            System.out.println("Sunday always comes too late");
//            break;
//        default:
//            System.out.println("You need to listen to The Cure");
//            break;
//    }
		
		//Calculator revisited
		division(3, 3);
		
	}
	
	public static Double division(double a, double b) {
		if(a < b) {
			double answer = a / b;
			System.out.println(answer);
		} else {
			System.out.println("These numbers do not work together!");
		}
		return 0.0;
	}

}
