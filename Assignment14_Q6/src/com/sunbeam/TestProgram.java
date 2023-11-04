package com.sunbeam;


public class TestProgram {
	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count=0;
		for(T ele:arr)
		{
			if(c.compare(ele, key))
			{
				count++;
			}	
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Count = " + cnt); // 4
		
		
		Double [] arr1 = {1.1, 0.6, 7.7, 3.2, 9.8, 7.7, 1.1, 7.7};
		Double key1 = 7.7;
		int c = countIf(arr1, key1, (a,b)->  Double.compare(a, b)==0 );
		System.out.println("Count = " + c);
	}

}
