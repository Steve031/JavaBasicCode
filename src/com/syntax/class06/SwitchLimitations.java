package com.syntax.class06;

public class SwitchLimitations {

	public static void main(String[] args) {

		
		
		
		/*switch has a datatyoe limitations
		 *
		 * switch can work with byte, short, int, char, string
		 * 
		 * switch cannot work with double, float, long, boolean
		 */
		
		
		double price=10;
		
		/*switch(price)  {-> CE: cannot switch on a value of type double
		 * }
		 */
		
		
	
		
		
		boolean hungry=true;
	
		/*switch (hungry) { -> CE: cannot switch on a value of type boolean
		 * } 
		 * 
		 */
		
	
	
	
		char choice='y';
		String meaning;
		
		switch(choice) {
		
		case 'y' || 'y':   //cannot use or operator "||"
			meaning="yes";
			break;
		
		}
		
		
		int day=5;
		 
		switch(day) {
		case>5: // cannot use relational operators ">"
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
