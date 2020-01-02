package com.BridgeLabz.Functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestWindChill {

	@Test
	void testforWindChill()throws Exception {
		assertEquals(425.94911061542285,WindChill.wind(55, 28));
		assertEquals(388.31989539038415,WindChill.wind(55, 24));
		assertEquals(1593.5779080927769,WindChill.wind(123, 66));
		assertEquals(0,WindChill.wind(37, 43));
		assertEquals(0,WindChill.wind(55, 2));
		assertEquals(0,WindChill.wind(55, 121));
		assertEquals(1635.8744843965367,WindChill.wind(99, 99));
	}

}
