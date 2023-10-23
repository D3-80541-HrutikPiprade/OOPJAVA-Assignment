package com.sunbeam;

import java.util.Scanner;

public class InvoiceTest {
	public static int menu()
	{
		int choice;
		System.out.println("  1. Add Part");
		System.out.println("  2. Generate Invoice ");
		System.out.println("Enter your choice : ");
		choice=new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Invoice i = new Invoice();
		Scanner sc= new Scanner(System.in);
		double amount=0;
		while(true)
		{
			
			switch (menu()) {
			case 1:
				System.out.println("Enter the Quantity : ");
				i.setPartQty(sc.nextInt());
				System.out.println("Enter the Price : ");
				i.setPartPrice(sc.nextDouble());
				
				amount += i.calculateInvoice();
				break;
				
			case 2:
				System.out.println("-----------------------------");
				System.out.println("Total Amount : "+ amount);
				System.out.println("-----------------------------");
				System.exit(0);
				break;

			default:
				System.out.println("Enter the valid input!!");
				break;
			}
		}
		
	}

}
