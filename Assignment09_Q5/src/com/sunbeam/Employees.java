package com.sunbeam;

import java.util.Scanner;

public class Employees {

	public static double averageSalLabor(Employee[] arr) {
		double sumSal =0;
		int count=0;
		for(Employee e:arr)
		{
			if(e instanceof Labor) {
				sumSal = sumSal + e.calcSalary();
				count++;
			}
		}
		if(count==0)
			return 0;
		return (sumSal/count);
	}
	
	public static double averageSalSalesmans(Employee[] arr) {
		double sumSal =0;
		int count=0;
		for(Employee e:arr) {
			if(e instanceof Salesman) {
				sumSal = sumSal + e.calcSalary();
				count++;
			}
		}
		if(count==0)
			return 0;
		return (sumSal/count);
	}
	
	public static double averageSalClerks(Employee[] arr) {
		double sumSal =0;
		int count=0;
		for(Employee e:arr) {
			if(e instanceof Clerk) {
				sumSal = sumSal + e.calcSalary();
				count++;
			}
		}
		if(count==0)
			return 0;
		return (sumSal/count);
	}
	
	public static int menu() {
		int choice;
		System.out.println("-----------------------------------");
		System.out.println("  0. Exit");
		System.out.println("  1. Add Clerk.");
		System.out.println("  2. Add Labor.");
		System.out.println("  3. Add Salesman.");
		System.out.println("  4. Average Clerk Salary");
		System.out.println("  5. Average Labor Salary.");
		System.out.println("  6. Average Salesman Salary.");
		System.out.println("  7. Display all Employees.");
		System.out.print("Enter your Choice : ");
		choice = new Scanner(System.in).nextInt();
		System.out.println("-----------------------------------");
		return choice;
	}
	
	
	
}
