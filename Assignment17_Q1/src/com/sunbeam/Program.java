package com.sunbeam;

import java.util.Scanner;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		System.out.println("Enter the number to find factorial: ");
		int n = new Scanner(System.in).nextInt();
		
		int result =Stream.iterate(1, x->x+1)
			.limit(n)
			.reduce(1,(a,e)-> a*e);
		
		System.out.println("Factorial :"+ result );
			

	}

}
