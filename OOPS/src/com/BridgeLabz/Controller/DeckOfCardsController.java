package com.BridgeLabz.Controller;

import com.BridgeLabz.Implementation.cardsImplementation;

public class DeckOfCardsController {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

cardsImplementation obj=new cardsImplementation();
String[] deck=obj.addCards();
for(String s:deck)
	System.out.print(s+" ");
System.out.println();
String[][] str=obj.distribute(deck);
obj.print(str);
	}
}
