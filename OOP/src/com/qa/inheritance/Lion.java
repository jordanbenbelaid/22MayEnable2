package com.qa.inheritance;

public class Lion extends Cat{

	private boolean hasMane;

	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lion(String colour, String habitat, boolean hasMane) {
		super(colour, habitat);
		this.hasMane = hasMane;
	}

	@Override
	public void noise() {
		System.out.println("Rawr");
	}
	
	@Override
	public void eat() {
		System.out.println("I eat only meat");
	}

	
	
	
}
