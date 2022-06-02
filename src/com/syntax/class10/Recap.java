package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {

		
	String[] disney= {"shrek", "elsa", "goofy", "mulan"};
	System.out.println(disney[1]); //elsa	
	
	
	System.out.println("-------------------------------");
	//to get all elements from an array	using for loop.
		
	for(int i=0; i<disney.length; i++) {
		if(disney[i].equalsIgnoreCase("shrek")) {
			System.out.println(disney[i]+" is my favourite character");
	
	}else {
		System.out.println(disney[i]);
	
	}
}		
	System.out.println("-------------------------------");	
	for(String characters:disney)	{
		
		if(characters.equalsIgnoreCase("mulan")) {
			System.out.println(characters+" is my favourite character"); //or use continue;
		}else {
			System.out.println(characters+" ");

		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
