package com.sunbeam;

import java.util.Scanner;

public class Labor extends Employee {
	private double rate;
	private	double hours;
	
	
	public Labor(String name, int age, int id, double salary, double rate, double hours) {
		super(name, age, id, salary);
		this.rate = rate;
		this.hours = hours;
	}

	public Labor() {
		
		this.rate = 0;
		this.hours = 0;
	}
	
	
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		if(rate<=0)
			throw new EmployeeException("Rate");
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if(hours>10 || hours<=0)
			throw new EmployeeException("Hours");
		this.hours = hours;
	}
	
	@Override
	public void acceptData() {
		System.out.println("Enter Labor details - ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id : ");
		super.setId(sc.nextInt());
		System.out.print("Enter Name : ");
		super.setName(sc.next());
		System.out.print("Enter Age : ");
		super.setAge(sc.nextInt());
		System.out.print("Enter rates : ");
		this.setRate(sc.nextDouble());
		System.out.print("Enter hours : ");
		this.setHours(sc.nextDouble());
		super.setSalary(this.calcSalary());
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Rate : "+rate);
		System.out.println("Hours : "+hours);
	}
	
	@Override
	public double calcSalary() {
		return rate*hours;
	}

}
