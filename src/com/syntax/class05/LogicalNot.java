package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {

		
	boolean boo=!true;
	System.out.println(boo); //false
	
	boolean boo1=!false;
	System.out.println(boo1); //true
		
		
		
		/*
		 * if there is not traffic ---> i will reach work ontime
		 * 
		 */
		
		boolean traffic=false;
		
		if(!traffic) {
			System.out.println("i will reach work on time");
		}
		
		String name="steve";
		if (!name.equals("emre")) {
			System.out.println("you are not emre, and i need emre");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
