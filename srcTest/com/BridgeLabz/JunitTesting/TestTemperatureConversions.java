package com.BridgeLabz.JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTemperatureConversions {

	@Test
	void testforTemperatureConversions()throws Exception {
assertEquals(23.88888888888889,TemperatureConversions.temp(1, 75));
assertEquals(167.0,TemperatureConversions.temp(0, 75));
assertEquals(347.0,TemperatureConversions.temp(0, 175));
assertEquals(79.44444444444444,TemperatureConversions.temp(1, 175));
assertEquals(75.0,TemperatureConversions.temp(1, 167));
assertEquals(175.0,TemperatureConversions.temp(1,347));
	}

}
