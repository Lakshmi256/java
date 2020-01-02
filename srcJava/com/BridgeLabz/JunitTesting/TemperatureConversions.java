package com.BridgeLabz.JunitTesting;

public class TemperatureConversions {
	public static double temp(int x,double T)
	{
		if (x==0)
		{
			double sum=(T*9/5)+32;
			return sum;
		}
		else
		{
			double sum=(T-32)*5/9;
			return sum;
	}
}}
