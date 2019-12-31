package com.BridgeLabz.BasicCorePrograms;

public class LeapYear {
	public static boolean leap(int x)
	{
		int a=x,count=0;
		while(a!=0)
		{
			a=a/10;
			count++;
		}
		if(count==4)
		{
			if((x%4==0)&&(x%100!=0)||(x%400==0))
				return true;
			return false;
		}
		else
		{
			return false;
		}
		
	}
}
