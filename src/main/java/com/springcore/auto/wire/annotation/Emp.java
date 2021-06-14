package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	private Address address;
 @Autowired
 
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");

		
	}


	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}
	

	 public void setAddress(Address address) {
		System.out.println("Setting values");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}


}
