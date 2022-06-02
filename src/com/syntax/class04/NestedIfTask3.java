package com.syntax.class04;

public class NestedIfTask3 {

	public static void main(String[] args) {

		boolean diploma=true;
		double gpa=3.6;
		
		if (diploma) {
			System.out.println("congratulations");
			if (gpa >= 3.5) {
				System.out.println("you are eligable for a scholarship");
			}else {
				System.out.println("you should have studied harder");
			}
		       
			}
		else {
			System.out.println("get a degree");
		}
		
		
		System.out.println("---------------------------------");
		
		
		double mortgageRate=4.4;
		int mortgagePrice=52000;
		
		if (mortgageRate>4.5) {
			System.out.println("will not buy the house");
			}else {
				System.out.println("will consider buying");
				if (mortgagePrice>50000) {
					System.out.println("will take a loan");
				}else if (mortgagePrice<50000) {
						System.out.println("will pay in cash");
				
				}
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
