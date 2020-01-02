package com.BridgeLabz.JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVendingMachine {

	@Test
	void testforNumberofNotesVendingMachineReturns() {
		assertEquals(8,VendingMachine.vend(5512));
		assertEquals(22,VendingMachine.vend(9999));
		assertEquals(14,VendingMachine.vend(8765));
		assertEquals(12,VendingMachine.vend(1799));
		assertEquals(13,VendingMachine.vend(1996));
	}

}
