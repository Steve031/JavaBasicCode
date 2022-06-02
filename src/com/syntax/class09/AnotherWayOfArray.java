package com.syntax.class09;

public class AnotherWayOfArray {
public static void main(String[] args) {
	
	String[] fruits= {"mango","apple", "kiwi", "pear"};	
	
	System.out.println(fruits[2]); //kiwi
	
	System.out.println("My favorite fruit is "+fruits[0]);   //mango
	
	
	
	//i want to find a size of an array
	//how many elements
	
	int size=fruits.length;
	System.out.println(size);  //to find the total number of elements
	
	
	System.out.println("----------------------------");
	
	//task1 
	char[] grade= {'A','B', 'C', 'D', 'E', 'F' };
	System.out.println(grade[1]);
	
	
	
	
	
	for(int i=0; i<grade.length; i++) {
		System.out.print(grade[i]+" ");
	}
	
	
	System.out.println("-----------------------------");
	
	String[] words= {"Java", "Saturday", "Day", "is", "coding"};
	System.out.println(words[1]+" "+words[3]+" "+words[0]+" "+words[4]+" "+words[2]);
	
	System.out.println("---------------------------");
	
	//same ^ problem with loops
	String[] days= {"saturday", "is", "java", "coding", "day"};
	for(int i=0; i<days.length; i++) {
		System.out.print(days[i]+" ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
