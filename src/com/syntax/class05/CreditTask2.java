package com.syntax.class05;

import java.util.Scanner;

public class CreditTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Do you have a credit card? yes or no");
		 String answer=input.next(); //use next to capture string variables
		
		if(answer.equalsIgnoreCase("no")) {
			System.out.println("we will offer you a credit card");
		}else {
			System.out.println("what is the balance on the card");
			int balance=input.nextInt();
			
			if (balance>1000) {
				System.out.println("pay it off immediently");
			}else {
				System.out.println("you can spend more");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
