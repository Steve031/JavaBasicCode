package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {

		
		
		//without curly brackets java can identify only 1 statement per block
		//you cant add multiple statements without curly brackets
		
		
		int temperature = 32;

		if (temperature < 31) {
			System.out.println("water will freeze with the temperature " + temperature);

		} else {
			System.out.println("water not will NOT freeze with temperature " + temperature);
		}

		
		
		
		
	}

}
