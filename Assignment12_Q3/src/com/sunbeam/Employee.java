package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee() {
		this.id = 0;
		this.name = "";
		this.salary = 0;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id : ");
		id = sc.nextInt();
		System.out.print("Enter name : ");
		name = sc.next();
		System.out.print("Enter Salary : ");
		salary = sc.nextDouble();
		}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id).append(", name=").append(name).append(", salary=").append(salary)
				.append("]");
		return builder.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

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

	@Override
	public int compareTo(Employee other) {
		int diff = this.id - other.id;
		return diff;
	}
	
	
}
