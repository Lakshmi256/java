package com.bridgelabz.controller;

import java.io.File;

import com.bridgelabz.implementation.JsonImplementation;
import com.bridgelabz.utillity.Util;

public class JsonController {

	public static void main(String[] args) throws Exception {

		String a = null;
		JsonImplementation obj = new JsonImplementation();
		do {
			int ch;
			System.out.println("********Menu**********");
			System.out.println("1. Open a new Inventory");
			System.out.println("2. Add items to the inventory");
			System.out.println("3. Exit");
			System.out.println("4, to add the inventory");
			System.out.print("Enter your choice : ");
			ch = Util.readInt();
			switch (ch) {
			case 1:
				System.out.print("Please give the Inventory Name: ");
				String s1 = Util.bufferScanner();
				obj.createFile(s1);

				System.out.println("New Inventory " + s1 + " is opened");
				break;

			case 2:
				System.out.println("Enter the Inventory name in which you want to add items");
				String s2 = Util.bufferScanner();
				File f2 = new File(s2);
				obj.addItems(f2);
				System.out.println("The items have been added");
				break;
			case 4:
				System.out.print("Enter the Inventory Name to calculate the Inventory Price :");
				String s = Util.readString();
				obj.grandTotal(s);
			default:
				System.out.println("Wrong Choice!!");
				System.out.println("Do you wish to continue(y/n)");
				a = Util.bufferScanner();
			}
		} while (a != "n");
	}
}
