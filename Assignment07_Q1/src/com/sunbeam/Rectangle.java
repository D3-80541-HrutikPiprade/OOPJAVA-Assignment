package com.sunbeam;

import java.util.Scanner;

public class Rectangle extends Polygon {
	


	private double length;
	private double breadth;
	
	public Rectangle() {
		super(4);
	}
	
	@Override
	public double calcArea() {
		
		return length*breadth;
	}

	@Override
	public void acceptDimensions() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the Rectangle : ");
		length = sc.nextDouble();
		System.out.print("Enter the breadth of the Rectangle : ");
		breadth  = sc.nextDouble();
		

	}

}
