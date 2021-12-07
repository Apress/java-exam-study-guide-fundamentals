
package com.readlearncode.classes;

	public class Customer extends PersonAbstract implements Person {
	
		private String name;
		private String address;
		private float amount;
	
		public Customer(String name) {
			this.name = name;
		}
	
		public float updateAmount(float deposit) {
			amount = amount + deposit;
			return amount;
		}
	
		@Override
		public void setName(String name) {
			this.name = name;
		}
	
	}

	
	