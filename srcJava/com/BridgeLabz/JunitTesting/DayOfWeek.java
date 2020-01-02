package com.BridgeLabz.JunitTesting;

public class DayOfWeek {
	public static int  dayofweek(int d,int m,int y)
	{
		int y1,x,m0,d0;
		y1=y-((14-m)/12);
		x=y1+y1/4-y1/100+y1/400;
		m0=m+(12*((14-m)/12)-2);
		d0=(d+(x*31*m0)/12)%7;
		int day=(int)d0;
			return day;
	}
}
