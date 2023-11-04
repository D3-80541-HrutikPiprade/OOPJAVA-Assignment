package com.sunbeam;

import java.util.Comparator;
import java.util.function.Predicate;

public class TestProgram {
	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for(String str: arr) {
		if(cond.test(str))
		count++;
		}
		return count;
		}
	
	public static void main(String[] args) {
		String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant" };
		// call countIf() to count number of strings have length more than 6 -- using anonymous inner class
		
		int cnt = countIf(arr, new Predicate<String>() {
		public boolean test(String s) {
		return s.length() > 6;
		}
		});
		
		new Predicate<String>() {
			@Override
			public boolean test(String s) {
				if(s.length()>6)
					return true;
				return false;
			}
		};

		System.out.println("Result: " + cnt); // 2
		// call countIf() to count number of strings have length more than 6 -- using lambdna expressions
		
		int n =countIf(arr, s -> s.length()>6 ) ;
		
		System.out.println("Result by lambda exp :"+ n);
		
		}
}
