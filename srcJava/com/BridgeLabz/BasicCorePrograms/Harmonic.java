package com.BridgeLabz.BasicCorePrograms;

public class Harmonic {
	public static double harmonic(int n)
	{
		double sum=0;
		for(double i=1;i<=n;i++)
		{
			sum=sum+1/i;
		}
		return sum;
	}
}
