package com.readlearncode.essentialjavadatatrypes;

public class newCustomer {
	
	public void createNewCustomer(String name) {
		
		Customer john = new Customer("John");	
		
	}
	
	public class Customer {
		
		private String name;
		
		public Customer(String name){
			 this.name = name;
		}
		
	}

}
