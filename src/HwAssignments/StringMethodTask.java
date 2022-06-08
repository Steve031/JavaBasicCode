package HwAssignments;

import java.util.Scanner;

public class StringMethodTask {

	public static void main(String[] args) {

		
		
	//	@here Some more tasks as your homework.
	//	Create a String and if the String is not empty perform the following: 
	//	if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.

	//	Create a String and print it in reverse order (Sunday → yadnuS).
	//	Write a program that reads two people's first
	//	names and if they expecting boy or girl? 
		
	//	Based on the input suggests a name for a baby:
	//	Example Output:
	//	Mom's first name? Mary
	//	Dad's first name? Daniel
	//	Boy or Girl? boy
	//	Suggested baby name: DANRY

	//	Example Output:
	//	Mom's first name? Mary
	//	Dad's first name? Daniel
	//	Boy or Girl? girl
	//	Suggested baby name: MAIEL
		
		
	String name="Steve";
		if(!name.isEmpty()) {
			if(!((name.length()%2)==0) && name.length()>3 ) {
				System.out.println(name.charAt(2));
			}
		}
		
		System.out.println("-------------------------------");
		

	String day="friday";
	char[] switch1 = day.toCharArray();
		for(int a =  switch1.length-1; a>=0; a--) {
            System.out.println(switch1[a]);
		}

		System.out.println("-------------------------------");

		
		
	Scanner scan = new Scanner(System.in);	
	System.out.println("Moms first name?");
	String momName= scan.nextLine();    		
	
	System.out.println("Dads first name?");
	String dadName= scan.nextLine();    		

	System.out.println("Boy or Girl?");
	String gender= scan.nextLine();   	
		
		if(gender.equalsIgnoreCase("Boy")) {
			System.out.println(dadName.substring(0,3)+momName.substring(2,4));
		}
		if(gender.equalsIgnoreCase("Girl")) {
			System.out.println(momName.substring(0,2)+dadName.substring(3,6));
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
