package com.bitProblems;

public class NoOfZerosBetween1s {

	static Node head=null;
	public static void main(String[] args) {
		
		Integer n=9;
		String s=Integer.toBinaryString(n);
		insertIntoLinkedList(s);
		compute(head);
		
	}

	private static void compute(Node start) {

		Node curr=start.next,after=curr.next;

		int count=0,max=0;
		while(null!=start && null!=curr && null!=after)
		{
			if(start.c.equals('1') && curr.c.equals('0'))
			{
				count++;
				if(after.c.equals('0'))after=after.next;
				else
				{
					max=Math.max(count, max);
					start=start.next;curr=curr.next;after=after.next;
					count=0;
				}
			}
			else {
				start=start.next;curr=curr.next;after=after.next;
			}
			
		}
	}

	private static Node insertIntoLinkedList(String s) {
		int l=s.length();
		int i=0;
		head=new Node(s.charAt(i));i++;
		Node curr;
		while(i<l)
		{
			curr=new Node(s.charAt(i));
			curr=curr.next;
		}
		return head;
	}
	
}
