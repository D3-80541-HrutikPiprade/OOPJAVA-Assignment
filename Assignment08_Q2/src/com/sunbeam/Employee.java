package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public abstract class Employee extends Person {
	private int id;
	private double salary;
	
	public Employee(String name, int age, int id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
	}
	
	public Employee() {
		super();
		this.id = 0;
		this.salary = 0.0;
	}
	
	
	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		if(id<=0)
			throw new EmployeeException("ID");
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary<=0)
			throw new EmployeeException("Salary");
		this.salary = salary;
	}

	@Override
	public void acceptData() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter id : ");
		this.setId(sc.nextInt());
		super.acceptData();
		System.out.print("Enter Salary : ");
		this.setSalary(sc.nextDouble());
	}

	@Override
	public void displayData() {
		System.out.println("ID : "+ id);
		super.displayData();
		System.out.println("Salary : "+ salary);
	}

	public abstract double calcSalary();

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}
	
	
}
