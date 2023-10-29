package com.sunbeam;

public class Clerk extends Employee {

	@Override
	public double calcSalary() {
		return super.getSalary();
	}
	@Override
	public void acceptData() {
		System.out.println("Enter Clerk details - ");
		super.acceptData();
	}

}
