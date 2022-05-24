package com.qa.example;

public class Runner {

	public static void main(String[] args) {
		Blackjack hand = new Blackjack();

		//both hands less than 0
		System.out.println(hand.play(-3, 0));
		System.out.println();
		//both hands more than 21
		System.out.println(hand.play(24, 29));
		System.out.println();
		//handOne wins
		System.out.println(hand.play(21, 13));
		System.out.println();
		//handTwo wins
		System.out.println(hand.play(22, 21));
		System.out.println();


	}

}
