package com.syntax.class11;

import java.util.Scanner;

public class dog {

	 
 
//attributes how the object will look like
String name;
int age;
double weight;
String color;
double height;
String breed;

//how that object behave

void bark() {
	System.out.println("Dog barks");
}

void walks() {
	System.out.println("Dog walks");
}

void eat() {
	System.out.println("Dogs like to eat bones");
}



public static void main(String[] args) {


//Scanner scanner = new Scanner(System.in);
//scanner.next();
dog jimmy = new dog();
jimmy.name="jimmy";
jimmy.age=6;
jimmy.weight=16;
jimmy.color="black";
jimmy.height=5.6;
jimmy.breed="german";
jimmy.bark();

//new dog() how we create an object






















	}
 
}
