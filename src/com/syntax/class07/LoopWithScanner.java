package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {

		
	/*
	 * we are going to ask you if you got a job
	 * we will continuously ask you if you got a job until you say yes	
	 * 
	 * once you say yes ----> congratulations!
	 */
		
		
	Scanner scan=new Scanner(System.in);
	String job;
	
	
	do {
		System.out.println("did you get a job");
		job=scan.nextLine();	
	}while(!job.equalsIgnoreCase("yes"));	
		
		System.out.println("congrats");
		
		
		System.out.println("----------------------");
		
		
		
		Scanner input=new Scanner(System.in);
		String offer;	
		
		
		System.out.println("did you get a job");
		offer=input.nextLine();
		
		while(!offer.equalsIgnoreCase("yes")) {
			System.out.println("did you get a job?");
			offer=input.nextLine();
		}
		
		System.out.println("congrats");
		
		
		
		
		
		
	}

}
