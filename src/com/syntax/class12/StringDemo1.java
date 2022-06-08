package com.syntax.class12;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String name= new String("oleg");	//proper way of creating a object from a class
		
	String name2="steve"; //its same as string name= new String("steve");	
	//all the classes in java can be treated as data types
	//if a class is present inside the same package or if a class belongs to java.lan package	
		
	System.out.println(name.length());
	name2=" z ameer "	;
	System.out.println(name2.length());
	
	String name3="oleg";
	System.out.println(name3.length());
		
		
		
	String captain="NAVEED";
	System.out.println(captain.toLowerCase());
	captain=" i love java";	
	System.out.println(captain.toUpperCase());
		
		
		
		
	}

}
