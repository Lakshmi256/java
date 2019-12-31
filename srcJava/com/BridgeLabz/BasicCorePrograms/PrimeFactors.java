package com.BridgeLabz.BasicCorePrograms;

public class PrimeFactors {
	public static int primefactors(int n)
	{
		while(n%2==0)
		{
			n=n/2;
			return 2;
		}
		for(int i=3;i<=Math.sqrt(n);i+=2)
		{
			while(n%i==0)
			{
				n/=i;
				return i;
				
			}
		}
		if(n>2)
			return n;
	return n;
	}
}
