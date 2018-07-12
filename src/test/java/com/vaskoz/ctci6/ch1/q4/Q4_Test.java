package com.vaskoz.ctci6.ch1.q4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Q4_Test {
	@Test
	public void isPalindromePermutation() {
		assertEquals(true, Q4.isPalindromePermutation("Tact coa"));
		assertEquals(false, Q4.isPalindromePermutation("Tact coat"));
	}
}
