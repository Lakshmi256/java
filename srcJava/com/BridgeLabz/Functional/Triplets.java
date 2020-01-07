package com.BridgeLabz.functionalPrograms;
//to find the triplets in a array.


import com.BridgeLabz.utility.Util;

public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=Util.readInt();
int[] a=new int[10];
for(int i=0;i<n;i++)
{
	a[i]=Util.readInt();
}
int x=Util.triplets(a);
System.out.println("num of triplets are"+x);
	}

}
