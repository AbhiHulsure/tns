package com.tnsif.inheritance;

public class Citizen {
      private String name;
      private String address;
      private long aadharNumber;
      private long phNo;
      
      public Citizen() {
    	  
      }

	  public Citizen(String name, String address, long aadharNumber, long phNo) {
		super();
		this.name = name;
		this.address = address;
		this.aadharNumber = aadharNumber;
		this.phNo = phNo;
	  }

	  
	  public String getName() {
		return name;
	}

	  public void setName(String name) {
		  this.name = name;
	  }

	  public String getAddress() {
		  return address;
	  }

	  public void setAddress(String address) {
		  this.address = address;
	  }

	  public long getAadharNumber() {
		  return aadharNumber;
	  }

	  public void setAadharNumber(long aadharNumber) {
		  this.aadharNumber = aadharNumber;
	  }

	  public long getPhNo() {
		  return phNo;
	  }

	  public void setPhNo(long phNo) {
		  this.phNo = phNo;
	  }

	  @Override
	  public String toString() {
		return "Citizen [name=" + name + ", address=" + address + ", aadharNumber=" + aadharNumber + ", phNo=" + phNo
				+ "]";
	  }
      
      
}
