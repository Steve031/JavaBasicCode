package com.syntax.class09;

public class ArrayExamples {

	public static void main(String[] args) {

		
	//i want to store prices in array	
		
	double [] price=new double[6];
	
	price[1]=1.99;		
	price[2]=2.99;		
	price[3]=3.99;		

	System.out.println(price[0]); //will print 0.0 by default bc it was not initiated
	
	int[] numbers=new int[3];
	
	numbers[0]=10;
	numbers[1]=11;
	numbers[2]=12;
	//numbers[3]=13;  will give error b/c it is 4th element 

	System.out.println(numbers[1]);	
		
	//arrays are fixed in size	
	//during runtime java cannot increase or decrease a size of an array	
		
		
		
		
		
		
		
		
		
		
		
	}

}
