package com.vaskoz.ctci6.ch1.q2;

import java.util.HashMap;
import java.util.Objects;

public class Q2 {
	public static boolean isPermutation(String one, String two) {
		if (one.length() != two.length()) {
			return false;
		}
		var letterCount = new HashMap<Character, Integer>();
		for (var i = 0; i < one.length(); i++) {
			var letter = one.charAt(i);
			var count = letterCount.getOrDefault(letter, 0);
			count++;
			letterCount.put(letter, count);
		}
		for (var i = 0; i < two.length(); i++) {
			var letter = two.charAt(i);
			var count = letterCount.get(letter);
			if (Objects.isNull(count)) {
				return false;
			} else if (count == 1) {
				letterCount.remove(letter);
			} else {
				count--;
				letterCount.put(letter, count);
			}
		}
		return letterCount.isEmpty();
	}
}
