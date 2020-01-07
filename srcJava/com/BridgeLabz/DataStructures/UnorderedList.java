package com.BridgeLabz.DataStructures;
//purpose: the Text from a file, split it into words and arrange it 
//as Linked List. Take a user input to search a Word in the List. 
//If the Word is not found then add it to the list, and if it found
//then remove the word from the List. In the end save the list into a file





import java.io.*;
import java.util.Scanner;
public class UnorderedList <E>{
	public Node<E> head;
	public Node<E> last;
	public Node<E> prev;
	public Node<E> returnHead()
	{
		return head;
	} 
	public void add(E data)
	{
		Node<E> node=new Node<E>();
	    node.data=data;
	    if(isEmpty())
		{
		node.next=null;
		head=node;
		}
		else
		{
		Node<E> n=head;
		while(n.next!=null)
		{
		n=n.next;
		}
		n.next=node;
	    last=node;
		}	
	}
	public  boolean search(E data)
	{
		Node<E> n=head;
		int i=0;
		if(isEmpty())
		{
		System.out.println("List is empty!!!");
		return false;
		}
		else
		{
			boolean flag=false;
			while(n.next!=null)
			{
				if(n.data==data)
				{
				System.out.println("Found at "+i+" index");
				flag=true;
				}
				else
				i++;
				if(flag==true)
					break;
				n=n.next;
			}
			return flag;
			
		}
	
	}
	public  boolean isEmpty()
	{
	  if(head==null)
	  {
	  return true;   
	  }
	  else
      return false;
	}
	public  int size()
	{
		Node<E> n=head;
		int i=0;
		if(head==null)
		{
			return 0;
		}
		else
		{
		while(n.next!=null)
		{
			i++;
			n=n.next;
		}
		return i+1;
		}
		
	}
	public void remove(String data)
	{
		boolean flag=false;
		Node<E> n=head;
		if(isEmpty())
		{
		System.out.println("List is empty!!!");
		flag=true;
		}
		else
	    if(head.next==null && head.data==data)
		{
	    	System.out.println(data+" is deleted");	  
	    	head=null;
	    	flag=true;
		}
	    else
	    {
	    	
		 for(int i=0;i<size();i++)
		 {
			 if(n.data.equals(data))
			 {
				 if(n==head)
				 {
					 Node<E> x=n.next;
					 System.out.println(n.data+" is deleted");					
     				 n=null;
					 flag=true;
					 head=x;
				 }
				 else
					 if(n==last)
					 {
						 prev.next=null;
						 last=prev;
						 System.out.println(n.data+" is deleted");
						 n=null;
						 flag=true;
					 }
					 else
					 {
				 System.out.println(data+" is deleted");
				 prev.next=n.next;
				 n=null;
				 flag=true;
			 }
			 }
			 if(flag==true)
				 break;
			 if(n!=null)
			 {
			 prev=n;
			 n=n.next;
			 }
			 if(flag==true)
		     break;
		   }
		 }
		}
	public int index(String data)
	{
		Node<E> n=head;
		int i=0;
		int j=0;
		if(isEmpty())
		{
		System.out.println("List is empty!!!");
		return -1;
		}
		else
		{
			while(n.next!=null)
			{
             if(n.data.equals(data))
	            break;
            	 i++;
				n=n.next;
			}
		if(i==size()-1)
		    j=-2;
			else
			j=i;
		return j;
	}
	}

	public void insert(int pos,E data)
	{
		Node<E> node =new Node<E>();
		node.data=data;
		if(isEmpty())
		{
		System.out.println("List is Empty");
		}
		else
		{
			Node<E> n=head;
			int i=0;
			while(i<pos)
			{
				prev=n;
				n=n.next;
				++i;
			}
			prev.next=node;
			node.next=n;
		}
	}
	public void show()
	{
		
		Node<E> n=head;
		while(n.next!=null)
		{
			System.out.print(n.data+" ");
		n=n.next;
		}
		System.out.print(n.data);
		
	}
	public static void writeFile(UnorderedList list) throws IOException
	{
		Node<String> head=list.head;
		Node<String> n=head;
		File f=new File("/home/bridhelabz/Desktop/lp/lp.txt");
	    FileWriter fr=new FileWriter(f);
	    BufferedWriter br=new BufferedWriter(fr);
		while(n.next!=null)
		{
			
			br.write(n.data+" ");
			n=n.next;
		}
		br.write(n.data);
	    br.close();
	}
	public static void main(String[] args) throws Exception {
		UnorderedList<String> list=new UnorderedList<String>();
		  File file = new File("/home/bridhelabz/Desktop/lp/lp.txt"); 	  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  	String st=" "; 
			String[] St=null;
		  while ((st=br.readLine()) != null)
		  {
			 St=st.split(" ");
		  }
		    int n=St.length; 
		    for (int i=0;i<n;i++)
		    {
		    	list.add(St[i]);
		    }
		    Scanner b=new Scanner(System.in);
		    String a=b.nextLine();
		    int x=list.index(a);
	        if (x==-1) 
	        {
	        	list.add(a);
	        	list.show();
	            System.out.println("Yes"); 
	        }
	            else if(x==-2)
	        {

		        	list.add(a);
		        	
		        	
		            System.out.println("the element is not found ");
		            System.out.println("the element is added");
		            System.out.println();
		            list.show();
	}
	            else
	            {
	            	list.remove(a);
	            	System.out.println("the element is found");
	            	System.out.println("the element is deleted ");
	            	System.out.println();
	            	list.show();
	            	
	            }
	        writeFile(list);
			}
	}
