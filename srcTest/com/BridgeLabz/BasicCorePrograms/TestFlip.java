package com.BridgeLabz.BasicCorePrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFlip {

	@Test
	void given8_afterflip_itshouldbetrue() {
		assertEquals(true,Flip.flip(8));
	}

}
