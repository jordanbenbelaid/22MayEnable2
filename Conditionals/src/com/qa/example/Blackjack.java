package com.qa.example;

public class Blackjack {

	
	public String play(int handOne, int handTwo) {
		
		if(handOne <= 0 || handTwo <= 0) {
			return "Hands cannot be below zero";
		} else if (handOne > 21 && handTwo > 21) {
			return "Both hands are bust";
		} else if (handOne > 21) {
			return "Hand 2 wins with : " + handTwo;
		} else if (handTwo > 21) {
			return "Hand 1 wins with : " + handOne;
		} else if (handOne > handTwo) {
			return "Hand 1 wins with : " + handOne;
		} else {
			return "Hand 2 wins with : " + handTwo;
		}
		
	}
}
