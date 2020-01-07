package com.BridgeLabz.DataStructures;
//purpose: To store the prime numbers which are annagrams and remaining numbers in 2D arrays.


import com.BridgeLabz.utility.Util;
public class PrimeAnagrams {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[1000];
		int[][] brr=new int[2][1000];
		int l=0,z=0,c=0;
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
				System.out.println("the anagram numbers are");
				for (int k=0;k<l;k++)
						for(int m=k+1;m<l;m++)
						{
							char[] x=("" + arr[k]).toCharArray();
							char[] y=("" + arr[m]).toCharArray();
						if(	(Util.areAnagram(x,y))==true) 
					
						{
							brr[z][c]=arr[k];
							brr[z][c+1]=arr[m];
							c=c+2;
						}
					}
				for(int i=0;i<c;i++)
				{
					System.out.print(brr[0][i]+" ");
				}
				z=1;
				int d=0;
				for(int m=0;m<l;m++)
				{
					if(ser(brr,arr[m],c)==true)
					{
						brr[z][d]=arr[m];
								d=d+1;
					}
						
				}
				
			System.out.println();
			for(int i=0;i<d;i++)
			{
				System.out.print(brr[1][i]+" ");
			}
	}
	public static boolean ser(int[][] brr,int arr,int y )
	{
		
			for(int m=0;m<y;m++)
			{
				if (arr==brr[0][m])
				{
					return false;
				}
			}
			return true;
	}
}
