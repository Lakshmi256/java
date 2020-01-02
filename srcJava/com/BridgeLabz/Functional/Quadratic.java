package com.BridgeLabz.Functional;

public class Quadratic {
	public static double  quad(int a,int b,int c)
	{
		double delta=(b*b)-(4*a*c);
		double x1=(-b)+ Math.sqrt(delta)/2*a;
		double x2=(-b)- Math.sqrt(delta)/2*a;
		return x1;
	}
}
