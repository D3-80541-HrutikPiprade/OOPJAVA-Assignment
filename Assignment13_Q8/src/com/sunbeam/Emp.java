package com.sunbeam;

public interface Emp {
	double getSal();
	
	default double calcIncentives() {
		return 0.0;
	}
	
	static double calcTotalIncome(Emp arr[]) {
		double totalIncome=0;
		for(Emp ele : arr) {
			totalIncome+= ele.getSal()+ele.calcIncentives();
		}
		return totalIncome;
	}
}
