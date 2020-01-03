package com.BridgeLabz.JunitTesting;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class TestDayOfWeek {

	@Test
	void given28_12_2019_afterfindingdayofweek_itshouldbe5()throws Exception {
		assertEquals(5,DayOfWeek.dayofweek(28, 12, 2019));
		assertEquals(3,DayOfWeek.dayofweek(1, 1, 2020));
		assertEquals(4,DayOfWeek.dayofweek(28, 9, 1996));
		assertEquals(6,DayOfWeek.dayofweek(25, 12, 2007));
		assertEquals(6,DayOfWeek.dayofweek(30, 11, 2010));
		assertEquals(1,DayOfWeek.dayofweek(31, 3, 2015));
		
		
	}

}
