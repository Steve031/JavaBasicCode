package com.syntax.class08;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {

		
	//to print numbers from 1 to 50 except numbers divisible by 3
	for( int i=1; i<=50; i++) {
		if(i % 3==0) {
			continue;
		}
		System.out.println(i+" ");
	}
		
		
System.out.println("-------------------");	
		




//ask user to get credit card until answer is yes
Scanner scan = new Scanner(System.in);

String answer="yes";

do {
	System.out.println("apply for a credit card!");
	answer=scan.nextLine();
	
}while(!answer.equals("yes"));
System.out.println("thanks");{
	
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
