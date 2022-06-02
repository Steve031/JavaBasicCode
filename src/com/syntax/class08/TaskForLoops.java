package com.syntax.class08;

public class TaskForLoops {

	public static void main(String[] args) {

	/*
	 * Print numbers from 1 to 100 in 1 line with space


	Print numbers from 100 to 1


	Print even numbers from 20 to 1 (2 ways)


	Print odd numbers between 20 and 50 (2 ways)
	 * 	
	 */
		
	//print 1 to 100	
	for(int a=1; a>=100; a++) {
		System.out.print(a+" ");
	}
		
	System.out.println();	
		
	
	//print 100 to 1
	for(int b=100; b<=1; b--)  {
		System.out.print(b+" ");
	}
		
	System.out.println();	

	
	
	//20 to 1
	for(int i=20; i>=1; i-=2) {
		System.out.print(i+" ");
	}
		
	
	
	//20 to 1 2nd way
	System.out.println();
	
	
	
	for (int m=20; m>=1; m--) {           //same problem different way 20 to 1 only even
		if(m%2==0) {
			System.out.print(m + " ");
		}
	}
	
	
	
	System.out.println();
	
	
	//print odd numbers between 20 and 50	(2 ways)
	
	for(int i=21; i<=50; i+=2) {
		System.out.print(i+" ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
