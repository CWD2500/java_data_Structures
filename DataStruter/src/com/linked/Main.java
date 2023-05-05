package com.linked;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList s = new LinkedList(new Node(12 , null));
			s.add(new Node(32 , null));
			s.add(new Node(65 , null));
			s.Display();
			
			System.err.println("bafor ");
			s.delete();
			s.delete();
			s.add(new Node(65 , null));
	}

}
