package com.BridgeLabz.JunitTesting;

public class VendingMachine {
	public static int vend(int cash)
{
	int arr[]=new int[] {1000,500,100,50,10,5,2,1};
	int sum=0;
	for (int i=0;i<arr.length;i++)
	{
	if (cash>=arr[i]);
	{
	int x=cash/arr[i];
	cash=cash%arr[i];
	sum=sum+x;
}
	}
	return sum;
	}
}
