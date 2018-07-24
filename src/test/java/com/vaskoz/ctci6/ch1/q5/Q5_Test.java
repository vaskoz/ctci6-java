package com.vaskoz.ctci6.ch1.q5;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Q5_Test {
	@Test
	public void oneAway() {
		assertTrue(Q5.oneAway("pale", "ple"));
		assertTrue(Q5.oneAway("pales", "pale"));
		assertTrue(Q5.oneAway("pale", "bale"));
		assertFalse(Q5.oneAway("pale", "bake"));
		assertTrue(Q5.oneAway("pale", "palez"));
		assertTrue(Q5.oneAway("palez", "pale"));
		assertTrue(Q5.oneAway("pale", "palde"));
		assertTrue(Q5.oneAway("palde", "pale"));
		assertFalse(Q5.oneAway("too long", "too longgg"));
		assertTrue(Q5.oneAway("pale", "palee"));
		assertTrue(Q5.oneAway("pale", "pble"));
	}
}
