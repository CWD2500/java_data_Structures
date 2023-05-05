package com.HashTable;

public class HashTableDemo {

	public static void main(String[] args) 
	{
		HashTable<String> hashTable = new HashTable<String>(12);
		hashTable.put(12, "Christiane");
		hashTable.put(56, "Soliman");
		hashTable.put(16, "Arbic");
//		System.out.println(hashTable.Size);
		System.out.println(hashTable.Get(56));
	}
}
