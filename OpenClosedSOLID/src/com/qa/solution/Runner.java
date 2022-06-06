package com.qa.solution;

public class Runner {

	public static void main(String[] args) {
		FormalGreeting fg = new FormalGreeting();
		CasualGreeting cg = new CasualGreeting();
		
		Greeter formalGreet = new Greeter(fg);
		Greeter casualGreet = new Greeter(cg);
		
		System.out.println(formalGreet.greet());
		System.out.println(casualGreet.greet());

	}

}
