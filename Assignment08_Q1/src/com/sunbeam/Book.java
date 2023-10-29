package com.sunbeam;

import java.util.Scanner;

public class Book {
	private int isbn;
	private String title;
	private double price;
	private String author;
	private String subject;
	
	public Book(int isbn, String title, double price, String author, String subject) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.author = author;
		this.subject = subject;
	}
	
	public Book() {
		this.isbn = 0;
		this.title = "";
		this.price = 0;
		this.author = "";
		this.subject = "";
	}
	
	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ISBN : ");
		isbn= sc.nextInt();
		System.out.print("Enter Book Title : ");
		title= sc.next();
		System.out.print("Enter Price : ");
		price= sc.nextDouble();
		System.out.print("Enter author : ");
		author= sc.next();
		System.out.print("Enter Subject : ");
		subject= sc.next();
	}
	
	public void displayData() {
		System.out.println("ISBN : "+ isbn);
		System.out.println("Book Title : "+ title);
		System.out.println("Price : "+ price);
		System.out.println("Author : "+ author);
		System.out.println("Subject : "+ subject);

	}

	public double getPrice() {
		return price;
	}
	
	
	
	
	
	
}
