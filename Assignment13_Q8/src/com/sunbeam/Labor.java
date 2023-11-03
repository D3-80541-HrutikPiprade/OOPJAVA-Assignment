package com.sunbeam;

public class Labor implements Emp {
	private double hours;
	private double rate;
	
	
	public Labor(double hours, double rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public double getSal() {
		return hours* rate;
	}

	@Override
	public double calcIncentives() {
		if(hours>300)
			return 0.05*this.getSal();
		else
			return 0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Labor [hours=").append(hours).append(", rate=").append(rate).append("]");
		return builder.toString();
	}
	
	
}
