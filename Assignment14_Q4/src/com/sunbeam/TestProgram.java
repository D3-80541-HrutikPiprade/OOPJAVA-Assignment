package com.sunbeam;

import java.util.Scanner;

public class TestProgram {
	
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EMenu[] arr = EMenu.values();
		EMenu choice;
		double num1=0,num2=0;
		while(true)
		{
			for(EMenu m:arr)
				System.out.println(m.ordinal()+ ". "+ m.name());
			System.out.print("Enter your choice : ");
			choice = arr[sc.nextInt()];
			switch (choice) {
				case EXIT:
					System.out.println("Thank you!!!");
					System.exit(0);
					break;
				
				case ADDITION:
					System.out.println("Enter 1st number :");
					num1 = sc.nextDouble();
					System.out.println("Enter 2nd number :");
					num2 = sc.nextDouble();
					calculate(num1, num2, (n1,n2) -> n1+n2);
					break;
					
				case SUBTRACTION:
					System.out.println("Enter 1st number :");
					num1 = sc.nextDouble();
					System.out.println("Enter 2nd number :");
					num2 = sc.nextDouble();
					calculate(num1, num2, (n1,n2) -> n1-n2);
					
					break;
				
				case MULTIPLICATION:
					System.out.println("Enter 1st number :");
					num1 = sc.nextDouble();
					System.out.println("Enter 2nd number :");
					num2 = sc.nextDouble();
					calculate(num1, num2, (n1,n2) -> n1*n2);
					break;
				
				case DIVISION:
					System.out.println("Enter 1st number :");
					num1 = sc.nextDouble();
					System.out.println("Enter 2nd number :");
					num2 = sc.nextDouble();
					calculate(num1, num2, (n1,n2) -> n1/n2);
					break;
					
				default:
					break;
			}
		}

	}

}
