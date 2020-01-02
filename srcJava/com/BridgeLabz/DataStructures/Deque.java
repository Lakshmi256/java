package com.BridgeLabz.DataStructures;

public class Deque<E> {
	public Node<E> head;
	public Node<E> tail;
	//adds the data to the list.
    public  void addRear(E data)
    {
    	Node<E> node=new Node<E>();
		node.data=data;
		node.next=null;
		if(isEmpty())
		{
			head=node;
			tail=node;
			node.prev=null;
		}
		else
		{
			tail.next=node;
		node.prev=tail;
	    tail=node;
		}
    }
    //to check if the list is empty are not.
    public boolean isEmpty()
    {
    	if(head==null)
			return true;
		else
			return false;
    }
    //to check the pallindrome of a string.
    public boolean checkPalindrome()
    {
    Node<E> x=tail;
    Node<E> n=head;
    String[] arr1=new String[size()];
    String[] arr2=new String[size()];
    boolean flag=false;
    int i=0;
    while(n!=null)
    {
    arr1[i]=(String)n.data;
    n=n.next;
    i++;
    }
    reverse();
    int j=0;
    Node<E> y=head;
    while(y!=null)
    {
    	arr2[j]=(String)y.data;
    	y=y.next;
    	j++;
    } 
    for(int k=0;k<arr1.length;k++)
    {
    	if(arr1[k]==arr2[k])
    		flag=true;
    }
    return flag;
    }
    //to display 
    public void displayForward()
   	{
   		if(isEmpty())
   		{
   			System.out.println("List is Empty");
   			return;
   		}
   		else
   		{
   		Node<E> n=head;
   		while(n.next!=null)
   		{
   			System.out.print(n.data+" ");
   			n=n.next;
   		}
   		System.out.print(n.data+" ");
   	    }
       }
    //reverses a string.
       public void reverse()
       {
       Node<E> previous=null;
       Node<E> current=head;
       Node<E> ahead=null;
       while(current!=null)
       {
       	ahead=current.next;
       	current.next=previous;
       	current.prev=ahead;
       	previous=current;
       	current=ahead;
       	}
       head=previous;
       }
       //to check size of a string.
       public int size()
       {
       	Node<E> n=head;
       	if(isEmpty())
       	{
       		return 0;
       	}
       	else
       	{
       	int i=1;
       	while(n.next!=null)
       	{
       		n=n.next;
       		++i;
       	}
       	return i;
       	}
       }
}
