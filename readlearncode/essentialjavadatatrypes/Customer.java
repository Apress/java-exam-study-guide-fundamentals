
	package com.readlearncode.essentialjavadatatrypes;
	
	public class Customer {
		
		static boolean debug = true;
		private String name;
		
		public Customer(String name){
			 this.name = name;
		}
		
		public String getWelcomeMessage() {
			String message = "Welcome " + name;
			return message;
		}
	
	}



