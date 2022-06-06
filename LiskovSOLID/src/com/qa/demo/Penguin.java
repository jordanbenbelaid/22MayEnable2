package com.qa.demo;

public class Penguin extends FlightlessBird {
	private int speed;

	@Override
	public void noFly() {
		this.setSpeed(this.getSpeed() + 5);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
