package com.syntax.class05;

import java.util.Scanner;

public class HwPt1 {

	public static void main(String[] args) {

		
/*You are a loan specialist and you need to ask user what is the amount of loan is needed. 
 * If loan is less or equal to 200,000 then you wouldlend the money otherwise you would reject the client.
 */
		
		
Scanner input=new Scanner(System.in);
System.out.println("what is the amount of loan needed");
 float money=input.nextFloat(); 
 
 if(money<200000) {
	 System.out.println("I will lend you money");
 }else {
	 System.out.println("client rejected");
 }
 
System.out.println("--------------------------------------");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
