package com.HashTable;

public class Entliy<T> {
 int key;
 T value;
 Entliy next;
	
	public Entliy(int key , T value) {
		this.key= key;
		this.value= value;
		next = null;
	}
	
	public Entliy() {
		next = null;
	}

	public int GetKey() {
		return key;
	}
	
	public T GetValue() 
	{
		return value;
	}
}
