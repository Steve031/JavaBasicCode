package com.syntax.class05;

import java.util.Scanner;

public class HeightTask3 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		System.out.println("enter height in inches");
		int height=scan.nextInt(); 
		System.out.println(height);
		
		if(height<60) {
			System.out.println("short");
		}else if(height>60 && height<72) {
			System.out.println("medium");
		
		}else if(height>72) {
			System.out.println("tall");
		}
		
		System.out.println("------------------------");
		
		
		System.out.println("what is the day of the number? enter a number");
		int day=scan.nextInt(); 
		System.out.println(day);
		
		if(day==1 || day==2 || day==3 || day==3 || day==4 || day==5) {
			System.out.println("it is a weekday");
		}else if(day==6 || day==7) {
			System.out.println("it is a weekend");
		}
		
		System.out.println("---------------------------");
		
		
		
		
		
	}

	

}
