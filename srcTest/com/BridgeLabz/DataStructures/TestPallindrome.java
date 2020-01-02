package com.BridgeLabz.DataStructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPallindrome {

	@Test
	void testforPallindromeOfaString()throws Exception {
		assertEquals(true, Pallindrome.pallindrome("malayalam"));
		assertEquals(true, Pallindrome.pallindrome("civic"));
		assertEquals(true, Pallindrome.pallindrome("radar"));
	}
}
