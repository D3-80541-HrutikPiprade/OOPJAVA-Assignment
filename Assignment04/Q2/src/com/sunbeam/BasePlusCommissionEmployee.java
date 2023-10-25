package com.sunbeam;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, int ssn, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, ssn, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	
	@Override
	public void TotalAmt() {
		
		System.out.println("Total Amount = "+ ((super.getCommissionRate()/100)* super.getGrossSales() + baseSalary));
	}
	

	
}
