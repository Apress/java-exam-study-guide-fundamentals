package com.readlearncode.programmeexecution;

import com.readlearncode.operators.Customer;

public class ifelse {
	
	private void compare() {	
		
		
		String message;
		boolean parentalConsent = true;
		int age = 21;
		if (age > 13) {
			Customer Ravi = new Customer("Ravi"); 
		} else if (parentalConsent) {
			Customer Ravi = new Customer("Ravi"); 
		} else {
			message = "Sorry, too young!";
		}
		
		age = 21;
		message = age >= 18 ? "Welcome" : "Sorry, too young";
		
		
		
	}

}
