package com.sunbeam;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		System.out.println("Enter employee-1 firstname, lastname and Salary : ");
		e1.setFirstName(sc.next());
		e1.setLastName(sc.next());
		e1.setSalary(sc.nextDouble());
		
		System.out.println("Enter employee-2 firstname, lastname and Salary : ");
		e2.setFirstName(sc.next());
		e2.setLastName(sc.next());
		e2.setSalary(sc.nextDouble());
		
		e1.displayEmployee();
		e2.displayEmployee();
		
		e1.salaryRaise();
		e2.salaryRaise();
		
		e1.displayEmployee();
		e2.displayEmployee();
		
	}

}
