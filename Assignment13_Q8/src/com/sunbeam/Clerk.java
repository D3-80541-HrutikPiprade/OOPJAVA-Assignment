package com.sunbeam;

public class Clerk implements Emp {
	private double salary;
	
	
	
	public Clerk(double salary) {
		this.salary = salary;
	}
	public Clerk() {
		this.salary = 0;
	}
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Clerk [salary=").append(salary).append("]");
		return builder.toString();
	}
	@Override
	public double getSal() {
		return salary;
	}

}
