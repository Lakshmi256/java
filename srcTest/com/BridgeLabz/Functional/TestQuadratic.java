package com.BridgeLabz.Functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestQuadratic {

	@Test
	void given12and1_afterquadraticroots_itshouldbe_2()throws Exception {
	assertEquals(2,Quadratic.quad(1,-2,1));
	assertEquals(3.5,Quadratic.quad(1,-3,2));
	assertEquals(6.5,Quadratic.quad(1,-5,4));
	assertEquals(-2,Quadratic.quad(1,2,1));
	assertEquals(14.5,Quadratic.quad(5,-7,2));
	}


}
