package com.vaskoz.ctci6.ch1.q1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Q1_Test {
	@Test
	public void verifyCharacterUniquenessInString() {
		assertEquals(true, Q1.areCharactersUnique("abc"));
		assertEquals(false, Q1.areCharactersUnique("abca"));
		assertEquals(false, Q1.areCharactersUnique("aabc"));
		assertEquals(false, Q1.areCharactersUnique("bbbb"));
	}
}
