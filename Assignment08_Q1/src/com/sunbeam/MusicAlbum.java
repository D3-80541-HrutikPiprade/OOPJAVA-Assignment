package com.sunbeam;

import java.util.Scanner;

public class MusicAlbum {
	private String title;
	private double price;
	private String singer;
	private String musician;
	
	public MusicAlbum(String title, double price, String singer, String musician) {	
		this.title = title;
		this.price = price;
		this.singer = singer;
		this.musician = musician;
	}
	
	public MusicAlbum() {
		
		this.title = "";
		this.price = 0;
		this.singer = "";
		this.musician = "";
	}
	
	public void acceptData() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Album Title : ");
		title= sc.next();
		System.out.print("Enter Price : ");
		price= sc.nextDouble();
		System.out.print("Enter Singer : ");
		singer= sc.next();
		System.out.print("Enter Musician : ");
		musician= sc.next();
	}
	
	public void displayData() {
		System.out.println("Album Title : "+title);
		System.out.println("Price : "+price);
		System.out.println("Singer : "+singer);
		System.out.println("Musician : "+musician);
		
	}
	

	public double getPrice() {
		
		return price;
	}
	
	
}
