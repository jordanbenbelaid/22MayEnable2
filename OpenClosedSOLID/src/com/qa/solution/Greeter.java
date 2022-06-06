package com.qa.solution;

public class Greeter {

	//not instantiating an object, creating the object variable
	private Greeting greeting;
	
	public Greeter(Greeting greeting) {
		this.greeting = greeting;
	}
	
	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	
	public String greet() {
		return this.greeting.greet();
	}
}
