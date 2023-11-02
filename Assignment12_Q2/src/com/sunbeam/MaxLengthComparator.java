package com.sunbeam;

import java.util.Comparator;

public class MaxLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int diff = Integer.compare(s1.length(),s2.length());
		return diff ;
	}

}
