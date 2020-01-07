package com.BridgeLabz.AlgorithmPrograms;
//purpose: To sort a String using merge sort.


import com.BridgeLabz.utility.Util;

public class MergSort {  
	    public static void main(String args[]) 
	    { 
	        int arr[] = {12, 11, 13, 5, 6, 7}; 
	        int l=0,r=arr.length-1;
	        int m=r/2;
	        System.out.println("given array");
	        for (int i=0;i<arr.length;i++)
	        {
	        	System.out.print(arr[i]+" ");
	        }
	        Util.merge(arr, l, m, r);
	  System.out.println( );
	        System.out.println("sorted array"); 
	        Util.printArray(arr); 
	    } 
	} 