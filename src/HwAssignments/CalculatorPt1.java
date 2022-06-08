package HwAssignments;

import java.util.Scanner;

public class CalculatorPt1 {

	public static void main(String[] args) {

	char operator;
	int  num1, num2, num3, num4;	
		
	Scanner scanner= new Scanner(System.in);
	System.out.println("enter a number");	
	num1=scanner.nextInt();
	
	System.out.println("enter a number");	
	num2=scanner.nextInt();
		
	System.out.println("enter a operator: /, +, -, *");	
	operator=scanner.next().charAt(0);
		
	
	if(operator=='/') {
		System.out.println(num1/num2);
	}else if(operator=='+') {
		System.out.println(num1+num2);
	}else if(operator=='-') {
		System.out.println(num1-num2);
	}else if(operator=='*') {
			System.out.println(num1*num2);
	}	
		
	System.out.println("--------------------------");
	
	
	
	System.out.println("Enter first number");
	    num3 =scanner.nextInt();

	    System.out.println("Enter second number");
	    num4 =scanner.nextInt();
	  System.out.println("enter a operator: /, +, -, *");	
		operator=scanner.next().charAt(0);
	
	switch (operator) {
	case '+':
		System.out.println(num3+num4);
		break;
		
	case '-':
		System.out.println(num3-num4);
		break;
	
	case '/':
		System.out.println(num3/num4);
		break;	
	
	case '*':
		System.out.println(num3*num4);
		break;
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
		
		
	}

}
