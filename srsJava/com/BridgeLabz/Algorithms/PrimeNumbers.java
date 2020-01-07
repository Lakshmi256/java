package com.BridgeLabz.AlgorithmPrograms;
//purpose: To find the prime numbers in a range 0-1000.


import com.BridgeLabz.utility.Util;
public class PrimeNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[1000];
		int l=0;
				for (int n=0;n<1000;n++)
					{
				boolean a=Util.isPrime(n);
			if (a==true) 
			{
			arr[l]=n;
			l++;
			}
			}
				System.out.println("the prime numbers are:");
				for(int i=0;i<l;i++)
				{
					System.out.print(" "+arr[i]);
				}
	}

}
