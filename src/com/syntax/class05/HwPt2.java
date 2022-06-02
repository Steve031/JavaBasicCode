package com.syntax.class05;

import java.util.Scanner;

public class HwPt2 {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("input city");
		String city = scan.next(); 
		 
		System.out.println("what is the temperature?");
		int temp=scan.nextInt(); 
       
		int celsius = (temp - 32)*5/9;
		System.out.println("The temperature in the city "+city+" is"+celsius);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
