package cpm.qa.demo;

import java.util.ArrayList;
import java.util.List;

public class EnhancedLoops {

	public static void main(String[] args) {

		
		List<String> cities = new ArrayList<>();
		cities.add("London");
		cities.add("Tokyo");
		cities.add("Berlin");
		cities.add("Frankfurt");
		cities.add("Aberdeen");
		cities.add("Birmingham");
		
		List<Integer> nums = new ArrayList<>();
		nums.add(3);

		// the 's' is a variable that only lasts during the for-each loop
		for (String s : cities) {
			System.out.println(s);
		}
		
		System.out.println("===================================");

		// Enhanced for loop (for-each loop)
		for (String string : cities) {
			System.out.println(string);
		}

	}
	
	
}
