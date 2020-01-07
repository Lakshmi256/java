package com.BridgeLabz.AlgorithmPrograms;
//purpose: To find the prime numbers which are annagram and pallindrome.


import com.BridgeLabz.utility.Util;
public class AnagramsandPallindrome {
	public static void main(String[] args) {
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
		System.out.println(" ");
		System.out.println("the pallimdrome numbers are:");
		for(int i=0;i<l;i++)
		{
			if( Util.ispallindrome(arr[i])==true)
			{
			System.out.print(" "+arr[i]);
		}}
		System.out.println(" ");
		System.out.println("the anagram numbers are");
		for (int k=0;k<l;k++)
				for(int m=k+1;m<l;m++)
				{
					char[] x=("" + arr[k]).toCharArray();
					char[] y=("" + arr[m]).toCharArray();
				if(	(Util.areAnagram(x,y))==true) 
			
				{
					System.out.print(" "+arr[k]+"---"+arr[m]+" ");
				}
			}
		}
	}