package com.BridgeLabz.Controller;

import java.io.File;
import java.io.IOException;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

import com.BridgeLabz.Implementation.StockAccountImplementation;
import com.BridgeLabz.Utillity.Util;

public class StockAccountController {

		public static void main(String[] args) throws IOException, JSONException, ParseException {
			// TODO Auto-generated method stub

			String a=null;
		    StockAccountImplementation obj1=new StockAccountImplementation();
		    StockAccountImplementation obj2=new StockAccountImplementation();
		    StockAccountImplementation obj3=new StockAccountImplementation();
			    do
		        {
		        int cho;
		        System.out.println("********Menu**********");
		        System.out.println("1. Customer Info File");
		        System.out.println("2. Company Shares File");
		        System.out.println("3. Buy or Sell Shares");
		        System.out.println("4. Exit");
		        System.out.print("Enter your choice : ");
		        cho=Util.readInt();
				switch(cho)
			  	{
				case 1:	System.out.println("Enter the Customer File name you want to create");
					    String s1=Util.readString();
					    File f1=new File(s1);
					    System.out.println("File "+s1+" has been created");
					    obj1.addCustomer(f1);
				        break;
				             
				case 2:
					    System.out.println("Enter the Company Shares File name you want to create");
				        String s2=Util.readString();
				        File f2=new File(s2);
				        obj2.addShares(f2);
				        System.out.println("The Shares have been added");
				       
			            break;
					 
				case 3: System.out.print("Enter the customer name : ");
				        String name=Util.readString();
					    System.out.println("1. BUY");   
					    System.out.println("2. SELL");
					    System.out.print("Enter your Choice :");
					    int n=Util.readInt();
					    switch(n)
					    {
					    case 1: System.out.print("Enter the Share Symbol you want to BUY : ");
					            String str1=Util.readString();
					            System.out.print("Enter the number of shares you wish to BUY : ");
					            int amt1=Util.readInt();
					            boolean b=obj3.buy(amt1,str1,name);
					            if(b==true)
					            System.out.println("The shares have been added in your account");
					            else
					            System.out.println("You don't have Sufficient Balance in your Account!!!");
					            break;
					    case 2: System.out.println("Enter the share Symbol you want to SELL");
					            String str2=Util.readString();
			                    System.out.print("Enter the number of shares you wish to SELL : ");
			                    int amt2=Util.readInt();
			                    obj3.sell(amt2,str2,name);
			                    break;
					    }
				        break;
			    case 4: System.exit(0);
				        break;

			   default: System.out.println("Wrong Choice!!");
			            
				        System.out.println("Do you wish to continue(y/n)");
				        a=Util.readString();
				       
			  	}
		       }
				while(a!="n");
		
		
			    }
	    
	}
