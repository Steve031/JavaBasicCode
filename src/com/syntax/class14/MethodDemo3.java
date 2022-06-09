package com.syntax.class14;

public class MethodDemo3 {

	public static void main(String[] args) {


	//write a method that takes a int value if that value is even this method 
	//returns true otherwise it returns false.
		
		MethodDemo3 md=new MethodDemo3();
		System.out.println(md.isEven(3));
			
	}	
	//write  method that takes a string and returns true if number of characters	 in that string
	//are even otherwise odd
	
		boolean checkString(String str) {
			if(str.length()%2==0) {
				return true;
			}else {
				return false;
			}
		}
		                                
	
	
		boolean isEven(int number) {
			if(number%2==0) {
				return true;
			}else {
				return false;
			}
		}
			
		
		
		
		
	}


}
