package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {

		int day = 3;
		String name;
		
		//condition based statement
		
		if (day==1) {
			name="monday";
		}else if (day==2) {
			name="tuesday";
		}else if (day==3) {
			name="wedsnaday";
		}else if (day==4) {
			name="thursday";
		}else if (day==5) {
			name="friday";
		}else if (day==6) {
			name="saturday";
		}else if (day==7) {
			name="sunday";
		}else {
			name="invalid";
		}
		
		
		System.out.println(name);
		System.out.println("-----------------------------");

		//switch is a value based statement
		
		
		switch(day) {
		case 1:
			name="monday";
			break; //break is to let java exit/leave to execute code
		case 2:
			name="monday";
			break;	
		case 3:
			name="monday";
			break;
		case 4:
			name="monday";
			break;
		case 5:
			name="monday";
			break;
		case 6:
			name="monday";
			break;
		case 7:
			name="monday";
			break;
		default://same as else block
			name="invalid";
			break; //dont need break on default 
		}	
		System.out.println(name);

			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
