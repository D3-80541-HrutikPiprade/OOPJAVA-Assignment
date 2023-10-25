package com.sunbeam;

public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, int ssn, double weeklySalary) {
		super(firstName, lastName, ssn);
		this.weeklySalary = weeklySalary;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	@Override
	public void TotalAmt() {
		System.out.println("Total Amount = " + weeklySalary);
		
	}
	
	
	
}
