package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {

	
	boolean job=true;
	double salary=100000;
	
	if(job && salary>=100000) {
		System.out.println("i am super happy");
	}
		
	System.out.println("----------------------");	
		
		
	boolean study=true;
	boolean homework=false;
	boolean practice=true;
		
	if(study && homework && practice) {
		System.out.println("you will succeed in the course");
	}else {
		System.out.println("you will struggle");
	}
		
	System.out.println("---------------------------");
		
	int num1 = 65;
	int num2 = 66;
	int num3 = 23;
	//       F      +   T        =FALSE           
	if (num1>num2 && num1>num3) {
		System.out.println("the largest number is "+ num1);
	//if conditions are false it will move to next else if
	}else if (num3>num1 && num3>num2) {
		System.out.println("the largest number is "+ num3);
	
	}else if (num2>num1 && num3>num3) {
		System.out.println("the largest number id "+ num2);
	}
		
		
		
		
		
		
	}

}
