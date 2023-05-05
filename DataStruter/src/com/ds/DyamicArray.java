package com.ds;


import java.util.Arrays;

public class DyamicArray <T> {

	Object[] data;
	 int size;
	 
	public DyamicArray() {
		size = 0;
		data = new Object[1];
	}
	
	public T get (int index) 
	{
		return (T)data[index];
	}
	
	public int getSize() {
		return data.length;
	}
	
	public  void put(int elements) {
		ensureCapaCity(size+1);
		data[size++] = elements;
	}	
	
  //  بحالة امو الحجم المصوفة بدو يزادا 
	public void ensureCapaCity(int minCapaCity) {
		int oldCapaCity = data.length;
		if(minCapaCity > oldCapaCity) {
			int newCapaCity  = oldCapaCity * 2; //   مصفوفة القديمة ضرب 2
			if (newCapaCity < minCapaCity)
				newCapaCity = minCapaCity;
			data  = Arrays.copyOf(data, newCapaCity);
		}
	}
	
}
