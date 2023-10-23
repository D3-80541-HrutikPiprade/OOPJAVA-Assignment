package com.sunbeam;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee() {
		this.firstName = "";
		this.lastName = "";
		this.salary = 0.0;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void salaryRaise()
	{
		salary= salary*1.1;
	}
	
	public void displayEmployee()
	{
		System.out.println("---------------------------");
		System.out.println("First Name : "+firstName);
		System.out.println("Last Name : "+lastName);
		System.out.println("Salary : "+salary);
		System.out.println("---------------------------");
		
	}
}
