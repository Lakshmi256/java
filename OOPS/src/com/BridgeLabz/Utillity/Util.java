package com.BridgeLabz.Utillity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Util {
	public static double distance(double x,double y)
	{
		double sum=Math.sqrt((x*x)-(y*y));
		return sum;
	}
	private static Scanner sc;
	private static final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static
	{
		sc=new Scanner(System.in);
	}
	public static  int readInt()
	{
		return sc.nextInt();
	}
	public static  float readfloat()
	{
		return sc.nextFloat();
	}
	public static long readlong()
	{
		return sc.nextLong();
	}
	public static String readString()
	{
		return sc.next();
	}
	public static String bufferScanner() throws IOException
	{
	return br.readLine();
	}
	public static  double readdouble()
	{
		return sc.nextDouble();
	}
	public static  boolean readBoolean()
	{
		return sc.nextBoolean();
	}
}

