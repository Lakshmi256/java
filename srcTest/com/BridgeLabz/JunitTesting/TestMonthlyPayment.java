package com.BridgeLabz.JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMonthlyPayment {

	@Test
	void given500_5_1_aftermonthlyPayment_itshouldbe428_0374() {
		assertEquals(428.03740894233687,MonthlyPayment.month(5000, 5, 1));
		assertEquals(2127.013168423962,MonthlyPayment.month(50000, 2, 2));
		assertEquals(8791.588723000987,MonthlyPayment.month(100000, 10, 1));
		assertEquals(105.12494564419434,MonthlyPayment.month(12000, 1, 10));
	}

}
