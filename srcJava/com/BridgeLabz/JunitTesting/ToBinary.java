package com.BridgeLabz.JunitTesting;

public class ToBinary {
	public static int tobin(int n)
	{
		int[] binnum=new int[1000];
		int i=0;
		while(n>0)
		{
			binnum[i]=n%2;
			n=n/2;
			i++;
		}
		int sum=0,l=1;
		for(int j=0;j<i;j++)
		{
			if (j<=i)
			{
				sum=sum+binnum[j]*l;
			}
			l=l*10;
		}	
		return sum;
	}
}
