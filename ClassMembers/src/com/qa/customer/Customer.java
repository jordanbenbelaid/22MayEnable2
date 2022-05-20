package com.qa.customer;

public class Customer {
	
	//Attributes - When we have a private attributes, we need Getters and Setters to access them in the runner
	private String firstName;
	private String lastName;
	private int age;
	
	
	//Default constructor - allows us to make the object in the runner
	public Customer() {}
	
	//Constructor - You can have as many constructors as you want
	public Customer(String forename, String surname, int experience) {
		this.firstName = forename;
		this.lastName = surname;
		this.age = experience;
	}
	
	
	//Getters and Setters - Allow you to access the private attributes from the runner class
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//ToString method allows us to see the whole object details/attributes (name, age etc)
	// "\n" inside the String will start a new line
	@Override
	public String toString() {
		return "firstName=" + firstName + "\nlastName=" + lastName + "\nage=" + age;
	}
	
	//method 1
	public void message() {
		System.out.println("This java stuff is pretty cool");
	}
	
	//method 2
	public void newMessage() {
		System.out.println("Actually, this is kinda hard");
	}
	
	
	
}
