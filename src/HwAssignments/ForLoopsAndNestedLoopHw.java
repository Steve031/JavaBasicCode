package HwAssignments;

import java.util.Scanner;

public class ForLoopsAndNestedLoopHw {

	public static void main(String[] args) {

//	nested loop 24 hour clock
	for(int a=0; a<=24; a++) {
		for( int b=00; b<=59; b++ ) {
			System.out.print(String.format("%02d", a));
			System.out.print(":");
			System.out.println(String.format("%02d", b));

		}
	}

	
	
	
	
	System.out.println("---------------------");
//  add up even/odd numbers		
	
	int even = 0, odd = 0;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter start number");
	int startNumber=scan.nextInt();
	System.out.println("Enter end number");
	int endNumber=scan.nextInt();

	for(int i=startNumber; i<=endNumber; i++) {
		if(i%2==0) {
			even+=i;
		}
	}
	System.out.println("sum of even numbers"+" = "+even);	
		
	for(int i=startNumber; i<=endNumber; i++) {
		if(i%2!=0) {
			odd+=i;	
		
		}
	}	
	System.out.println("sum of odd numbers"+" = "+odd);	
	
		
	System.out.println("----------------------------");	
		
	//	
	
	//System.out.println("please enter the item your purchasing");	
	//String name=scan.nextLine();
	System.out.println("please enter the item price");	
	int price=scan.nextInt();
	
	
	
	int totalPaid = 0;
	while(totalPaid<price) {
		System.out.println("Please Complete payement");
		int payement=scan.nextInt();
		totalPaid+=payement;
	}
		
	if(totalPaid==price) {
		System.out.println("Thank you for shopping");
	}	
		
	if(totalPaid>price)	 {
		int change = totalPaid-price;
		System.out.println("Your change is "+change+"$");
	}
		
		
		
		
		
	}

}
