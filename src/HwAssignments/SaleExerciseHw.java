package HwAssignments;

import java.util.Scanner;

public class SaleExerciseHw {

	public static void main(String[] args) {

int price = 0,discount = 0,discountPrice;
String item = null;	
	
Scanner scanner=new Scanner(System.in);
System.out.println("Will there be a sale? Yes or No");	
String ans=scanner.nextLine();
	
	
	if(ans.equalsIgnoreCase("Yes")) {
	System.out.println("what item will you buy?");
	item=scanner.nextLine();
	}else {
		System.out.println("I will not go shopping");
	}
	
	switch (item) {
		case "shirt":
			price=20;
			break;
		case "pants":
			price=50;
			break;
		case "sweater":
			price=150;
			break;
		case "shoes":
			price=550;
			break;	
	}		
		
		
		if(price<20) {
			discount=10;
		}else if(price>=20 && price<=100) {
			discount=20;
		}else if(price>=100 && price<=500) {
			discount=30;
		}else if(price>500) {
			discount=50;
		} 
		
		
		
		discountPrice=((100-discount)*price)/100;
		
		
		System.out.println("After a discount of "+discount+"% "+" the price of the item is reduced from "+price+" to "+discountPrice);
		
		
		
		
		
		scanner.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
