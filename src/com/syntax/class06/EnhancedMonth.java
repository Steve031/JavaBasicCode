package com.syntax.class06;

import java.util.Scanner;

public class EnhancedMonth {

	public static void main(String[] args) {

		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter birth month");
		String month=scan.nextLine(); 
		
		String season;
		
		
		if(month.equals("march") || month.equals("april") || month.equals("may")) {
			season="Spring";
		}else if (month.equals("june") || month.equals("july") || month.equals("august")) {
			season="summer";
		}else if (month.equals("september") || month.equals("october") || month.equals("november")) {
			season="fall";
		}else if (month.equals("december") || month.equals("january") || month.equals("february")) {
			season="winter";
		}else {
			season="invalid";
		}
		
		
		if(!season.equals("invalid")) {
			System.out.println("you were born in "+season);
		}
		 //or you can initialize variable with compiler
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
