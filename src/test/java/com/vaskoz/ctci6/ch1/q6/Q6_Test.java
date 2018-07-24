package com.vaskoz.ctci6.ch1.q6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q6_Test {
	@Test
	public void compress() {
		assertEquals("a2b1c5a3", Q6.compress("aabcccccaaa"));
		assertEquals("aabbcc", Q6.compress("aabbcc"));
		assertEquals("a3b2c2", Q6.compress("aaabbcc"));
		assertEquals("", Q6.compress(""));
		assertEquals("", Q6.compress(null));
	}
}
