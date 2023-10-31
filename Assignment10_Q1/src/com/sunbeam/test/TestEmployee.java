package com.sunbeam.test;

import java.util.Scanner;

import com.sunbeam.*;

public class TestEmployee {

	
	public static void main(String[] args) {
		
		
		Box<Employee>[] emp = new Box[3];
		
		emp[0]= new Box<>();
		emp[0].setObj(new Clerk());
		emp[0].accept();
		
		emp[1]= new Box<>();
		emp[1].setObj(new Labor());
		emp[1].accept();
		
		emp[2]= new Box<>();
		emp[2].setObj(new Salesman());
		emp[2].accept();
		
		System.out.println("Total Sal Clerk : " + emp[0].totalSal());
		System.out.println("Total Sal Labor : " + emp[1].totalSal());
		System.out.println("Total Sal Salesman : " + emp[2].totalSal());
		
	}
	
}
