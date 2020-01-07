package com.BridgeLabz.DataStructures;
//purpose: a Program which creates Banking Cash Counter where people come in
//to deposit Cash and withdraw Cash. Having an input panel to add people to Queue
//to either deposit or withdraw money and dequeue the people. Maintain the Cash Balance.



import java.io.IOException;
import com.BridgeLabz.utility.Util;
public class Banking {
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
	    Queue<String> ob=new Queue<String>();
	    double amt1=10000.0;
	    System.out.println("Enter the number of users : ");
	    int n=Util.readInt();   
	    double amt2=0.0;
	    String s1=null;
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println();
	       System.out.print("You want to withdraw or deposit (W/D):");
	       String s2=Util.bufferScanner();
	       switch(s2)
	       {
	       case "W": System.out.print("Enter your name: "); 
	                 s1=Util.bufferScanner();
	                 ob.enqueue(s1);
	                 System.out.print("Enter the amount : ");
	                 amt2=Util.readdouble();
	                 amt1=amt1-amt2;
	                 System.out.print("The total cash balance is : "+amt1);
	                 break;
	       case "D": System.out.print("Enter your name: "); 
	                 s1=Util.bufferScanner();
	                 ob.enqueue(s1);
	                 System.out.print("Enter the amount : ");
	                 amt2=Util.readdouble();
	                 amt1=amt1+amt2;
	                 System.out.print("The total cash balance is : "+amt1);
	                 break;
	       default : System.out.println("Wrong choice");    	
	       }
	       }
	       System.out.println(); 
	        ob.show();
	       System.out.println();
	    for(int i=0;i<n;i++)
	    {
	    	String str=ob.dequeue();
	    	System.out.println(str+" is deleted");
	    }
		}
	}