package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestBook {

	public static void main(String[] args) {
		
		TreeSet<Book> lib= new TreeSet<Book>(new SortDescPriceComparator());
				
		lib.add(new Book("101",450,"Sachin",10));
		lib.add(new Book("104",970,"R.R. Martin",27));
		lib.add(new Book("103",999,"J.K. Rowling",01));
		lib.add(new Book("105",335,"Ruskin",30));
		lib.add(new Book("102",149,"Tim Murari",15));
		lib.add(new Book("105",335,"Ruskin",30));
		
		for(Book ele : lib)
			System.out.println(ele);
		
		System.out.println("By desceding  iterator : ");
		Iterator<Book> itr2 = lib.descendingIterator();
		while(itr2.hasNext())
		{
		  Book b = itr2.next();
		  System.out.println(b);
		}
	}
}



