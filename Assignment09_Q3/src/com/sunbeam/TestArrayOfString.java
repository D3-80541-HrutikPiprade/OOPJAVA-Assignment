package com.sunbeam;

public class TestArrayOfString {

	public static void main(String[] args) {
		String[] arr = {"Apple","Fruit","Banana","Mango","Abcd"};
		for(String s : arr)
		{
			if(s.endsWith("a") || s.endsWith("e" ) || s.endsWith("i") || s.endsWith("o") || s.endsWith("u") ||
					s.endsWith("A") || s.endsWith("E" ) || s.endsWith("I") || s.endsWith("O") || s.endsWith("U"))
			{
				System.out.println(s);
				
			}
		}

	}

}
