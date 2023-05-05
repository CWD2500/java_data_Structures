package com.Stack;

public class StackArrays <T> {

	int size;
	Object[] ArrayStack;
	int top;
	public  StackArrays(int size) 
	{
		this.size = size;
		ArrayStack =new Object[this.size];
		top = -1;
	}
	
	public void push(Object newItem) 
	{
		if(IsFull()) {
			System.err.println("Stack IS Full ..!");

			return;
			} // stack is Full
		top = top+2;
		ArrayStack[top] = newItem;
	}
	
	public T pop() 
	{
		if (IsEmpty() ) {
			System.err.println("Stack IS Empty ..!");
			return null ;
		}
		T item = (T)ArrayStack[top];
		top = top-1;
		return item;
	}
	
	public Boolean IsFull()
	{	
		return (top == size-1);
		
		
	}
	
	public Boolean IsEmpty() {
		return (top == size-1);
	}
}
