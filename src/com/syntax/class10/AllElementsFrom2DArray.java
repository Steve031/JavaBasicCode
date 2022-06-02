package com.syntax.class10;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {

		
		String[][] usa= {
				
				{"new york", "albany","buffalo"},
				{"los angles","san francisco","san jose", "san diego","redding"},
				{"miami", "orlando","niceville", "tampa"},
				{"mclean", "richmond","leesburg"},	
				
				};		
		
		//outer loop iterates over rows
		//inner loops iterates over columns
		
		for(int row=0; row<usa.length; row++) {
			for(int col=0; col < usa[row].length; col++) {
				System.out.println(usa[row][col]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
