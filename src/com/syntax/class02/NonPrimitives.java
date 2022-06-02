package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {

		String name="steve";
		String lastName="Alba";
		
		long phone=1234567890l;
		
		//xxx-xxx-xxxx
		
		String PhoneNumber="123-456-7890";
		
		String address="123 washington st";
		
		int age =19;
		String city ="Miami";

		
		//use "+" to attatch strings together
		// " " <--- to add a space 
		System.out.println(name+" "+lastName);//steve alba
		
		// steve lives in miami 
		System.out.println(name+ " lives in "+city);
		
		// steve is 19 years old
		System.out.println(name+ " is "+age+ " years old ");
	}

}
