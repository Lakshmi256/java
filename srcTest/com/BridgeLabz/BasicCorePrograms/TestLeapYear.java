package com.BridgeLabz.BasicCorePrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLeapYear {

	@Test
	public void testforLeapYear() throws Exception{
		assertEquals(true,LeapYear.leap(1996));
		assertEquals(false,LeapYear.leap(2019));
		assertEquals(false,LeapYear.leap(996));
		assertEquals(true,LeapYear.leap(2000));
		assertEquals(false,LeapYear.leap(2100));
		assertEquals(true,LeapYear.leap(2020));
		assertEquals(true,LeapYear.leap(1856));
	
	}

}
