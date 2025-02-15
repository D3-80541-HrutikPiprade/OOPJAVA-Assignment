package com.sunbeam;

import java.util.Comparator;

public class ArrayComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		int diff;
		diff = - s1.getCity().compareTo(s2.getCity());
		if(diff==0)
			diff= - Double.compare(s1.getMarks(), s2.getMarks());
		if(diff == 0)
			diff = s1.getName().compareTo(s2.getName());
		return diff;
	}

}
