package com.readlearncode.programmeexecution;

import java.util.ArrayList;

public class loopexample {

	private void loopExample() {
		
		int total = 0;
		while(total < 10) {
			++total;
		}
		
		do {
			++total;
		} while(total < 10);
		
		
		for(int i = 0; i < 10; i++) {
			total++;
		}
		
		int[] numbers = new int[]{1, 2, 3, 4, 5};
		for (int number : numbers) {
		   System.out.println(number);
		}
		
		ArrayList<String> customers = new ArrayList<>();
		customers.add("Ravi");
		customers.add("Smit");
		customers.add("Jones");
		customers.add("Snoop");
		for(String customer : customers){
		     System.out.println(customer);
		}
	
	}

}
