package com.BridgeLabz.Algorithms;

public class InsertionSort {
	public static String[] insertion(String arr[],int n) {
		for (int i=1;i<n;i++)
		{
			String key=arr[i];
			int j=i-1;
			while (j>=0 && arr[j].compareTo(key)>0)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
	arr[j+1]=key;	
		}
	return arr;	
	}
}