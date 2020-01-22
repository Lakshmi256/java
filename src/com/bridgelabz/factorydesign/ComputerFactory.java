package com.bridgelabz.factorydesign;

public class ComputerFactory {

	public static Computer getComputer(String type, String fname, String lname, String address, String city,
			String state, String zip, String phoneno) {
		if ("SubClass1".equalsIgnoreCase(type))
			return new SubClass1(fname, lname, address, city, state, zip, phoneno);
		else if ("SubClass".equalsIgnoreCase(type))
			return new SubClass(fname, lname, address, city, state, zip, phoneno);

		return null;
	}
}
