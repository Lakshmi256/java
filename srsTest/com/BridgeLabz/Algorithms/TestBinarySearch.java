package com.BridgeLabz.Algorithms;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestBinarySearch {
	@Test
	void testforBinarySearch()throws Exception{
		String[] arr={"aac" ,"abb", "abc", "acb", "cab"};
		assertEquals(true,BinarySearch.binarySearch(arr,"abb"));
		assertEquals(true,BinarySearch.binarySearch(arr,"aac"));
		assertEquals(true,BinarySearch.binarySearch(arr,"abc"));
		assertEquals(true,BinarySearch.binarySearch(arr,"acb"));
		assertEquals(true,BinarySearch.binarySearch(arr,"cab"));
		assertEquals(false,BinarySearch.binarySearch(arr,"aaa"));
	}
}
