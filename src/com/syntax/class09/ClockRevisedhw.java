package com.syntax.class09;

public class ClockRevisedhw {

	public static void main(String[] args) {

		
		// 24 hour loop revised (cleaner)
		
		for(int hrs = 0; hrs<24; hrs++) {
			for(int min = 0; min<60; min++) {
				
				String time;
				
				if(hrs<10 && min<10) {
					time="0"+hrs+":"+"0"+min;
					System.out.println(time);
				
				}else if(hrs<10 && min>=10) {
					time="0"+hrs+":"+min;
				}else if(hrs>=10 && min<10) {
					time=hrs+":"+"0"+min;
				} else {
					time=hrs+":"+min;
				}

				System.out.println(time);
				
			}
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
