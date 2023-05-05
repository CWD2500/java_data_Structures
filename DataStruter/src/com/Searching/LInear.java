package com.Searching;

import java.util.Iterator;

public class LInear {
	public static  void main(String[] args) 
	{
		 int size = 100000;
		  int[] numbers = new int[size];
		  for(int i  =1 ; i <numbers.length;i+=1) 
			  numbers[i] =  i; 
			 // System.out.println(numbers[i]);
		
		  
		  
//		   	Linear Search O(n)
			  int searchLinear = 345;
			  int countNumber = 0;
			  for(int i  = 1  ; i < size;i+=1) 
			  {
				  countNumber++;
				  if(numbers[i] ==searchLinear) 
				  {
					  System.out.println("This is Result Search :"  + numbers[i]);
					  System.out.println("This is Count Step Search :"  + countNumber);
					  break;
				  }
			  }
	}
}
