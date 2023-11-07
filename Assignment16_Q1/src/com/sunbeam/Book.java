package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book> {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	public Book() {
		
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [isbn=").append(isbn).append(", price=").append(price).append(", authorName=")
				.append(authorName).append(", quantity=").append(quantity).append("]");
		return builder.toString();
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ISBN: ");
		isbn = sc.next();
		System.out.print("Enter Price: ");
		price = sc.nextInt();
		System.out.print("Enter Author Name: ");
		authorName = sc.next();
		System.out.print("Enter Quantity: ");
		 quantity = sc.nextInt();

	}

	@Override
	public int compareTo(Book other) {
		int diff = this.isbn.compareTo(other.isbn);
		return diff;
	}
	
	
	
	
}
