package com.BridgeLabz.DataStructures;
//purpose:to store the prime numbers in 2D arrays.



import com.BridgeLabz.utility.Util;
public class TwoDarrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[100][1000];
		int l=0,M=0,L=100,m=0;
		while(L<=1000)
		{
			m=0;
				for (int n=M;n<L;n++)
					{
				boolean a=Util.isPrime(n);
			if (a==true) 
			{
			arr[l][m]=n;
			m++;
			}
			}	
				System.out.println();
				for(int j=0;j<m;j++)
			{
				System.out.print(" "+arr[l][j]);
			}	
				l++;
				M+=100;
				L+=100;	
		}	
	}
}