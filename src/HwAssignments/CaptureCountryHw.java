package HwAssignments;

import java.util.Scanner;

public class CaptureCountryHw {

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scanner.nextLine();
	
		
		if(country.equals("spain")) {
			System.out.println("you speak spanish");
		}else if(country.equals("usa")) {
			System.out.println("you speak english");
		}else if(country.equals("germany")) {
			System.out.println("you speak german");
		}
		
		System.out.println("----------------------------");
		
		
		System.out.println("Please enter your grade");
		char grade=scanner.next().charAt(0);
		
		if(grade=='A') {
			System.out.println("your grade is excellent");
		}else if(grade=='B') {
			System.out.println("your grade is good");
		}else if(grade=='C') {
			System.out.println("your grade is average");
		}else if(grade=='D') {
			System.out.println("your grade is bad");
		}else {
			System.out.println("not acceptable");
		}
		
	
		System.out.println("------------------------------");
			
			
		
		
		
		
		
		
		
		
		scanner.close();
		
		
		
		
	}

}
