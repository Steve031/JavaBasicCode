package com.syntax.class03;

public class ShortHandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=100;
		num=num+100;
		System.out.println(num);//        =200
		
		
		num=num+50;
		System.out.println(num); //       =250
		
	
		num+=100; //  same as num=num+100 =350
		
	    
		num-=10; //same as num=num-10;
		System.out.println(num);//        =340
		
	
		
		num/=10;
		
		num*=2;
		
		System.out.println(num);
		
		num%=2;
		System.out.println(num); //       =0
		
		
		//For more than two numbers=
		
		int a=10;
		int b=20;
		int c=30;
		
		a+=b;
		System.out.println(a);// a+b=30
		
		a+=b+c; //assignment operaters (b+c will add up first)
		System.out.println(a); //=80 (were adding "a" from line 43 )
		
		a*=10;
		System.out.println(a); //800
		
		
		//task
		int num1=20;
		int add=500;
		int add2=200;
		
		num1+=add;
		num1+=add+add2;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
