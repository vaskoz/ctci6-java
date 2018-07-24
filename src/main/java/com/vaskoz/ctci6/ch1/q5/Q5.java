package com.vaskoz.ctci6.ch1.q5;

public class Q5 {
	public static boolean oneAway(String one, String two) {
		if (Math.abs(one.length() - two.length()) > 1) {
			return false;
		}
		final var longer = one.length() >= two.length() ? one : two;
		final var shorter = one.length() < two.length() ? one : two;
		var diffs = 0;
		var i = 0;
		var j = 0;
		while (i < shorter.length() && j < longer.length()) {
			if (shorter.charAt(i) != longer.charAt(j)) {
				diffs++;
				if (j + 1 < longer.length() && shorter.charAt(i) == longer.charAt(j + 1)) {
					j++;
					continue;
				}
			}
			i++;
			j++;

		}
		return diffs <= 1;
	}
}
