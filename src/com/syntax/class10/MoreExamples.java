package com.syntax.class10;

public class MoreExamples {

	public static void main(String[] args) {

	int[][]nums= {
			
			{1, 2, 3,},
			{199, 300, 588},
			{1900, 4578, 98787}	
			
	};	
	
	//enhanced for loop uses variables to access elements from an array.
	//outer for loops---> iterates over 1d array
	//inner loop---> iterates over elements of each 1d array
	
	for(int[]num:nums) {
		for(int n:num) {
			System.out.println(n+" ");
		}
		System.out.println();
	}
	
	

	
	
	System.out.println("-------------------------");
	
	
	
	
	
	
	//i loop iterates over rows
	// nums.length gives # of arrays inside 2D array = 3
	//j loop iterates over columns
	for (int i=0; i<nums.length; i++)	{
		
		for(int j=0; j<nums[i].length; j++) {
			System.out.println(nums[i][j]+" ");
		}
		System.out.println();
	}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
