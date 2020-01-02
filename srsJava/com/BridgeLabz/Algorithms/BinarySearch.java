package com.BridgeLabz.Algorithms;

public class BinarySearch {
	public static boolean binarySearch(String[] arr, String x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
            int res = x.compareTo(arr[m]);  
            if (res == 0) 
                return true;  
            if (res > 0) 
                l = m + 1; 
            else
                r = m - 1; 
        } 
        return false; 
    }
}
