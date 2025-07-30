package com.tnsif.constructor;

public class Customer {
    
	private String customerName;
	private String customerCity;
	private int customerId;
	
	public Customer(){
		this.customerName="Alexa";
		this.customerCity="World";
		this.customerId=1;
	}
	
	public Customer(String customerName,String customerCity,int customerId) {
		this.customerName=customerName;
		this.customerCity=customerCity;
		this.customerId=customerId;
	}
	
	public String toString() {
		return "Customer["+customerName + " "+customerCity+" "+customerId+"]";
	}
	
}
