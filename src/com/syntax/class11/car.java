package com.syntax.class11;

public class car {

String model;
String make;
String color;
int year;
String typeOfEngine;
int HP;

void moveForward() {
	System.out.println("cars is moving forward");
}
void reverse() {
	System.out.println("moving backwards");
}	
public static void main(String[] args) {
	
	car bmw = new car();
	bmw.model="X6";
	bmw.make="BMW";
	bmw.color="black";
	bmw.year=2022;
	bmw.typeOfEngine="V8";
	bmw.HP=500;
	 System.out.println(bmw.model+" has a "+bmw.typeOfEngine);
	bmw.moveForward();
	bmw.reverse();


	car lexus = new car();
	lexus.make="lexus";
	lexus.model="LFA";
	lexus.color="white";
	lexus.moveForward();























	}	
	
}
