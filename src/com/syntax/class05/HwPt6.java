package com.syntax.class05;

import java.util.Scanner;

public class HwPt6 {

	public static void main(String[] args) {

		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter your score");
		int score=scan.nextInt(); 	
		
		if(score>=90) {
			System.out.println("grade=A");
		}else if (score>=70 && score<=90) {
			System.out.println("grade=B");
		}else if (score>=50 && score<=70) {
			System.out.println("grade=C");
		}else if (score<50) {
			System.out.println("grade=F");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
