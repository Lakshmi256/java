package com.BridgeLabz.StockMangement;

import java.io.File;
import java.io.IOException;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

import com.BridgeLabz.Utillity.Util;

public class StockAccountMangement extends Controller {
	
	public static void main(String[] args) throws IOException, JSONException, ParseException {
		String a=null;
		Controller obj=new Controller();
		do
		{
			int ch;
			System.out.println();
			System.out.println("1.open a stock protofolio");
			System.out.println("2.add items to stock protofolio");
			System.out.println("3.exit");
			System.out.println("your choice ");
			ch=Util.readInt();
			switch(ch)
			{
			case 1:System.out.println("please give stock protofolio name");
			String s1=Util.readString();
			obj.readfile(s1);
			
			System.out.println("new protofolio "+s1+" opened");
			break;
			case 2: System.out.println("eneter the stock protofolio in which you want to enter");
			String s2=Util.readString();
			File f2=new File(s2);
			obj.addStock(f2);
			System.out.println("the items have been added ");
			obj.calculate(f2);
			break;
			case 3:System.exit(0);
			break;
				default:System.out.println("wrong choice !");
				System.out.println("do you want to continue (y/n)");
				a=Util.readString();

			}
		}
		while(a!="n");
	}
}
