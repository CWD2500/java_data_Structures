package com.Searching;

public class interpoaitionSearching {
	
	public static void main(String[] args) {
		int size = 99899;
		int[] numbers =   new int[size];
		  for(int i  =1 ; i <size ;i+=1) {
			  //numbers[i] =  i; 
		  }
		  
		
		  
//		interpoaition Searching  on (1)
		  int searchingNumber = 999;
		  int  low   = 0 ; // \
		  int hight = numbers.length -1 ; //  اعلى قيمة 
		  int midd = 0;
		  int countNumber = 0;
		  Boolean  isFount = false;
		  while(!isFount) 
		  {
			  if (low > hight) {
				System.out.println(" Numbner Not Fount  Stop  ...! ");
				  break;
			}
			  midd = low + ((hight + low) / (numbers[hight] -numbers[hight] ))*(searchingNumber - numbers[low]);
			  countNumber++; 
			  if(numbers[midd] == searchingNumber) 
			  {
				  System.out.println("This is Result Searching  " +numbers[midd] );
				  System.out.println("This is Count Step Search :"  + countNumber);
				  break;
			  }
			  
			  if (numbers[midd]  <searchingNumber ) {
				  low = midd + 1;  // 
			}
			  
			  if (numbers[midd]  >searchingNumber ) {
				  hight = midd - 1;//
			}
			  
		  }


	}

}
