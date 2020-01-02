package com.BridgeLabz.DataStructures;

public class Binarytree {
	//to find the factorial of a number.
	public static double fact(double x)
	{
		if (x==1)
			return 1;
		else
			return(x*fact(x-1));
		
	}
		public static double bintree(int n) {	
	
	double sum=fact(2*n)/(fact(n+1)*fact(n));//equation for the nodes in binary search tree.
	return sum;
		}
}
