package com.syntax.class07;

import java.util.Scanner;

public class HWCalculatorReview {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		double x = scan.nextInt();
		double y = scan.nextInt();
		double result = 0;
		System.out.println("Please enter operator");
		char op = scan.next().charAt(0);
		String operator=null;
		switch (op) {
		case '*':
			result = x * y;
			break;
		case '/':
			result = x / y;
			break;
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		default:
			System.out.println("Invalid Operator");
			operator="Invalid";
		}
		
		if(result!=0 || !(operator==null)) {
		System.out.println(x + " " + op + " " + y + " = " + result);
		scan.close();		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
