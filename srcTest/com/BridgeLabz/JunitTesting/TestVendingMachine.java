package com.BridgeLabz.JunitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

class TestVendingMachine {

	@Test
	void givenamount5512_aftervending_itshouldreturn8notes() {
		assertEquals(8,VendingMachine.vend(5512));
		assertEquals(22,VendingMachine.vend(9999));
		assertEquals(14,VendingMachine.vend(8765));
		assertEquals(12,VendingMachine.vend(1799));
		assertEquals(13,VendingMachine.vend(1996));
	}

}
