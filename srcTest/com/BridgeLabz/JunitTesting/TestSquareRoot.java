package com.BridgeLabz.JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSquareRoot {

	@Test
	void given25_aftersquareroot_itshouldbe_5()throws Exception {
		assertEquals(5,SquareRoot.sqrt(25));
		assertEquals(6.244997998398398,SquareRoot.sqrt(39));
		assertEquals(6, SquareRoot.sqrt(36));
		assertEquals(8, SquareRoot.sqrt(64));
	}

}
