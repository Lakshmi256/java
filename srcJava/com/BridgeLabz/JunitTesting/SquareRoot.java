package com.BridgeLabz.JunitTesting;

public class SquareRoot {
	public static double  sqrt(double num)
	{
		double t=num;
		double epsilon=1.0e-15;
		if (num>0)
		{
			while(Math.abs(t-num/t)>epsilon*t)
			{
				 t=((num/t)+t)/2.0;
			}
			return t;

			}
		else
		{
			t=t*(-1);
			double sum=sqrt(t);
			return sum;
			}
	}
}
