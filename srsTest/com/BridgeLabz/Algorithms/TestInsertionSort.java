package com.BridgeLabz.Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInsertionSort {

	@Test
	void testforInsertionSort()throws Exception {
		String[] arr= {"ccc","abb","aba","aaa"};
		String[] brr={"aaa","aba","abb","ccc"};
		assertArrayEquals(brr, InsertionSort.insertion(arr, 4));
	}
}
