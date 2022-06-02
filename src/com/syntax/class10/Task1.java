package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {

		
	int[] num1= {1, 2, 3, 4};
	
	int max=num1[0];
	
	for(int i=0; i<num1.length; i++) {
		if(num1[i]>max)
			max=num1[i];
	}
		System.out.println(max);
		
	System.out.println(" ");	
	//enhanced loop same problem^	
		
	max= num1[0];
	
	for(int num: num1) {
		if(num>max) {
			max=num;
		}
	}
		System.out.println(max);
		
	System.out.println("----------------------");	
		
	char[] values= {'A', 'B', 'C', 'D'};
	for(int i = values.length-1; i>=0; i--) {
		System.out.print(values[i]+" ");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
