package com.syntax.class06;

import java.util.Scanner;

public class SwicthDemo3 {

	public static void main(String[] args) {

/*LETS ASK A USER WHERE HE IS FROM
 * based on country we will define favourite food
 */
		
	Scanner scan=new Scanner(System.in)	;
	String country, favouriteFood;
	
	System.out.println("please tell me where you are from");
	country=scan.nextLine(); 
	
	switch(country.toLowerCase()) {
		
	case "mexico":
		favouriteFood="tacos";
		break;
	case "canada":
		favouriteFood="poutine";
		break;
	case "turkey":
		favouriteFood="lahmacun";
		break;
	case "pakistan":
		favouriteFood="pati chai";
		break;
	case "egypt":
		favouriteFood="koshary";
		break;
	case "USA":
		favouriteFood="burgers";
		break;
	
	default:
		favouriteFood="unknown";
	}
		
		System.out.println("you are from "+country+" and your favoirte food is "+favouriteFood);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
