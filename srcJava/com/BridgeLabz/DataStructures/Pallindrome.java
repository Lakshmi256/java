package com.BridgeLabz.DataStructures;
//purpose: Program to find a pallindrome of a string using deque.
public class Pallindrome {
	public static boolean pallindrome(String arr) {
		// TODO Auto-generated method stub
		   Deque<String> ob=new Deque<String>();
			String[] arr1=arr.split("");
			for(int i=0;i<arr1.length;i++)
			{
				ob.addRear(arr1[i]);
			}
		  
			boolean b=ob.checkPalindrome();
			
			if(b==true)
				return true;
			else
				return false;
	}
}

