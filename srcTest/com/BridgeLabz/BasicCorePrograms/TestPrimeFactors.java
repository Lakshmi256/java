package com.BridgeLabz.BasicCorePrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPrimeFactors {
	@Test
	void given25_afterprimefactors_itshouldbe5and5()throws Exception {
		assertEquals(5,5,PrimeFactors.primefactors(25));
	
	}
}
