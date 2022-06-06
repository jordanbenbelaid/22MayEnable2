package com.qa.solution;

public class Runner {

	public static void main(String[] args) {
		Penthouse pent = new Penthouse();
		
		BedroomAdder bedAdd = new BedroomAdder();
		
		System.out.println(pent.getNumberOfBedrooms());
		
		bedAdd.addBedroom(pent);
		
		System.out.println(pent.getNumberOfBedrooms());

	}

}
