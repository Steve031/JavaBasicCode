package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {

String str="Batch 13 is great";
System.out.println(str.startsWith("frozen")); //checks if string starts with the word "frozen"
		
System.out.println(str.endsWith("t"));	//checks if it ends with the letter "t"	
System.out.println(str.endsWith("Great")); //false, bc java is case sensitive	
System.out.println(str.endsWith("great")); //true
System.out.println(str.toLowerCase().endsWith("t")); //tolowercase makes the whole string lower case and checks if ends with "t"		
		
		
String name="HAMID";
System.out.println(name.toLowerCase()); //hamid
System.out.println(name); //HAMID		
		
		
System.out.println(str.contains("13")); //true
System.out.println(str.contains("is")); //true
System.out.println(str.toLowerCase().contains("batch")); //true

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
