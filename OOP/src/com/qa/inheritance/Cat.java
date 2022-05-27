package com.qa.inheritance;

public class Cat {

	private String colour;
	private String habitat;
	
	public Cat() {}
	
	public Cat(String colour, String habitat) {
		super();
		this.colour = colour;
		this.habitat = habitat;
	}
	
	public void noise() {
		System.out.println("Meow");
	}
	
	public void eat() {
		System.out.println("I eat food");
	}

//	@Override
//	public String toString() {
//		return "Cat [colour=" + colour + ", habitat=" + habitat + "]";
//	}
	
	
}
