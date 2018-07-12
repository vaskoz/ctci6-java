package com.vaskoz.ctci6.ch1.q2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Q2_Test {
	@Test
	public void isPermutation() {
		assertEquals(true, Q2.isPermutation("abc", "bca"));
		assertEquals(true, Q2.isPermutation("abca", "bcaa"));
		assertEquals(false, Q2.isPermutation("aa", "aac"));
		assertEquals(false, Q2.isPermutation("a", "aa"));
		assertEquals(false, Q2.isPermutation("abb", "aab"));
	}
}
