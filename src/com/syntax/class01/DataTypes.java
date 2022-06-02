package com.syntax.class01;

public class DataTypes {

	public static void main(String[] args) {
		
		//to create a variable: datatype and  name
		// box 1 = name   byte = datatype
		// L = at the end of long numbers
		
		byte box1= 127;
		short box2=2022;
		int box3=76666;    //most common datatype
		long box4=573873857385385L;
		
		//decimal values
		float container=1.99F;
		double container2=89.99; //for double "f" not required
		
		//to represent 1 character
		char gender='m'; //single characters are stored in single quotes
		char dollar='$';
		
		//to represent true or false (yes or no)
		boolean hungry=true;
		boolean sleepy=false;
		
		//how to access values from variables?
		System.out.println(container2); //do not use "" to access variables
		
		//access and print values from all variables
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		System.out.println(container);
		System.out.println(container2);
		System.out.println(gender);
		System.out.println(dollar);
		System.out.println(hungry);
		System.out.println(sleepy);


		
	}

}
