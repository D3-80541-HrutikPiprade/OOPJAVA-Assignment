package com.sunbeam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestBook {
	public static int menu()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("0. Exit");
		System.out.println("1. Add Book");
		System.out.println("2. Find in map");
		System.out.println("Enter your choice : ");
		int choice= sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		
		Map<String,Book> map = new HashMap<>();
		int choice;
		Scanner sc = new Scanner(System.in);
		map.put("101", new Book("101",450,"Sachin",10));
		map.put("104", new Book("104",970,"R.R. Martin",27));
		
		while(true)
		{	choice = menu();
			switch (choice) {
			case 0:
				System.out.println("Thank you!!!");
				System.exit(0);
				break;
				
			case 1:
				Book b = new Book();
				b.accept();
				map.put(b.getIsbn(), b);
				break;
	
			case 2:
				System.out.println("Enter isbn to find : ");
				String isbn = sc.next();
				Book f = map.get(isbn);
				System.out.println(f.toString());
				break;	
				
			default:
				System.out.println("Enter the valid choice...!!!");
				break;
			}
		}

	}
}

// Do we need to write equals() and hashCode() in Book class?
//-> No, only key has required equals() and hashCode() method; the String isbn already has equals() and hashCode()
// 	so, we do not need to write the equals and hasCode method for key and value.
