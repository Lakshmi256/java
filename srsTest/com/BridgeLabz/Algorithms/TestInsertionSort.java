package com.BridgeLabz.Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInsertionSort {

	@Test
	void given_arr_afterInsertion_itshouldbe_brr()throws Exception {
		String[] arr= {"ccc","abb","aba","aaa"};
		String[] brr={"aaa","aba","abb","ccc"};
		assertArrayEquals(brr, InsertionSort.insertion(arr, 4));
	}
}
