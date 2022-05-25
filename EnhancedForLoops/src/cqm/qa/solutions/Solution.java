package cqm.qa.solutions;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		questionFour();
	}

	public static void questionFour() {
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);

		for (int i : nums) {
			if (evenOdd(i)) {
				System.out.println("The number " + i + " cubed is: " + Math.round(Math.pow(i, 3)));
			} else {
				System.out.println("The number " + i + " squared is: " + i * i);
			}
		}

	}

	public static Boolean evenOdd(int x) {
		if (x % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
