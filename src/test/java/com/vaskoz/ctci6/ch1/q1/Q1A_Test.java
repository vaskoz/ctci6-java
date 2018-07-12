package com.vaskoz.ctci6.ch1.q1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Q1A_Test {
	@Test
	public void verifyCharacterUniquenessInString() {
		assertEquals(true, Q1A.areCharactersUnique("abc"));
		assertEquals(false, Q1A.areCharactersUnique("abca"));
		assertEquals(false, Q1A.areCharactersUnique("aabc"));
		assertEquals(false, Q1A.areCharactersUnique("bbbb"));
		assertEquals(true, Q1A.areCharactersUnique("abcdefghijklmnopqrstuvwxyz"));
		assertEquals(false, Q1A.areCharactersUnique("abcdefghijklmnopqrstuvwxyza"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void badCharacter() {
		Q1A.areCharactersUnique("A");
	}
}
