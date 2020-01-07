package com.BridgeLabz.utility;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
public class Util {
	//calculates distance between two points in a x-y plane.
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
	//to read integer.
	public static  int readInt()
	{
		return sc.nextInt();
	}
	//to read long integer.
	public static long readlong()
	{
		return sc.nextLong();
	}
	//to read String.
	public static String readString()
	{
		return sc.nextLine();
	}
	//to read String buffer.
	public static String bufferScanner() throws IOException
	{
	return br.readLine();
	}
	//to read double.
	public static  double readdouble()
	{
		return sc.nextDouble();
	}
	//to read boolean.
	public static  boolean readBoolean()
	{
		return sc.nextBoolean();
	}
	//to find triplets in a array.
	public static int triplets(int a[])
	{
		int n=a.length,count=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				for(int k=0;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
						count++;
					}
				}
		return count;
	}
	//to find roots of quadtratic equation.
	public static void  quad(double a,double b,double c)
	{
		double delta=(b*b)-(4*a*c);
		double x1=(-b)+ Math.sqrt(delta)/2*a;
		double x2=(-b)- Math.sqrt(delta)/2*a;
		System.out.println(x1+" "+x2);
	}
	//to calculate wind chill.
	public static void  wind(double t,double v)
	{
		if ((t>50)&&(v<120)&&(v>3))
		{
		double w=(35.74+0.6215*t+(0.4275*t-35.75))*Math.pow(v,0.6);
		System.out.println("the whind s=chill is :"+w);
		}
		else
		{
		System.out.println("invalid inputs");
		}
	}
	//to find day of week.
	public static void  dayofweek(int d,int m,int y)
	{
		int y1,x,m0,d0;
		y1=y-((14-m)/12);
		x=y1+y1/4-y1/100+y1/400;
		m0=m+(12*((14-m)/12)-2);
		d0=(d+(x*31*m0)/12)%7;
		int day=(int)d0;
			System.out.println(day);
	}
	//to find square root of a number.
	public static void  sqrt(double num)
	{
		double t=num;
		double epsilon=1.0e-15;
		if (num>0)
		{
			while(Math.abs(t-num/t)>epsilon*t)
			{
				 t=((num/t)+t)/2.0;
			}
			System.out.println("t="+t);

			}
		else
		{
			System.out.println("given number is negitive num");
			}
	}
	//to find the monthly payment using simple intrest formulaes.
	public static void  month(double p,double r,double t)
	{
		double n=12*t;
		double R=r/(12*100);
		double payment= (p*R)/(1-Math.pow((1+R),(-n)));
		System.out.println("the monthly payment is:"+payment);
	}
	//temperature conversion.
	public static void temp(int x,double T)
	{
		if (x==0)
		{
			double sum=(T*9/5)+32;
			System.out.println("C to F c"+sum);
		}
		else
		{
			double sum=(T-32)*5/9;
			System.out.println("F to C :"+sum);
		}
	}
	//to convert decimal to binary.
	public static void tobin(int n)
	{
		int[] binnum=new int[1000];
		int i=0;
		while(n>0)
		{
			binnum[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
			System.out.print(binnum[j]);
			
	}
//program to find vending machine.
	public static void vend(int cash)
{
	int arr[]=new int[] {1000,500,100,50,10,5,2,1};
	for (int i=0;i<arr.length;i++)
	{
	if (cash>=arr[i]);
	{
	int x=cash/arr[i];
	cash=cash%arr[i];
	System.out.println(arr[i]+" notes:"+x);
}
	}
	}
	//swapping to character.
	public static void swap(char[] ch, int i, int j)
	{
	char temp = ch[i];
	ch[i] = ch[j];
	ch[j] = temp;
	}
	//to find permutations.
	public static void permutations(char[] c, int currentIndex)
	{
	if (currentIndex == c.length - 1) {
	System.out.println(String.valueOf(c));
	}
	for (int i = currentIndex; i < c.length; i++)
	{
	swap(c, currentIndex, i);
	permutations(c, currentIndex + 1);
	swap(c, currentIndex, i);
	}}
	//binary search of a string.
	public static int binarySearch(String[] arr, String x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
            int res = x.compareTo(arr[m]);  
            if (res == 0) 
                return m;  
            if (res > 0) 
                l = m + 1; 
            else
                r = m - 1; 
        } 
        return -1; 
    }
	//sorting in insertion.
	public static void insertion(String arr[],int n) {
		for (int i=1;i<n;i++)
		{
			String key=arr[i];
			int j=i-1;
			while (j>=0 && arr[j].compareTo(key)>0)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
	arr[j+1]=key;	
		}}
	//to print array.
		public static void printarray(String arr[],int n) {
	for (int i=0;i<n;i++)
	{
		System.out.println(arr[i]+" ");
	}
		}
		//to check anagrams.
		public static boolean areAnagram(char[] str1, char[] str2) 
		{ 
		    int n1 = str1.length; 
		    int n2 = str2.length; 
		    if (n1 != n2) 
		        return false; 
		    Arrays.sort(str1); 
		    Arrays.sort(str2); 
		    for (int i = 0; i < n1; i++) 
		        if (str1[i] != str2[i]) 
		            return false; 
		    return true; 
		} 
		//to check prime.
		public static  boolean isPrime(int n)
	    { 
	        if (n <= 1) 
	            return false; 
	   	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false;  
	        return true;
	    } 
		//to check pallindrome.
public static boolean ispallindrome(int n)
{
	int x=n,reversed=0;
	while(x!= 0) {
        int digit = x % 10;
        reversed = reversed * 10 + digit;
        x /= 10;
	}
	if( n==reversed)
		return true;
	return false;	
	}
//sorting using bubble sort.
public static int bubblesort(int arr[]) {
	 int n = arr.length,temp = 0; 
       for (int i = 0; i < n-1; i++) 
           for (int j = 0; j < n-i-1; j++) 
               if (arr[j] > arr[j+1]) 
               { 
                    temp = arr[j]; 
                   arr[j] = arr[j+1]; 
                   arr[j+1] = temp; 
              }
		return temp; 
}
//to find a number guessed using binary search method. 
public static void fyn(int arr[]) {
	  int l = 0, r = arr.length; 
      while (l <= r) { 
          int m = l + (r - l) / 2; 
System.out.println("if "+arr[m]+" is your number enter 1 else o");

int x=readInt();
if (x==0)
{
	System.out.println("if"+arr[m]+"is greather than your number enter 1 else o");
	int y=readInt();
	if (y==1)
	       l = m + 1; 
  else
      r = m - 1;
}
else 
{
	System.out.println("number found "+arr[m]);
}
      }
      }
//sorting using merge sort method.
public static void merge(int arr[], int l, int m, int r) 
{ 
    int n1 = m - l + 1; 
    int n2 = r - m;  
    int L[] = new int [n1]; 
    int R[] = new int [n2]; 
    for (int i=0; i<n1; ++i) 
        L[i] = arr[l + i]; 
    for (int j=0; j<n2; ++j) 
        R[j] = arr[m + 1+ j]; 
	        int i = 0, j = 0; 
	        int k = l; 
    while (i < n1 && j < n2) 
    { 
        if (L[i] <= R[j]) 
        { 
            arr[k] = L[i]; 
            i++; 
        } 
        else
        { 
            arr[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 
    while (i < n1) 
    { 
        arr[k] = L[i]; 
        i++; 
        k++; 
    } 
    while (j < n2) 
    { 
        arr[k] = R[j]; 
        j++; 
        k++; 
    } 
} 
	    void sort(int arr[], int l, int r) 
{ 
    if (l < r) 
    { 
        int m = (l+r)/2; 
        sort(arr, l, m); 
        sort(arr , m+1, r); 
        merge(arr, l, m, r); 
    } 
} 
	    //to print an array.
public static void printArray(int arr[]) 
{ 
    int n = arr.length; 
    for (int i=0; i<n; ++i) 
        System.out.print(arr[i] + " "); 
    System.out.println(); 
} 
//to flip coin and calculate %head and %tails.
public static void flip(int n)
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
	System.out.println("the % head count:"+r+"  the % tail count :"+s);
}
//to check for leap year.
public static void leap(int x)
{
	int a=x,count=0;
	while(a!=0)
	{
		a=a/10;
		count++;
	}
	if(count==4)
	{
		if((x%4==0)&&(x%100!=0)&&(x%400==0))
			System.out.println("given year is a leap year");
		System.out.println("given year is not a leap year");
	}
	else
	{
		System.out.println("entered year is not 4 digit nums");
	}
}
//to print power of 2.
public static void poweroftwo(int n)
{
	int sum=1;
	for(int i=0;i<n;i++)
	{
		 sum =sum*2;
	}
System.out.println(sum);
}
//to calculate win% of gambler. 
public static void gambler(int stake,int goal,int n)
{
	int win=0,loss=0,i=0;
	while((i!=n)&&(stake!=goal))
	{
	if(Math.random()<0.5)
	{
		win++;
		stake++;
	}
	else
	{
		loss++;
		stake--;
	}
	i++;
	}
	int wp=(win*100)/n;
	int lp=(loss*100)/n;
	System.out.println("number of wins ="+win);
	System.out.println("percentage wins ="+wp+"%");
	System.out.println("percentage loss ="+lp+"%");
}
//to create a distinct coupon number.
public static void coupon(char[] chars)
{
	int max=100000000;
	int random=(int)(Math.random()*max);
	StringBuffer sb=new StringBuffer();
	while(random>0)
	{
		sb.append(chars[random%chars.length]);
		random/=chars.length;
	}
	String c=sb.toString();
	System.out.println("coupon number= "+c);
}
//for sum of harmonic series.
public static void harmonic(int n)
{
	double sum=0;
	for(double i=1;i<=n;i++)
	{
		sum=sum+1/i;
	}
	System.out.println(sum);
}
//for prime factors.
public static void primefactors(int n)
{
	while(n%2==0)
	{
		System.out.println(2+" ");
		n/=2;
	}
	for(int i=3;i<=Math.sqrt(n);i+=2)
	{
		while(n%i==0)
		{
			System.out.println(i+" ");
			n/=i;
		}
	}
	if(n>2)
	{
		System.out.println(n);
	}
}
//to print tic tac toe.
public static void print(char[][] ar) {
System.out.println(ar[0][0]+" "+ar[0][1]+" "+ar[0][2]);
System.out.println(ar[1][0]+" "+ar[1][1]+" "+ar[1][2]);
System.out.println(ar[2][0]+" "+ar[2][1]+" "+ar[2][2]);
System.out.println("------");
}
//to take user input for tictactoe.
public static char[][] userinput(int row , int column, char[][] a){
a[row][column]='x';
return a;
}
//for computer input for tictactoe.
public static char[][] compinput(int row , int column, char[][] a){
a[row][column]='o';
return a;
}
//tictactoe logic.
public static void tictactoe(char[][] a)
{
	Util ab=new Util();
	int turn=0, row=0,col=0;
	boolean win=false;
	while((turn!=9)||(win))
	{
	if((turn!=9)&&(!win))
	{
	System.out.println("enter your move");
	System.out.println("enter the row 0-2");
	row=readInt();
	System.out.println("enter the column 0-2");
	col=readInt();

	while((a[row][col]=='x')||(a[row][col]=='o')) {
	System.out.println("invalid move");
	System.out.println("enter the row 0-2");
	row=readInt();
	System.out.println("enter the column 0-2");
	col=readInt();
	}
	a=ab.userinput(row,col, a);

	ab.print(a);
	}
	if((a[0][0]=='x' && a[0][1]=='x' && a[0][2]=='x') || (a[1][0]=='x' && a[1][1]=='x' && a[1][2]=='x') || (a[2][0]=='x' && a[2][1]=='x' && a[2][2]=='x') || (a[0][0]=='x' && a[1][0]=='x' && a[2][0]=='x') || (a[0][1]=='x' && a[1][1]=='x' && a[2][1]=='x') || (a[0][2]=='x' && a[1][2]=='x' && a[2][2]=='x') || (a[0][0]=='x' && a[1][1]=='x' && a[2][2]=='x') || (a[0][2]=='x' && a[1][1]=='x' && a[2][0]=='x'))
	{ 
	System.out.println("you win");
	win=true;
	break;
	}
	turn++;
	if((turn!=9)&&(!win))
	{
	row=(int)(Math.random()*3);
	col=(int)(Math.random()*3);
	while((a[row][col]=='x')||(a[row][col]=='o')) {
	row=(int)(Math.random()*3);
	col=(int)(Math.random()*3);
	}
	a=ab.compinput(row,col, a);
	ab.print(a);
	if((a[0][0]=='o' && a[0][1]=='o' && a[0][2]=='o') || (a[1][0]=='o' && a[1][1]=='o' && a[1][2]=='o') || (a[2][0]=='o' && a[2][1]=='o' && a[2][2]=='o') || (a[0][0]=='o' && a[1][0]=='o' && a[2][0]=='o') || (a[0][1]=='o' && a[1][1]=='o' && a[2][1]=='o') || (a[0][2]=='o' && a[1][2]=='o' && a[2][2]=='o') || (a[0][0]=='o' && a[1][1]=='o' && a[2][2]=='o') || (a[0][2]=='o' && a[1][1]=='o' && a[2][0]=='o'))
	{
	System.out.println("computer wins");
	win=true;
	break;
	}
	turn++;
	}
	}
	if((!win)||(turn==9))
	{
	System.out.println("draw");
	}
	}
}


































