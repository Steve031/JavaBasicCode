package com.syntax.class10;

public class AnotherWayOf2DArray {

	public static void main(String[] args) {

	//create 2d array of states	
	//1 array -->NY --->all cities of NY state
	//2 array -->CA --->all cities of CA state
	//3 array -->FL --->all cities of FL state
	//4 array -->VA --->all cities of VA state

	String[][] usa= {
			
	{"new york", "albany","buffalo"},
	{"los angles","san francisco","san jose", "san diego","redding"},
	{"miami", "orlando","niceville", "tampa"},
	{"mclean", "richmond","leesburg"},	
	
	};		
		
	System.out.println(usa[1][2]);	//san jose
	System.out.println("I want to go to "+usa[2][0]);	//miami
		
	System.out.println("total # of 1D arrays in array usa = "+usa.length);//4	
		
	//i want to see how many element inside my first array	
		int elem1array=usa[0].length;
		System.out.println("# of elements in 1st array = "+elem1array);
		
	//i want to see how many elements inside my 2nd array	
		int ele2array=usa[1].length;
		System.out.println("# of elements in 2nd array = "+ele2array);
		
	System.out.println("-------------------------");	
	for(String[] state:usa)	{
		for(String city:state){
			System.out.println(city+" ");
		}
			System.out.println();
	}
		
		
		
		
		
	}

}
