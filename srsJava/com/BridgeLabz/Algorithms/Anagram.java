package com.BridgeLabz.Algorithms;

import java.util.Arrays;

public class Anagram {
	public static boolean areAnagram(String str1,String str2) 
	{ 
		 char[] str3 = str1.toCharArray(); 
		 char[] str4= str2.toCharArray();
	    int n1 = str3.length; 
	    int n2 = str4.length; 
	    if (n1 != n2) 
	        return false; 
	    Arrays.sort(str3); 
	    Arrays.sort(str4); 
	    for (int i = 0; i < n1; i++) 
	        if (str3[i] != str4[i]) 
	            return false; 
	    return true; 
	} 
}
