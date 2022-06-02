package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

		//all set datatypes and variables 
		String name="Steve";
		String lastname="Alba.";
		
		System.out.println(" My name is "+name+" and my last name is "+lastname);
		
		
		char grade='B';
		System.out.println(" I am "+grade+" student");
		
		
		String city="Falls Church";
		String state="Virginia.";
		
		System.out.println(" I live in city "+city+" and state "+state);
		
		long number=1234567890l;
		System.out.println(" and my phone number is "+number);
		
		
		//changing variables
		city="Los Angales";
		state="California.";
		number=18008373837L;
		grade='A';
				
		System.out.println(" My name is "+name+" "+lastname+" and i moved to a new city "+city+" and a new state "+state);
		System.out.println(" My new phone number is "+number);
		 
		/*
		 * ---> Rules for identifiers <---
		 * 1. no space
		 * 2. no keywords
		 * 3. cannot start with numbers (only after alpha character)
		 * 4. cannot start with special characters (except "_" and "$")
		 * 
		 */
	
		//int 1number=10; error
		int number1=10;
		
		//int num!=20; error
		double $price=3.99;
		float f_=2.09f;
		
		/* Naming conventions:
		 * follow camel casing
		 * variables should start with lowercase "mycity" and then follow camel casing "TysonsCorner"
		 * class names should start with uppercase
		 * 
		 */
		
		String mycity="Tysons";
		
		
		
		
	}

}
