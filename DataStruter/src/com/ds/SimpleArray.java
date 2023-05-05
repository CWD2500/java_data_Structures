package com.ds;

import java.util.Iterator;

public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Simple Array 
		// one Dimesion Array	
		int[] number =  new int[3];
		number[0] = 2;
		number[1]  = 21;
		number[2]  = 33;
		
		
		for (int i  = 0 ; i < number.length  ;i ++) 
			System.out.print( number[i] + "\t");
		
		// Object Array 
		Student[]  stu  = new Student[3];
		stu[0] =  new Student(1 , "Christiane");
		stu[1]  = new Student(2 , "Soliman");
		stu[2] = new Student(3,"Dinel");
		
		System.out.println("\nObject Array ");
		for (Student    student : stu) {
			System.err.println(student.name  + "  , \t"  +  student.id  );
			
		}
		
		
		//  Mulite Dimesion Array 
		int[][] num = new int[3][3];
		num[0][0] =12; // 12 34 54
		num[0][1] =34; 
		num[0][2] =54;
		num[1][0] =67;
		num[1][1] =100;
		num[1][2] =3;
		num[2][0] =4;
		num[2][1] =6;
		num[2][2] =1;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
			
				System.out.print(num[i][j] + "\t");
				
			}
			
			System.out.print("\n");
		}
		
		
		
		
		
		
			

	}

}
