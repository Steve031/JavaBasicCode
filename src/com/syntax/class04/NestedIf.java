package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		
		boolean vaccine=true; //if outer if is false nothing will print 
		int dose=1;
		
		if(vaccine) {
			System.out.println("let me check how many doses you have");
			if (dose==1) {
				System.out.println("you need 1 more shot");
			}else {
				System.out.println("you are fully vacinated");
			}
		}
		
		System.out.println("--------------------------------");
		
		String month="may";
		int day=19;
		
		if (month.equals("may")) {
			System.out.println("let me check what is todays date");
			
			if (day==8) {
				System.out.println("today is a mothers day");//nested if statement
			}
		} else if (month.equals("june")) {
			if (day==19) {
				System.out.println("today is a fathers day");//nested else if
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
