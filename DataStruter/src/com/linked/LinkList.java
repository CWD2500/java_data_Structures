package com.linked;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList  li = new LinkedList(new Node(12, null));
		li.add(new Node(34, null));
		li.Display();
		li.delete();
		li.add(new Node(123, null));
//		 
	}

}
