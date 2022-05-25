package com.qa.solution;

public class Solutions {

	public void printingVertical(String message) {
	
		String word = "";
	
		for(int i = 0; i < message.length(); i++) {
			if(message.substring(i, i + 1).equals(" ")) {
				System.out.println(word);
				word = "";
			} else {
				word += message.substring(i, i+1);
			}
		}
		System.out.println(word);	
	}
	
	public void printingVerticalReversed(String message) {
		
		String word = "";
		
		for(int i = message.length(); i > 0 ; i--) {
			if(message.substring(i - 1, i).equals(" ")) {
				System.out.println(word);
				word = "";
			}else {
				word = message.substring(i - 1, i) + word;
			}
		}
		System.out.println(word);
	}
}
