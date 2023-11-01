package com.sunbeam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		List<Book> b = new ArrayList<Book>();
		Scanner sc= new Scanner(System.in);
		b.add(new Book("101",450,"Sachin",10));
		b.add(new Book("105",335,"Ruskin",30));
		b.add(new Book("102",149,"Tim Murari",15));
		b.add(new Book("104",970,"R.R. Martin",27));
		b.add(new Book("103",999,"J.K. Rowling",01));
		
		Menu[] arr = Menu.values();
		Menu choice;
		Book ele = null;
		do {
			for(Menu m : arr)
				System.out.println(m.ordinal() + ". " + m.name());
			System.out.println("Enter your Choice: ");
			choice=arr[sc.nextInt()];
			
			switch (choice) {
				case EXIT:
					System.out.println("Thank you !!!");
					System.exit(0);
					break;
				case ADD_BOOK:
					Book b1= new Book();
					b1.accept();
					b.add(b1);
					break;
				case DISPLAY_ALL:
					Collections.sort(b);
					Iterator<Book> itr = b.iterator();
					while(itr.hasNext()) {
					  ele = itr.next();
					  System.out.println(ele.toString());
					}
					break;
				case DELETE_BY_ID:
					Iterator<Book> ittr = b.iterator();
					ele=new Book();
					Book book = null;
					ele.setIsbn(sc.next());
					while(ittr.hasNext()) {
					   book = ittr.next();
					  if(b.contains(book))
						 break;
					}
					 b.remove(book);
					break;
				case SEARCH_ISBN:
					System.out.print("Enter ISBN : ");;
					ele= new Book();
					ele.setIsbn(sc.next());
					if(b.contains(ele))
						System.out.println("Book found !!!");
					else
						System.out.println("Book not found !!!");
						break;
				case DISPLAY_NOS:
					int count=0;
					Iterator<Book> itrr = b.iterator();
					while(itrr.hasNext()) {
					  ele = itrr.next();
					  count++;
					}
					System.out.println("Total Books : "+ count);
					break;
				case DELETE_ALL:
					b.clear();
					System.out.println("All books deleted !!!");
					break;
		
				default:
					System.out.println("Enter Valid Input !!!");
					break;
			}
		} while (true);
		
	}

}
