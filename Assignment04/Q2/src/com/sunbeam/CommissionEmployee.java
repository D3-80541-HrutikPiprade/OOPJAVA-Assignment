package com.sunbeam;

public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;
	
	
	public CommissionEmployee(String firstName, String lastName, int ssn, double grossSales, double commissionRate) {
		super(firstName, lastName, ssn);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
    
	public double getCommissionRate() {
		return commissionRate;
	}
	public double getGrossSales() {
		return grossSales;
	}

	@Override
	public void TotalAmt() {
		System.out.println("Total Amount : "+ ((commissionRate/100) * grossSales));
		
		
	}
	
	
	
	
}
