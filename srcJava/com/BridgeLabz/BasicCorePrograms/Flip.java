package com.BridgeLabz.BasicCorePrograms;

public class Flip {
	public static boolean flip(int n)
	{
		double hcn=0,tcn=0;
		for(int i=0;i<n;i++)
		{
			double x=Math.random();
			if(x>0.5)
			{
				hcn++;
			}
			else
			{
				tcn++;
			}
			}
		double s,r;
		s=(tcn/n)*100;
		r=(hcn/n)*100;
		if(s+r==100)
			return true;
		return false;
		
	}
}
