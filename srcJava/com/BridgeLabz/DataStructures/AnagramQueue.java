package com.BridgeLabz.DataStructures;
//purpose: To find the prime anagrams and store it in a queue using linked list.


import com.BridgeLabz.utility.Util;
public class AnagramQueue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue=new Queue<Integer>();
		int[] arr=new int[1000];
		int[] brr=new int[1000];
		int l=0,c=0;
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
				{
					
					char[] x=("" + arr[k]).toCharArray();
						for(int m=k+1;m<l;m++)
						{
							char[] y=("" + arr[m]).toCharArray();
						if(	(Util.areAnagram(x,y))==true)				
						{
							brr[c]=arr[k];
							brr[c+1]=arr[m];
							c=c+2;
						}
					}			
				}
	for(int i=0;i<c;i++) {
		queue.enqueue(brr[i]);	
	}
	queue.show();
	}
}
