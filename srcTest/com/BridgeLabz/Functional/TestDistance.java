package com.BridgeLabz.Functional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestDistance {

	@Test
	void given4and5_afterDistance_itshouldbe3() throws Exception{
		assertEquals(3,Distance.distance(5,4));
		assertEquals(5.744562646538029,Distance.distance(7,4));
		assertEquals(0,Distance.distance(5,5));
		assertEquals(2.8284271247461903,Distance.distance(3,1));
		assertEquals(6,Distance.distance(10,8));
		assertEquals(4.58257569495584,Distance.distance(5,2));
		
	}

}
