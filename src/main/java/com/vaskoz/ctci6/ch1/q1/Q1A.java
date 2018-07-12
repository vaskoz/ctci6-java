package com.vaskoz.ctci6.ch1.q1;

public class Q1A {
	/**
	 * This solution uses an "int" as a bitset.
	 * Characters are restricted to 'a' - 'z' to allow this.
	 */
	public static boolean areCharactersUnique(String str) {
		if (str.length() > 26) {
			return false;
		}

		int bitset = 0;

		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			int bitPosition = letter - 'a';
			if (bitPosition < 0 || bitPosition >= 26) {
				throw new IllegalArgumentException("Illegal letter found: " + letter);
			}
			if ( (bitset & (1 << bitPosition)) != 0 ) {
				return false;
			}
			bitset |= (1 << bitPosition);
		}
		return true;
	}
}
