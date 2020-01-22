package com.bridgelabz.controller;

import com.bridgelabz.implementation.CardsImplementation;

public class DeckOfCardsController {
	public static void main(String[] args) {

		CardsImplementation obj = new CardsImplementation();
		String[] deck = obj.addCards();
		for (String s : deck)
			System.out.print(s + " ");
		System.out.println();
		String[][] str = obj.distribute(deck);
		obj.print(str);
	}
}
