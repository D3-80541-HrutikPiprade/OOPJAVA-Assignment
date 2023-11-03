package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class TestBook {

	public static void main(String[] args) {
		
		Set<Book> lib= new TreeSet<Book>();
				
		lib.add(new Book("101",450,"Sachin",10));
		lib.add(new Book("104",970,"R.R. Martin",27));
		lib.add(new Book("103",999,"J.K. Rowling",01));
		lib.add(new Book("105",335,"Ruskin",30));
		lib.add(new Book("102",149,"Tim Murari",15));
		lib.add(new Book("105",335,"Ruskin",30));
		
		Iterator<Book> itr = lib.iterator();
		for(Book ele : lib)
			System.out.println(ele);	
	}
}

//If any book with duplicate isbn is added, what will happen?
//-> the TreeSet  check for duplicates on the basis of Comparable(compareTo).
//		so, it does not allows duplicates.

//Books are stored in which order?
//-> the Books are stored in the sorted order in the TreeSet.

