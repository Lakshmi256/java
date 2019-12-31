package com.BridgeLabz.BasicCorePrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPrimeFactors {
	@Test
	void testforPrimeFactorsOfN()throws Exception {
		assertEquals(5,5,PrimeFactors.primefactors(25));
		assertEquals(5,5,PrimeFactors.primefactors(37));
		assertEquals(5,5,PrimeFactors.primefactors(39));
		assertEquals(5,5,PrimeFactors.primefactors(25));
		assertEquals(5,5,PrimeFactors.primefactors(25));
		assertEquals(5,5,PrimeFactors.primefactors(25));
		assertEquals(5,5,PrimeFactors.primefactors(25));
		assertEquals(5,5,PrimeFactors.primefactors(25));
	}
}
