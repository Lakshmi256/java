package com.BridgeLabz.DataStructures;
//purpose: the numbers from a file, split it into words,sort them and  
//arrange it as Linked List. Take a user input to search a integer in  
//the List. If the Word is not found then add it in the oppropriate 
//position in the  list, and if it is found then remove the word from 
//the List. In the end save the list into a file.



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import com.BridgeLabz.utility.Util;
public class OrderedList {
	    Node head;  
	  Node sorted;
	  Node new_data;
	    class Node 
	    { 
	        String data; 
	        Node next;
			public int new_data; 
	        Node(String new_data) 
	        { 
	            data = new_data; 
	            next = null; 
	        } 
	    }
	    public void push(String new_data) 
	    { 
	        Node new_node = new Node(new_data); 
	        new_node.next = head; 
	        head = new_node; 
	    }
	    public void printList(Node head) 
	    { 
	        Node tnode = head; 
	        while (tnode != null) 
	        { 
	            System.out.print(tnode.data+" "); 
	            tnode = tnode.next; 
	        } 
	    } 
	    public static  boolean search(Node head,String x)
		{ 
			Node current=head;     
	    while (current!=null) 
	    { 
	        if (current.data.equals(x)) 
	            return true;
	        current=current.next; 
	    } 
	    return false;
		}
	 
	  public static void sort(Node head)
	  {
	  }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OrderedList list=new OrderedList();
		File file = new File("/home/bridhelabz/Desktop/lp/lp1.txt"); 	  
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		  	String st=" "; 
			String[] St=null;
		  while ((st=br.readLine())!= null)
		  {
			 St=st.split(" ");
		  }
		  int n=St.length;
	
	for(int i=n-1;i>=0;i--)
	{
		list.push(St[i]);
	}
	list.printList(list.head);
	String x=Util.readString();
	if(search(list.head,x)==true)
	{
	}
	else
	{
		list.push(x);
	}
    System.out.println("\nLinkedList After sorting"); 
    list.printList(list.head); 
}

	}
