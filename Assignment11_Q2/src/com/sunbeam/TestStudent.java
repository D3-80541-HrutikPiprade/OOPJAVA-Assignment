package com.sunbeam;

import java.util.Arrays;

public class TestStudent {

	public static void main(String[] args) {
		Student[] arr= {
				new Student(1,"Piprade","Maregaon",98.1),
				new Student(3,"Hrutik","pune",70),
				new Student(5,"Abcd","Mumbai",59),
				new Student(2,"HrutikPiprade","Goa",68),
				new Student(4,"Hrutik","Maregaon",98.1),
				new Student(9,"Zebra","Forest",67)
		};
		
		System.out.println("Before Sort : ");
		for(Student s:arr)
			System.out.println(s.toString());
		
		Arrays.sort(arr,new ArrayComparator());
		System.out.println("After Sort : ");
		for(Student s:arr)
			System.out.println(s.toString());
	}

}
