package com.linked;

public class LinkedList {
	Node  head;
	
	
	public LinkedList(Node head) {
		
		this.head =  head;
		
	}
	
	public void add(Node  newNode) 
	{
		newNode.next = head;
		head = newNode;
		
	}

	public void delete() // o f(n)
	{
		head = head.next;
		
	}
	
	public void Display() {
		Node n = head;
		while (n  !=null) {
			System.err.println(n.value);
			n  = n.next;
			
		}
	}
	
}
