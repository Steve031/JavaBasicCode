package com.syntax.class13;

public class RecapClass13 {

	public static void main(String[] args) {

		
	String str="Batch 13 is great but i say this to every batch. i was kidding";
	int len=str.length();
	System.out.println(str.toUpperCase());	
	str=str.toUpperCase();
	System.out.println(str);	
	str=""; //isEmpty will also count spaces as characters.
	System.out.println(str.isEmpty());	

	String str2=" steve        ";
	System.out.println(str2.trim()); //to remove the spaces in string but not spaces inbetween.
	str="Batch 13 is great but i say this to every batch. i was kidding";	
	System.out.println((str.contains("z")));	
	System.out.println((str.startsWith("Batch")));	
	System.out.println((str.endsWith("ing")));	

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
