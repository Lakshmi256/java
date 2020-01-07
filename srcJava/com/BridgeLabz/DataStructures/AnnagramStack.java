package com.BridgeLabz.DataStructures;
//purpose: To find the prime anagrams and store it in a Stack using linked list.


import com.BridgeLabz.utility.Util;
public class AnnagramStack<E> {
static Node head;
static Node top;
//to push the data into stack.
	public static void push(int data)
	{
		Node<Integer> node=new Node<Integer>();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
			top=node;
		}
		else
		{
			Node<Integer> n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
			top=node;
		}
	}
	// to print the stack.
public static void show()
{
	Node<Integer> n=head;
	while(n.next!=null)
	{
		System.out.print(n.data+" ");
		n=n.next;
		
	}
	System.out.print(n.data);
}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int[] arr=new int[1000];
		int[] brr=new int[1000];
		int l=0,c=0;
				for (int n=0;n<1000;n++)
					{
				boolean a=Util.isPrime(n);
			if (a==true) 
			{
			arr[l]=n;
			l++;
			}
			}
				System.out.println("the prime numbers are:");
				for(int i=0;i<l;i++)
				{
					System.out.print(" "+arr[i]);
				}
				System.out.println(" ");
				System.out.println("the anagram numbers are");
				for (int k=0;k<l;k++)
				{
					int sum=arr[k];
					char[] x=("" + arr[k]).toCharArray();
						for(int m=k+1;m<l;m++)
						{
							
							char[] y=("" + arr[m]).toCharArray();
						if(	(Util.areAnagram(x,y))==true) 
					
						{
							brr[c]=arr[k];
							brr[c+1]=arr[m];
							c=c+2;
						}
					}			
				}
				for(int i=c-1;i>=0;i--)
				{
					
					push(brr[i]);
				}		
				
				System.out.println();
				show();
				}	

}

	