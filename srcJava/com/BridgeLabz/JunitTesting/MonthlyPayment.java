package com.BridgeLabz.JunitTesting;

public class MonthlyPayment {
	public static double  month(double p,double r,double t)
	{
		double n=12*t;
		double R=r/(12*100);
		double payment= (p*R)/(1-Math.pow((1+R),(-n)));
		return payment;
	}
}
