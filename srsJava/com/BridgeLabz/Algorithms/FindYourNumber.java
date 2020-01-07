package com.BridgeLabz.AlgorithmPrograms;
//purpose: To find the number which is guessed by the user.


import com.BridgeLabz.utility.Util;
public class FindYourNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[64];
		for (int i=0;i<64;i++)
{
	arr[i]=i;
}
		Util.fyn(arr);
	}
}
