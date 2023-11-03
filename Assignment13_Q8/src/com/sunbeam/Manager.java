package com.sunbeam;

public class Manager implements Emp {
	private double basicSalary;
	private double dearanceAllowance;
	
	
	public Manager(double basicSalary, double dearanceAllowance) {
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	public Manager() {
		this.basicSalary = 0;
		this.dearanceAllowance = 0;
	}

	@Override
	public double getSal() {
		
		return basicSalary + dearanceAllowance;
	}
	
	@Override
	public double calcIncentives() {
		return 0.2*basicSalary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manager [basicSalary=").append(basicSalary).append(", dearanceAllowance=")
				.append(dearanceAllowance).append("]");
		return builder.toString();
	}
	
	
}
