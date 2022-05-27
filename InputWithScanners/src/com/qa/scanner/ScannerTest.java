package com.qa.scanner;

import java.util.Scanner;

public class ScannerTest {

	
	public void tryMeOut() {
	//Initiate our scanner
	Scanner scan = new Scanner(System.in);
	
//	System.out.println("How many drinks have you had today");
//	int num = scan.nextInt();
	
	//extra scan.nextLine(); -- This goes after a next() method, except for the scan.nextLine();
//	scan.nextLine();
	
	System.out.println("What's your favourite food");
	String food = scan.nextLine();
	
	System.out.println("How many drinks have you had today");
	int num = scan.nextInt();
	
	System.out.println("What would you rate this app out of 10");
	int rating = scan.nextInt();
	
	System.out.println("You have had " + num + " drinks tonight, and your favourite food is " + food
			 + ", and you rated the app today a " + rating + "/10");
	}
	
}
