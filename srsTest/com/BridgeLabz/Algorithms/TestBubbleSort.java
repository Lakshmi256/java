package com.BridgeLabz.Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBubbleSort {

	@Test
	void givenarr_afterBubblesort_itshoubbe_brr()throws Exception {
		int[] arr= {4,3,32,12};
		int[] brr= {3,4,12,32};
		assertEquals(brr,BubbleSort.bubblesort(arr));
		
		
	}

}
