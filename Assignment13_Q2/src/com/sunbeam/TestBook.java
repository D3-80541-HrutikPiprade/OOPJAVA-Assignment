package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestBook {

	public static void main(String[] args) {
		
		Set<Book> lib= new HashSet<Book>();
				
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
//-> The duplicate book will be added, as the duplication is checked based on both equals() and Hashcode() method
//   not only on one of them.

//Books are stored in which order? 
//->The books are stored in random order.

//Solve duplicate ISBN problem.
//-> the duplicate isbn problem is solved by implementing the hashcode() in the Book class, 
//   as both equals() and hashcode is required for duplication check.
