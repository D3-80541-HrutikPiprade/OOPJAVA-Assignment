package com.sunbeam;

public class EmployeeException extends RuntimeException {

	private String invalidValue;

	public EmployeeException(String invalidValue) {
		super("Invalid Value !!");
		this.invalidValue=invalidValue;
	}

	public String getInvalidValue() {
		return invalidValue;
	}

	public void setInvalidValue(String invalidValue) {
		this.invalidValue = invalidValue;
	}
	
	
	
	
	
}
