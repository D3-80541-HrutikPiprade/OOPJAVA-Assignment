package com.sunbeam;

import java.util.Scanner;

public class Toy {
	private String title;
	private double price;
	private String ageGroup;
	
	public Toy(String title, double price, String ageGroup) {
		this.title = title;
		this.price = price;
		this.ageGroup = ageGroup;
	}
	
	public Toy() {
		this.title = "";
		this.price = 0;
		this.ageGroup = "";
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter toy Title : ");
		title=sc.next();
		System.out.print("Enter Price : ");
		price = sc.nextDouble();
		System.out.print("Enter Age group : ");
		ageGroup= sc.next();

	}
	
	public void displayData() {
		System.out.println("Toy Title : "+title);
		System.out.println("Price : "+price);
		System.out.println("Age Group : "+ageGroup);
	}
	
	public double getPrice() {
		return price;
	}
	
}
