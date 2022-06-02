package com.syntax.class05;

import java.util.Scanner;

public class HwPt3 {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter years worked and salary");
		 int years=scan.nextInt(); 	
		 double salary=scan.nextDouble(); 	

		if(years>=5 && salary>50000 ) {
			System.out.println("bonus=5000");
		}else if(years>=5 && salary<50000) {
			System.out.println("bonus=3000");
		}
			
		else {
			System.out.println("you are not eligible for a bonus");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
