package com.qa.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();
		
		//adding to a list
		cities.add("London");
		cities.add("Paris");
		cities.add("Berlin");
		cities.add("Lisbon");
		
		//getting from a list using the index
		System.out.println(cities.get(0));
		
		//setting an element in the list to something else
		cities.set(0, "Tokyo");
		
		//removes from a list using index
//		cities.remove(0);
		
		//find the size of the list
		cities.size();
		
		//clearing a whole list
//		cities.clear();
		
		//use cities.get(i) to print each value in the list
		//if you print just the list, you get all 4 values 4 times
		for(int i = 0; i < cities.size(); i++) {
			System.out.println(cities);
		}
		
		System.out.println("=======================================");
		
		Collections.reverse(cities);
		System.out.println(cities);
	}

}
