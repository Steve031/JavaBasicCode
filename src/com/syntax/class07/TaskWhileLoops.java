package com.syntax.class07;

public class TaskWhileLoops {

	public static void main(String[] args) {

		/*
		 * Print even numbers from 20 to 100
		   Print only odd numbers from 100 to 1
		 */
		
		
		//even numbers from 20 to 100

		
		int a=20;
		while(a<=100) {
			System.out.print(a+" ");
			a+=2;
		}
		
		
		
		
		
		
		System.out.println();
		
		
		
		
		
		
		//print odd numbers from 100 to 1
		
		int b=100;              
		while(b>=1) {
			if(b%2!=0) {
			System.out.print(b+" ");
		}
			b--;
		}	
		
		
		
		
		
		
		
		System.out.println();
	
		
		
		
		
		
		
		
		//same problem different way
		
int f=99;
		
		while (f>=1) {
			System.out.print(f+" ");
			f-=2;
		}
		
		
		
		
	}

}
