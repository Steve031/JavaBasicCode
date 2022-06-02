package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {

	int time=1;
	if(time<12) {
		System.out.println("morning");
	}
	
	System.out.println("--------------------------");	
		
	/*
	 *      while(time<12) {
		    System.out.println("infinite"); //infinite loop
	 */
	
	
	
	
	while(time<12) {           //will execute 11x b/c it loop until statement is false
		System.out.println("good morning"); //infinite loop
		time++;
	}
		
	System.out.println("hello");
		
		
		
		
		
		
		
		
		
		
	}

}
