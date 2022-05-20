package com.qa.runner;

import com.qa.customer.Customer;

public class Runner {

	public static void main(String[] args) {
		//Creating a customer object
		Customer cust = new Customer();
		Customer personOne = new Customer("Jordan", "Benbelaid", 25);
		
		//Getting the information from personOne
		System.out.println(personOne.getAge());
		System.out.println(personOne.getFirstName());
		System.out.println(personOne.getLastName());
		
		//Setting values for cust
		cust.setAge(19);
		cust.setFirstName("Jake");
		cust.setLastName("Wilson");
		
		System.out.println("=============================================================================");
		
		//printing the new set values of cust
		System.out.println(cust);
		
		
		
		
//		cust.customerInfo();
//		
//		System.out.println(cust.age);
		
//		System.out.println(cust.getEmail());
//		cust.setEmail("test@test.com");
//		System.out.println(cust.getEmail());
	}

}
