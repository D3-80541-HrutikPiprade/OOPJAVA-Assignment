package com.sunbeam.test;

import java.util.Scanner;

import com.sunbeam.*;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int size=0;
		System.out.print("Enter the Number of employees : ");
		
		try
		{
			size = sc.nextInt();
			if(size<=0)
				throw new EmployeeException("Size");
			Employee[] arr = new Employee[size];
			while(true) {
				int choice = Employees.menu();
				
				switch (choice) {
				case 0:
					System.out.println("Thank you !!! ");
					System.exit(0);
					break;
					
				case 1:
					if(count<size)
					{
						arr[count]= new Clerk();
						arr[count].acceptData();
						count++;
					}
					else
					{
						System.out.println("You aleady added "+size+" employees !!");
					}
					break;
					
				case 2:
					if(count<size)
					{
						arr[count]= new Labor();
						arr[count].acceptData();
						count++;
					}
					else
					{
						System.out.println("You aleady added "+size+" employees !!");
					}
					break;
					
				case 3:
					if(count<size)
					{
						arr[count]= new Salesman();
						arr[count].acceptData();
						count++;
					}
					else
					{
						System.out.println("You aleady added "+size+" employees !!");
					}
					break;
					
				case 4:
					System.out.println("The Average salary of Clerk is "+ Employees.averageSalClerks(arr));
					break;
					
				case 5:
					System.out.println("The Average salary of Clerk is "+ Employees.averageSalLabor(arr));
					break;
					
				case 6:
					System.out.println("The Average salary of Clerk is "+ Employees.averageSalSalesmans(arr));
					break;
					
				case 7:
					for(Employee e:arr)
					{
						if(e!=null)
						{
							e.displayData();
							System.out.println("-------------------------------------");
						}
					}
					break;
					
				default:
					System.out.println("Enter Valid Choice !!!");
					break;
				}
			}
			

		}
		catch (EmployeeException e) {
			System.out.println();
			System.out.println(e.getMessage());
			System.out.println("You have entered invalid-"+e.getInvalidValue());
			e.printStackTrace();
			
		}

	}

}
