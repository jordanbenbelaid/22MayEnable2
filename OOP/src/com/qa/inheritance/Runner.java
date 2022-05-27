package com.qa.inheritance;

public class Runner {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.noise();
		cat.eat();
		
		
		Sphynx sphynx = new Sphynx("Black", "House", 4);
		sphynx.eat();
		sphynx.noise();
		System.out.println(sphynx);
		
		Lion lion = new Lion();
		lion.eat();
		lion.noise();
	}

}
