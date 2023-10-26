package com.sunbeam;

import java.util.Scanner;

public class Circle extends BoundedShape {

	private double radius;
	
	
	public Circle( double radius) {
		
		this.radius = radius;
	}
	
	public Circle() {
		
		this.radius = 0;
	}
	

	@Override
	public double calcArea() {
		
		return (3.14 * radius * radius);
		
	}


	@Override
	public void acceptDimensions() {
		System.out.print("Enter Radius of the circle : ");
		radius = new Scanner(System.in).nextDouble();
		
	}

}
