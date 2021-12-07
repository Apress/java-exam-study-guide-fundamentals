package com.readlearncode.methods;

	public class Customer {
		
		private String name;
	
		Customer(String name){
			this.name = name;
		}
		
		public final String methodName(String name, int age) throws Exception {
		    String message = "Hello world";
		return message; 
		}
	
		
		public String message() {
			return "Welcome "+ name;
		}
	
	}
