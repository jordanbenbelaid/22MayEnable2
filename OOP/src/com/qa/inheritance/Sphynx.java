package com.qa.inheritance;

public class Sphynx extends Cat{

	private int legs;

	public Sphynx() {
		super();
	}

	public Sphynx(String colour, String habitat, int legs) {
		super(colour, habitat);
		this.legs = legs;
	}
	
//	@Override
//	public void noise() {
//		System.out.println("Meow");
//	}
	
	@Override
	public void eat() {
		System.out.println("I eat only the finest cat food");
	}

//	@Override
//	public String toString() {
//		return "Sphynx [legs=" + legs + ", toString()=" + super.toString() + "]";
//	}

	
	
	
	
}
