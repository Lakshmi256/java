package com.BridgeLabz.BasicCorePrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHarmonic {

	@Test
	public void testHarmonicSeries() throws Exception{
		assertEquals(1,Harmonic.harmonic(1));
		assertEquals(1.5,Harmonic.harmonic(2));
		assertEquals(1.8333333333333333,Harmonic.harmonic(3));
		assertEquals(2.083333333333333,Harmonic.harmonic(4));
		assertEquals(2.9289682539682538,Harmonic.harmonic(10));
		assertEquals(3.3182289932289937,Harmonic.harmonic(15));
		assertEquals(3.8159581777535068,Harmonic.harmonic(25));
	}

}
