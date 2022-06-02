package com.syntax.class03;

public class AdditionOrConcatenation {
 public static void main(String args []) {
 	
	
	int a=10;
	int b=20;
	
	String c="Hello";
	String d="Hi";
	
	System.out.println(a+b+c+d);
	System.out.println(a+c+b+d);
	System.out.println(c+d+a+b);
	/* anything attatched to a string turns into a big string
	 * line 15 = HelloHi1030 
	 * 
	 */
	
	
	System.out.println(c+d+(a+b));//HelloHi30

	
	boolean boo=true;
	System.out.println(c+boo);
	
	
		
		
	
	
	
	
	
  }
}
