package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class TestBook {

	public static void main(String[] args) {
		
		Set<Book> lib= new LinkedHashSet<Book>();
				
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
//-> In LinkedHashSet, duplicates are not allowed.
//   As LinkedHashSet is inherited from Hash Set duplicates are not allowed on the basis of equals() and Hashcode().
	

//Books are stored in which order?
//-> the books are stored in the order they are added.

