package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee {

	private double target;
	private double commission;
	
	
	public Salesman(String name, int age, int id, double salary, double target, double commission) {
		super(name, age, id, salary);
		this.target = target;
		this.commission = commission;
	}
	
	public Salesman() {
		
		this.target = 0;
		this.commission = 0;
	}

	

	public double getTarget() {
		return target;
	}

	public void setTarget(double target) {
		if(target<=0)
			throw new EmployeeException("Target");
		this.target = target;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		if(commission<=0)
			throw new EmployeeException("Commission");
		this.commission = commission;
	}

	@Override
	public void acceptData() {
		System.out.println("Enter Salesman details - ");
		Scanner sc= new Scanner(System.in);
		super.acceptData();
		System.out.print("Enter target : ");
		this.setTarget(sc.nextDouble());
		System.out.println("Enter Commission : ");
		this.setCommission(sc.nextDouble());
	}

	public String toString() {
		return super.toString()+String.format("Target: %f, commission: %f\n", this.target, this.commission);
		}

	@Override
	public double calcSalary() {
		return (super.getSalary() + commission);
	}

}
