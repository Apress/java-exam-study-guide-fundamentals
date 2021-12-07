package com.readlearncode.operators;

public class Equality {
	
	private void compare() {	
		
		Customer John = new Customer("John"); 
		Customer Jane = new Customer("Jane"); 
		boolean result1 = John.equals(John);
		boolean result2 = Jane.equals(John);		
//		boolean result1 = John == John;
//		boolean result2 = Jane == Jane;
			
	}

}
