package com.syntax.class05;

import java.util.Scanner;

public class HwPt5 {

	public static void main(String[] args) {

		
	Scanner scan= new Scanner(System.in);
	System.out.println("enter birth month");
	String month=scan.nextLine(); 
	
	if(month.equals("march") || month.equals("april") || month.equals("may")) {
		System.out.println("you are born in the spring");
	}else if (month.equals("june") || month.equals("july") || month.equals("august")) {
		System.out.println("you were born in the summer");
	}else if (month.equals("september") || month.equals("october") || month.equals("november")) {
		System.out.println("you were born in the fall"); 
	}else if (month.equals("december") || month.equals("january") || month.equals("february")) {
		System.out.println("you were born in the winter");
		}
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
