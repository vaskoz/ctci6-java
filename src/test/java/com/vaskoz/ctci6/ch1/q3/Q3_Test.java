package com.vaskoz.ctci6.ch1.q3;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class Q3_Test {
	@Test
	public void urlify() {
		char[] data = "Mr John Smith    ".toCharArray();
		Q3.urlify(data, 13);
		assertArrayEquals("Mr%20John%20Smith".toCharArray(), data);
	}
}
