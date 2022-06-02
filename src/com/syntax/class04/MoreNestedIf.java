package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
/*
 * we need to check if repl was completed
 * 
 * if repl is completed we want to see
 *   if you did 15 and more --> great job
 *   if you did more than 10 --> did good
 *   if less than 10 --> try to complete all assignments
 */
	
		boolean didRepl=true;
		int assignments;
		
		
		if (didRepl) {
			System.out.println("How many assignments have you done");
			assignments=14;
			
			if (assignments>15) {
				System.out.println("you did a great job");
			}else if (assignments>10) {
				System.out.println("you did a good job");
			}else {
				System.out.println("please complete all repl assignment");
			}
			
		}else {
			System.out.println("you should complete your hw");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
