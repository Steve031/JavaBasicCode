package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {

		
	//print numbers from 1 to 10;	
		
	int num=1;	
	
	while(num<=10)	 {
		
		System.out.print(num+" ");
		num++;

	}
		System.out.println();
	
		
		
		int num1=0;
		
		while(num1<10) {
			num1++;
			System.out.print(num1+" ");
	}
		//print numbers from 1 to 100
		System.out.println();
		
		int a=10;
		
		while(a<=100) {     //loops will repeat code as long as condition is true
			System.out.print(a+" ");
			a++;
		}
		
		//print numbers from 10 to 1
		System.out.println();
		
		int b=10;
		while(b>=1) {
			System.out.print(b+" ");
			b--;
		}
		
		//print 100 to 50
		System.out.println();
		
		int c=100;
		while(c>=50) {
			System.out.print(c+" ");
			c--;
		}
		
		System.out.println();
		//print numbers from -1 to -10
		
		
		}
		
		
		//print number from 1 to 20 but only even number
		System.out.println();
		
		int e=2;           //start from first even number to get all even number from 1-20
		while(e<=20) {
			System.out.print(e+" ");
			e+=2;
		}
		 
		// 2nd way
		System.out.println();
		
		
		int f=1;
		
		while(f<=20) {
			
			if(f%2==0) {
			System.out.print(f+" ");
			}
			f++;
		}
		
		
		
		
	}

}
