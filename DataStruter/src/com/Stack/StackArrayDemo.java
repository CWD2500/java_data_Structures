package com.Stack;

public class StackArrayDemo {

	public static void main(String[] args) {
		StackArrays<Integer> num = new StackArrays<Integer>(10);
		num.push(23);
		num.push(44);

		System.err.println("Top :"    + num.top) ;
		System.out.println(num.pop());

	}

}
