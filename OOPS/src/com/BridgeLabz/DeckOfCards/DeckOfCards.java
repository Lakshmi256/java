package com.BridgeLabz.DeckOfCards;

public class DeckOfCards {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Controller obj=new Controller();
String[] deck=obj.addCards();
for(String s:deck)
	System.out.print(s+" ");
System.out.println();
String[][] str=obj.distribute(deck);
obj.print(str);
	}
}
