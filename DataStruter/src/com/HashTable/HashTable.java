package com.HashTable;



public class HashTable<T>{
	Entliy[] ArrayHash;
	int Size;
	public HashTable(int Size ) 
	{
		this.Size = Size;
		ArrayHash = new Entliy[this.Size];
		for(int i = 0 ; i<ArrayHash.length ; i++ ) 
		{
			ArrayHash[i] = new Entliy<T>();		
		}
	}
	
	int GetHash(int key) 
	{
		return key%Size;
	}
	
	public  void put(int key , T value) 
	{
		int index = GetHash(key);
		Entliy ArrayValue = ArrayHash[index];
		Entliy newItem = new Entliy<T>(key , value);
		newItem.next = ArrayValue.next;
		ArrayValue.next = newItem;
		
	}
	
	public  T Get(int key) 
	{
		T value  = null;
		int index = GetHash(key);
		Entliy ArrayValue = ArrayHash[index];
		while(ArrayValue.next !=null) 
		{
			if(ArrayValue.key ==key) 
			{
				value = (T) ArrayValue.GetValue();
				break;
			}
			ArrayValue = ArrayValue.next;
			
		}
		return value;
	}
	
}
