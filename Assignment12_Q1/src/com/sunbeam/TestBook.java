package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		List<Book> bk= new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		
		bk.add(new Book("101",450,"Sachin",10));
		bk.add(new Book("105",335,"Ruskin",30));
		bk.add(new Book("102",149,"Tim Murari",15));
		bk.add(new Book("104",970,"R.R. Martin",27));
		bk.add(new Book("103",999,"J.K. Rowling",01));
		
		
		Book b,newBk;
		Menu choice;
		Menu[] arr= Menu.values();
		while(true)
		{
			for(Menu m: arr)
				System.out.println(m.ordinal() + ". "+m.name());
			System.out.print("Enter your choice: ");
			choice =arr[sc.nextInt()];
			
			switch (choice) {
			case EXIT:
				System.out.println("Thank you!!!");
				System.exit(0);
				break;
			
			case ADD_BOOK:
				newBk = new Book();
				
				newBk.accept();
				if(bk.contains(newBk))
				{
					Iterator<Book> itr = bk.iterator();
					while(itr.hasNext())
					{
						b= itr.next();
						b.setQuantity(b.getQuantity()+newBk.getQuantity());
					}
				}
				else
				{
					bk.add(newBk);
				}
				break;
				
			case DISPLAY_ALL:
				for(int i = 0; i<bk.size();i++)
				{
					b = bk.get(i);
					System.out.println(b.toString());
				}
				break;
				
			case SEARCH_ISBN:
				System.out.println("Enter the ISBN it search ");
				String isbnNo= sc.next();
				newBk = new Book();
				newBk.setIsbn(isbnNo);
				int index = bk.indexOf(newBk);
				if(index==-1)
					System.out.println("Book not found !!!");
				else
				{
					b= bk.get(index);
					System.out.println(b.toString());
				}
				break;
			case DELETE_BY_INDEX:
				System.out.print("Enter the index of book to delete : ");
				int indx = sc.nextInt();
				if(indx<bk.size() && indx>=0)
					bk.remove(indx);
				else
					System.out.println("Index not available !!");
				break;
			case DELETE_BY_NAME:
				System.out.print("Enter the author Name to delete book : ");
				String aName= sc.next();
				
				for(Book ele:bk)
					if(ele.getAuthorName().compareToIgnoreCase(aName)==0)
					{
						bk.remove(bk.indexOf(ele));
						System.out.println("Book Deleted");
						break;
					}

				break;
				
			case SORT_ASC:
				Collections.sort(bk);
				for(Book ele : bk)
					System.out.println(ele.toString());
				break;
				
			case SORT_DESC:
				Collections.sort(bk, new SortPriceDescComparator());
				for(Book ele : bk)
					System.out.println(ele.toString());
				
				break;
			case SORT_REVERSE:
				Collections.reverse(bk);
				for(Book ele : bk)
					System.out.println(ele.toString());
				break;

			default:
				System.out.println("Enter valid choice !!!");
				break;
			}
			
			
		}
		
		
	}

}
