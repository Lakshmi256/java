package com.BridgeLabz.DataStructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBinarytree {

	@Test
	void testforNodesinBinaryTree()throws Exception {
		assertEquals(14,Binarytree.bintree(4));
		assertEquals(1,Binarytree.bintree(1));
		assertEquals(2,Binarytree.bintree(2));
		assertEquals(5,Binarytree.bintree(3));
		assertEquals(42,Binarytree.bintree(5));
		assertEquals(6.564120419999999E9,Binarytree.bintree(20));
	}

}
