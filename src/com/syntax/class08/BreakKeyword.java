package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {

		
	//break - breaks block of code	
		
		
	for(int i=1; i<=5; i++)	{
		System.out.println("hello");
		if(i==2) {  //will execute only twice bc it breaks the loop at ==2
		break;
	 }
		
	}
		
	
	
	
	
	
	
	
	boolean summer=true;
	int temp=95;
	
	while(summer) {
		System.out.println("it is hot");
		if(temp<70) {
			System.out.println("it is not hot");
			break;
		}
		temp-=10; //decreases temperature by 10 and loops until it is less then 70
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
