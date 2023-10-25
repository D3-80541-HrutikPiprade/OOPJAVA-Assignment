package com.sunbeam;

public abstract class Employee {

	private String firstName;
	private String lastName;
	private int ssn;
	public Employee(String firstName, String lastName, int ssn) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	public abstract void TotalAmt();
	
	
}
