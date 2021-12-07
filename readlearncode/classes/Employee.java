package com.readlearncode.classes;

	public class Employee extends PersonAbstract implements Person{
		
		private String name;
		private String address;
		private int employeeNumber;
	
		public Employee(String name) {
			this.name = name;
		}
	
		@Override
		public void setName(String name) {
			this.name = name;
		}
	
	}



