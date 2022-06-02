package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
    
		
	/*
	 * declare a variable rate.
	 * if rate is more than 5 --> I am not buying a house	
	 */
	
		double mortgageRate=4.5;
		
		if (mortgageRate>5) {
			System.out.println("I am not buying a house");
		}
			
		/*
		 * declare 2 variables and check if num1 is bigger than num2
		 */
		
		int num1=99;
		int num2=10;
		
		if(num1>num2) { //after java checks condition it inserts in into syso
			System.out.println(num1+" is bigger than "+num2);
		}
		
		
		/*
		 * declare temperature, if temp is higher than 75 -> i will go for a walk
		 */
		
		int temp=65;
		
		if (temp>75) { 
			System.out.println("i will go for a walk"); //if this is false-->
		}else { 
			System.out.println("I am going to study java"); //this will run (else)
		} 
		//if "if" statement is true than "else" statement will not run
		
		char gender='f';
		if (gender=='f') { 
			System.out.println("you like shopping");
		}else {
			System.out.println("you like watching sports"); 
		}
	 
		
		
		String browser="chrome";
		if (browser.equals("chrome")) {
			System.out.println("all test will be executed on chrome");
		}else {
			System.out.println("i am not executing any test cases");
			}
		
		
		
		
		
		
		
		
		
	}

}
