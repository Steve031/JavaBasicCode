package com.syntax.class11;

public class Task4 {

	public static void main(String[] args) {

		
		
		/*create a 2d array of integer type where you will store
		 * odd and even numbers. developed a program which will
		 * identify/print the even numbers only
		 */
		
		int[][] arr= {
				{10, 15, 10},
				{20, 50, 20},
				{30, 30, 30,}	
		};
		
		for(int j=0; j<arr.length; j++) {
			for(int i=0; i<arr[j].length; i++) {
				if(arr[j][i]%2==0) {
					System.out.println(arr[j][i]);
				}
			}
		}
		
		
		
		System.out.println("------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
