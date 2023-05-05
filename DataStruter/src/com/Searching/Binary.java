package com.Searching;

public class Binary {

	public static void main(String[] args) {
		int size = 99899;
		int[] numbers =   new int[size];
		  for(int i  =1 ; i <size ;i+=1) {
			  //numbers[i] =  i; 
		  }
		  
		
		  
//		Binary Searching  on (n)
		  int searchingNumber = 3434;
		  int  low   = 0 ; //  اصغر قيمة 
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
			  midd = low + ((hight + low) / 2); // Center Array Count 
			  countNumber++;
			  if(numbers[midd] == searchingNumber) 
			  {
				  System.out.println("This is Result Searching  " +numbers[midd] );
				  System.out.println("This is Count Step Search :"  + countNumber);
				  break;
			  }
			  
			  if (numbers[midd]  <searchingNumber ) {
				  low = midd + 1;  // اذا الرقم يلي نحنا عم نبحث عنها اكبر من المنتصف يعني نحنا بدنا ناخود الجزء المنتصف واعلى
				
			}
			  
			  if (numbers[midd]  >searchingNumber ) {
				  hight = midd - 1;// اذا الرقم يلي نحنا عم نبحث عنها اصغر من المنتصف يعني نحنا بدنا ناخود الجزء المنتصف واسفل
				
			}
			  
		  }

	}

}
