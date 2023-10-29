package com.sunbeam;

import java.util.Scanner;

public class Shops {
	public static int menu() {
		int choice;
		System.out.println("-------------------------------------------");
		System.out.println("0. EXIT");
		System.out.println("1. Add Book");
		System.out.println("2. Add MusicAlbum");
		System.out.println("3. Add Toy");
		System.out.println("4. Display all items details.");
		System.out.println("5. Disply total bill(including tax)");
		System.out.println("6. Total revenue of shop");
		System.out.print("Enter your choice : ");
		choice= new Scanner(System.in).nextInt();
		System.out.println("--------------------------------------------");
		return choice;
	}
	
	public static void displayItems(Shop[] s) {
		for(Shop item : s)
		{
			if(item.getBookRef() != null) {
				item.getBookRef().displayData();
				System.out.println("---------------------");
			}
			
			if(item.getMusicRef() != null) {
				item.getMusicRef().displayData();
				System.out.println("---------------------");
			}
			
			if(item.getToyRef() != null) {
				item.getToyRef().displayData();
				System.out.println("---------------------");
			}
		}
	}
	
	public static  double totalBill(Shop[] s, double discount) {
		double amount = 0;
		for(Shop item : s)
		{
			if(item.getBookRef() != null) {
				amount = amount + item.getBookRef().getPrice();
			}
			
			if(item.getMusicRef() != null) {
				amount = amount + item.getMusicRef().getPrice()*1.10;
			}
			
			if(item.getToyRef() != null) {
				amount = amount + item.getToyRef().getPrice()*1.05 ;
			}
		}
		if(discount !=0)
			return amount*((100-discount)/100);
		return amount;
	}
	 
	public static  double totalrevenue(Shop[] s, double discount) {
		double revenue = 0;
		for(Shop item : s)
		{
			if(item.getBookRef() != null) {
				revenue = revenue + item.getBookRef().getPrice();
			}
			
			if(item.getMusicRef() != null) {
				revenue = revenue + item.getMusicRef().getPrice();
			}
			
			if(item.getToyRef() != null) {
				revenue = revenue + item.getToyRef().getPrice();
			}
		}
		if(discount !=0)
			return revenue*((100-discount)/100);
		return revenue;
	}
	
	
}
