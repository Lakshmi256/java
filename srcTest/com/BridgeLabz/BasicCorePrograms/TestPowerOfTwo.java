package com.BridgeLabz.BasicCorePrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPowerOfTwo {

	@Test
	void given5_afterpoweroftwo_itshouldbe_16() {
		assertEquals(16,PowerOfTwo.poweroftwo(5));
	}

}
