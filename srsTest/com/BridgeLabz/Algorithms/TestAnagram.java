package com.BridgeLabz.Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAnagram {

	@Test
	void givenTapandpaT_whenAnagram_itshouldbeTrue() {
		assertEquals(true,Anagram.areAnagram("week","keew"));
		assertEquals(true,Anagram.areAnagram("pat","tap"));
		assertEquals(true,Anagram.areAnagram("a gentleman","elegant man"));
		assertEquals(false,Anagram.areAnagram("agentleman","elegant man"));
	}

}
