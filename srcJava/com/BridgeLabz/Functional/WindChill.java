package com.BridgeLabz.Functional;

public class WindChill {
	public static double  wind(double t,double v)
	{
		if ((t>50)&&(v<120)&&(v>3))
		{
		double w=(35.74+0.6215*t+(0.4275*t-35.75))*Math.pow(v,0.6);
		return w;
		}
		return 0;
	
	}
}
