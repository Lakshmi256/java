package com.bridgelabz.factorydesign;

public class TestFactory {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer sc = ComputerFactory.getComputer("SubClass", "lakshmi", "prasad", "ecity", "bamgalore", "karnataka",
				"560100", "96325");
		Computer sc1 = ComputerFactory.getComputer("SubClass1", "lp", "pra", "ecity", "bangalore", "karnataka",
				"560100", "96325");
		System.out.println("Address Book::" + sc);
		System.out.println("Address Book1::" + sc1);
	}

}