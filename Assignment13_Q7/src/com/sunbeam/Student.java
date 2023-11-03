package com.sunbeam;

import java.util.Scanner;

public class Student {
	private int rollNo;
	private String name;
	private double marks;
	public Student(int rollNo, String name, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public Student() {
		this.rollNo = 0;
		this.name = "";
		this.marks = 0.0;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll no : ");
		rollNo = sc.nextInt();
		System.out.print("Enter name :");
		name = sc.next();
		System.out.print("Enter Marks : ");
		marks = sc.nextDouble();

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [rollNo=").append(rollNo).append(", name=").append(name).append(", marks=")
				.append(marks).append("]");
		return builder.toString();
	}
	
}
