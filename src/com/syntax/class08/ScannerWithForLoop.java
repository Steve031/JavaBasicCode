package com.syntax.class08;

import java.util.Scanner;

public class ScannerWithForLoop {

	public static void main(String[] args) {

		
//ask user to guess secret number until he gets it right		
		
		
int num=13;
int guess = 0;
		
Scanner scan = new Scanner(System.in);



do {
	System.out.println("Guess my secret number");
    guess=scan.nextInt();
}

while (num!=guess); {
	System.out.println("you got it!");
}







































	}

}
