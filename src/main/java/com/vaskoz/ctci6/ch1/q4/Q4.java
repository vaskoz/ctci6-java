package com.vaskoz.ctci6.ch1.q4;

import java.util.HashMap;

public class Q4 {
	public static boolean isPalindromePermutation(String str) {
		var letterCount = new HashMap<Character, Integer>();
		for (var i = 0; i < str.length(); i++) {
			var letter = Character.toLowerCase(str.charAt(i));
			if (letter == ' ') {
				continue; // skip spaces
			}
			var count = letterCount.getOrDefault(letter, 0);
			count++;
			letterCount.put(letter, count);
		}
		var odds = 0;
		for (var counts : letterCount.values()) {
			if (counts % 2 == 1) {
				odds++;
			}
		}
		return odds < 2;
	}
}
