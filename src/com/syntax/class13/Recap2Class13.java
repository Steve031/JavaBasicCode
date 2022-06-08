package com.syntax.class13;

public class Recap2Class13 {

	public static void main(String[] args) {

		
	String str="where is sammer?";
	System.out.println(str.charAt(3));
	System.out.println(str.charAt(5));
	System.out.println(str.indexOf("i"));
	System.out.println(str.indexOf("e"));

	System.out.println(str.indexOf("r", 5)); //will ignore all the "e" and start search from char 6
	
	System.out.println("--------------------------");
	
	int counter=0;
	for(int i=0; i<str.length(); i++) {
		if(str.charAt(i)=='e') {
			System.out.println(i+" "); //all the index numbers that contain "e"
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
