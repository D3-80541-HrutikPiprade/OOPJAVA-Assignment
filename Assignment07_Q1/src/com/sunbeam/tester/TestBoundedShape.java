package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.BoundedShape;
import com.sunbeam.Circle;
import com.sunbeam.Rectangle;
import com.sunbeam.Square;
import com.sunbeam.Triangle;

public class TestBoundedShape {

	public static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println("0. EXIT");
		System.out.println("1. Find the area of Circle.");
		System.out.println("2. Find the area of Triangle.");
		System.out.println("3. Find the area of Square.");
		System.out.println("4. Find the area of Rectangle.");
		System.out.print("Enter your choice : ");
		choice= sc.nextInt();
		System.out.println("------------------------------------");
		return choice;
	}
	public static void main(String[] args) {
		
		BoundedShape[] shape = new BoundedShape[4];
		shape[0] = new Circle();
		shape[1] = new Triangle();
		shape[2] = new Square();
		shape[3] = new Rectangle();
		int choice;
		while (true) {
			choice = menu();
			
			switch (choice) {
			case 0:
				System.out.println("Thank you!!!");
				System.exit(0);
				break;
				
			case 1:
				shape[0].acceptDimensions();
				System.out.println("The area of the Circle = " + shape[0].calcArea());
				break;
				
			case 2:
				shape[1].acceptDimensions();
				System.out.println("The area of the Triangle = " + shape[1].calcArea());
				break;
	
			case 3:
				shape[2].acceptDimensions();
				System.out.println("The area of the Square = " + shape[2].calcArea());
				break;
	
			case 4:
				shape[3].acceptDimensions();
				System.out.println("The area of the Rectangle = " + shape[3].calcArea());
				break;

			default:
				System.out.println("Enter Valid Input !!!");
				break;
			}
			
		}
		
	}

}
