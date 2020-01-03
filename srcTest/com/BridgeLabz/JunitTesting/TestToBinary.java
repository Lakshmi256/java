package com.BridgeLabz.JunitTesting;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class TestToBinary {

	@Test
	void given2_afterbinaryconversion_itshouldbe10()throws Exception {
		assertEquals(10, ToBinary.tobin(2));
		assertEquals(11, ToBinary.tobin(3));
		assertEquals(101, ToBinary.tobin(5));
		assertEquals(111, ToBinary.tobin(7));
		assertEquals(1011, ToBinary.tobin(11));
		assertEquals(100000, ToBinary.tobin(32));
		assertEquals(1000011, ToBinary.tobin(67));
		assertEquals(1100100, ToBinary.tobin(100));
	}

}
