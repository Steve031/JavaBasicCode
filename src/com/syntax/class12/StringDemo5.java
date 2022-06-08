package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {

		
String str="Sameer is funny Sameer is gulbadan and he is sheer badan";
System.out.println(str.charAt(2));
System.out.println(str.charAt(5));


	int counter=0;
	for(int a=0; a<str.length(); a++) {
		if('s'==str.charAt(a) || 'S'==str.charAt(a)|| 'a'==str.charAt(a)||'A'==str.charAt(a)) {
			counter++;
		}
	}
	System.out.println("s and a appeared "+counter+" times in the string");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
