package com.BridgeLabz.functionalPrograms;
//purpose: to create a 2Darray.


import com.BridgeLabz.utility.Util;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=Util.readInt();
double[][] b=new double[10][10]; 
int m=Util.readInt();
boolean[][] c=new boolean[10][10];
int[][] a =new int[10][10];
for(int i=0;i<n;i++)
	for(int j=0;j<m;j++)
	{
		
		a[i][j]=Util.readInt();
	}
for(int i=0;i<n;i++)
	for(int j=0;j<m;j++)
	{
		b[i][j]=Util.readdouble();
	}
for(int i=0;i<n;i++)
	for(int j=0;j<m;j++)
	{
		c[i][j]=Util.readBoolean();
	}
for(int i=0;i<n;i++)
	for(int j=0;j<m;j++)
	{
		System.out.println(a[i][j]);
	}
for(int i=0;i<n;i++)
	for(int j=0;j<m;j++)
	{
		System.out.println(b[i][j]);
	}
for(int i=0;i<n;i++)
	for(int j=0;j<m;j++)
	{
		System.out.println(c[i][j]);
	}
	}

}
