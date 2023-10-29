package com.sunbeam;

import java.util.Scanner;

public class TestShop {

	public static void main(String[] args) {
		Shop[] s = new Shop[5];
		
		for(int i=0 ;  i< 5; i++) {
			s[i]= new Shop();
		}
		
		int choice;
		int count =0;
		double discount=0;
		
		while(true)
		{
			choice = Shops.menu();
			switch (choice) {
			case 0 :
				System.out.println("Thank you !!!");
				System.exit(0);
				break;
				
			case 1 :
				if(count<5) {
					Book b = new Book();
					b.acceptData();
					s[count++].addBook(b);
				}
				else {
					System.out.println("You have purchased to maximum limit(5) !!!");
				}
				break;
			case 2 :
				if(count<5) {
					MusicAlbum m = new MusicAlbum();
					m.acceptData();
					s[count++].addMusic(m);
				}
				else {
					System.out.println("You have purchased to maximum limit(5) !!!");
				}
				break;
				
			case 3 :
				if(count<5) {
					Toy t = new Toy();
					t.acceptData();
					s[count++].addToy(t);
				}
				else {
					System.out.println("You have purchased to maximum limit(5) !!!");
				}
				break;
				
			case 4 :
				Shops.displayItems(s);
				break;
				
			case 5 :
				System.out.println("Discount Percentage: ");
				discount = new Scanner(System.in).nextDouble();
				System.out.println("Total bill : "+ String.format("%.2f",Shops.totalBill(s,discount)));
				break;
				
			case 6 :
				System.out.println("Total revenue : "+ String.format("%.2f",Shops.totalrevenue(s,discount)));
				break;

			default:
				System.out.println("Enter valid choice !!");	
				break;
			}
		}

	}

}
