package com.syntax.class03;

public class PrimitiveCasting {
 public static void main(String[] args) {
	
	 int i=100;
	 double d=100; //widening
	 System.out.println(i); //100
	 System.out.println(d); //100.0
	 
	 //casting in java --->converting1 type into another
     
	 //byte -->short -->int --> long --> float --> double
	 
	 
	 long l=10000;
	 
	
	 
	 //type mismatch: cannot convert from double to int
	 int x=(int)99.99; //we lose .99 (narrowing)
	 System.out.println(x);
	 
	 //type mismatch: cannot convert from int to byte
	 byte b=(byte)130;
	 System.out.println(b);
	 
	 
	 
	 //type mismatch: cannot convert from double to float
	 float f=10.99f; //by adding "f" at end changes from double to float.
	 double dd=9.99;
	 
	 
	 
   }
	
}
