package com.sunbeam;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;
	
	
	public HourlyEmployee(String firstName, String lastName, int ssn, double wage, double hours) {
		super(firstName, lastName, ssn);
		this.wage = wage;
		this.hours = hours;
	}


	@Override
	public void TotalAmt() {
		if(hours<=40)
		{
			System.out.println("Total Amount = "+ hours * wage);
			
		}
		else if (hours>40) {
			System.out.println("Total Amount = "+ (40* wage + (hours-40)* wage*1.5));
			
		}
	
		
	}
	
	
	
}
