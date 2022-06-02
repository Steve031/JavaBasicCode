package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {

		
		//>, <, >=, <=, ==, !=
		
		int num1=20;
		int num2=22;
		
		System.out.println(num1>num2);//false
		System.out.println(num1<num2);//true
        System.out.println(num1!=num2);//true
		
		System.out.println(num1==num2);//equal to (false)
		System.out.println(num1=num2); //reassigning (22)

		System.out.println(num1==num2);//true bc it has been reassigned

		 boolean result=100>200;
		System.out.println(result);
		
		int result1=100+200; //Arithmetic operators will give number result
		
		String result2="Emre"+10; //will be a string bc its starts with  string variable
		
		
		int num3=10;
		int num4=11;
		
		result=num3==num4; //if num3 equals to num4
		System.out.println(result);//false
		
		result=num3!=num4; // check if num3 NOT equal to num4
		System.out.println(result); 
		
		
		
		
		
	}

}
