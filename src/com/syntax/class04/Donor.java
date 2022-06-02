package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {

	int odd=6;
	int even=11;
	
     odd%=2;
     even%=2;
     
     if (odd==1) {
    	 System.out.println("this is a odd number");
     }else {
    	 System.out.println("this is a even odd");
     }
     if (even==0) {
    	 System.out.println("this is a even number");
     }else {
    	 System.out.println("this is a odd number");
     }
     
		
		
	
		
		
	System.out.println("------------------------");
		
	int age=19;//you need to be age eligable first
	int weight=160;
	
	if (age >= 18) {
		System.out.println("you are age eligable");
		if (weight>110) {//nested
			System.out.println("you are weight eligable");
		}
	}
	
	else {//outside of nest
		System.out.println("you do not meet the age requirments");
	}
	
	
	
	
	System.out.println("------------------------");
	
	
	
	
	double num1=2.5;
	int num2=50;
	int num3=990;
	
	if (num1>num2) {
		if (num1>num3) {
			System.out.println(num1+" is the biggest number");
		
	}else {
		System.out.println(num2+" is the largest");
		}
	}else {
		if (num2<num3) {
			System.out.println(num3+" is the largest");
		}
	}
	
		
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
