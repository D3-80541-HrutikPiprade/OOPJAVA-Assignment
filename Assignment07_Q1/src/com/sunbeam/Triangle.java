package com.sunbeam;

import java.util.Scanner;

public class Triangle extends Polygon {

	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		super(3);
	}
	
	
	
	@Override
	public double calcArea() {
		double s = (side1+side2+side3)/2;
		
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}

	@Override
	public void acceptDimensions() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the side1 of Triangle : ");
		side1= sc.nextDouble();
		System.out.print("Enter the side2 of Triangle : ");
		side2= sc.nextDouble();
		System.out.print("Enter the side3 of Triangle : ");
		side3= sc.nextDouble();

	}

}
