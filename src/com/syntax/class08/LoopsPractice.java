package com.syntax.class08;

public class LoopsPractice {

	public static void main(String[] args) {

		
int sum=0;		
for(int i=1; i<6; i++) {
	sum+=i;
	//System.out.println(sum+" "); //1 3 6 10 15
}
		
	System.out.println(sum);	//15
		
		
System.out.println();	
		
	
	








//sum of even numbers from 1 to 70
    int sum2=0; 
	for(int a=1; a<=70; a++) {
		if(a%2==0) {
			sum2+=a;
		}
	}
	System.out.println("sum of all even numbers "+sum2);
	
	
	System.out.println();
	//sum of odd numbers
	
	int sum3=0;
	
	for(int b =1; b<=70; b++) {
		if(b%2!=0) {
			sum3+=b;
		}
	}
	System.out.println("the sum of all odd numbers "+sum3);
	
	

	

	System.out.println();
	
	
	
	//3rd way  (cleaner code)
	
	int sumEven=0;
	int sumOdd=0;
	
	for(int m = 1; m<=70; m++)
		if(m%2==0) {
			sumEven+=m;
		}else {
			sumOdd+=m;
		} 
	System.out.println("sum of all even numbers "+sumEven);
	System.out.println("sum of all even numbers "+sumOdd);
	
	
	
	System.out.println();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}

}
