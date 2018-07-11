package com.vaskoz.ctci6.ch1.q1;

import java.util.HashSet;

public class Q1 {
	public static boolean areCharactersUnique(String str) {
		var letters = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			if (letters.contains(letter)) {
				return false;
			}
			letters.add(letter);
		}
		return true;
	}
}
