package com.sunbeam;

import java.util.Scanner;

public class Square extends Polygon {

	private double side;
	
	public Square() {
		super(4);
	}

	@Override
	public double calcArea() {
		
		return side*side;
	}

	@Override
	public void acceptDimensions() {
		System.out.print("Enter the Side of square : ");
		side = new Scanner(System.in).nextDouble();

	}

}
