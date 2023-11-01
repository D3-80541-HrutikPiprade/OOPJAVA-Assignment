package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparator {
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
		
				}
			}
		}
	}
	public static void main(String[] args) {
		Double[] arr = {3.3,1.1,9.9,5.7,3.4,5.1};
		System.out.println("Before Sort : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("After Sort : ");
		selectionSort(arr, new SortArrayComparator());
		System.out.println(Arrays.toString(arr));
	}

}
