package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {

		
		//variable and matching cases must be of same type
		//switch does not allow to have duplicated cases
	
	char choice='y';
	String meaning;
	
	switch(choice) {
	case 'y':
		meaning="yes";
		break;
	case 'm':
		meaning="maybe";
		break;
	case 'n':
		meaning="no";
		break;
	default:
		meaning="unknown";	
}
	System.out.println(meaning);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
