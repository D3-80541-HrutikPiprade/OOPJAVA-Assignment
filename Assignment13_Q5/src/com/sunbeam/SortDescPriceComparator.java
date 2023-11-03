package com.sunbeam;

import java.util.Comparator;

public class SortDescPriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		
		return -Double.compare(b1.getPrice(),b2.getPrice());
	}

}
