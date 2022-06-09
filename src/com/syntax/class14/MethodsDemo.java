package com.syntax.class14;

import java.util.Scanner;

public class MethodsDemo {

//Method is a block of code a group of java statements that are grouped together and
//we can execute those statements buy just creating an object of the class that contains
//that method and by writing the objects name .method name
void printHello() {
	System.out.println("How are you guys");
}
	
boolean returnTrue() {
	return true;
}

int returnInt() {
	return 10;
}
	//methods that return something and methods that dont return something
	public static void main(String[] args) {
		MethodsDemo md=new MethodsDemo();
		md.printHello();

		
		boolean xs=md.returnTrue();
		int num=md.returnInt();
		System.out.println(num); //10
		System.out.println(md.returnInt()); //10
		Scanner scanner=new Scanner(System.in);
		scanner.nextInt();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
