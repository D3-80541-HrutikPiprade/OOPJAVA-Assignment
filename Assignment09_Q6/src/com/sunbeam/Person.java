package com.sunbeam;

import java.util.Scanner;

enum Gender{
	MALE,FEMALE
}
public class Person {
	private String name;
	private int age;
	private Gender g;
	
	public Person(String name, int age, Gender g) {
		super();
		this.name = name;
		this.age = age;
		this.g = g;
	}
	
	public Person() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getG() {
		return g;
	}

	public void setG(Gender g) {
		this.g = g;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name= sc.next();
		System.out.print("Enter Age: ");
		age = sc.nextInt();
		System.out.println("Enter Gender: ");
		Gender[] arr= Gender.values();
		for(Gender i: arr)
			System.out.print(i.ordinal()+". "+i.name()+ " ");
		System.out.println();
		g=arr[sc.nextInt()];

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + g + "]";
	}
	
	
	
	
	
	
}
