package com.BridgeLabz.JunitTesting;

public class VendingMachine {
	public static void vend(int cash)
{
	int arr[]=new int[] {1000,500,100,50,10,5,2,1};
	for (int i=0;i<arr.length;i++)
	{
	if (cash>=arr[i]);
	{
	int x=cash/arr[i];
	cash=cash%arr[i];
	System.out.println(arr[i]+" notes:"+x);
}
	}
	}
}
