package com.syntax.class05;

public class logicalOr {

	public static void main(String[] args) {

		/*monday and friday ----> no class
		 * tuesday and wedsnday --> manual testing
		 * thursday ----> review
		 * saturday and sunday ---> java
		 *
		 * 
		 */
		
		String day="Monday";
		
		if(day.equals("Monday") || day.equals("Friday")) {
			System.out.println("i have no class");
		
		}else if (day.equals("tuesday") || day.equals("wedsnday")) {
			System.out.println("i have manual testing class");
	
		}else if (day.equals("thursday")) {
			System.out.println("i have review class");
	
		}else if (day.equals("saturday") || day.equals("sunday")) {
			System.out.println("i have java class"); //answer***
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
