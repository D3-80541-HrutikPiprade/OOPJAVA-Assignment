package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		this.name = "";
		this.age = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name=="")
			throw new EmployeeException("Name");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<18 || age>60)
			throw new EmployeeException("Age");
		this.age = age;
	}

	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : ");
		this.setName(sc.next());
		System.out.print("Enter Age : ");
		this.setAge(sc.nextInt());
	}

	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ").append(name).append(", ");
		sb.append("Age: ").append(age).append(" ");
		return sb.toString();
	}
	
	
}
