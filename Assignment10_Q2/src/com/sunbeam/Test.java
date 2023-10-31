package com.sunbeam;

public class Test {
	public static <T extends Number> double  findMin(T[] arr)
	{
		Double  min= arr[0].doubleValue();
		for(T ele : arr)
		{
			if(ele.doubleValue() < min)
			{
				min= ele.doubleValue();
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] {11,44,33,77,2 ,55};
		System.out.println("min : "+ findMin(arr));
		
		Double[] arr1 = new Double[] {10.1,11.2,44.4,77.3,0.1};
		System.out.println("min : "+ findMin(arr1));
	}

}
