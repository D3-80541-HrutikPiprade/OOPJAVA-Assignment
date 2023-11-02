package com.sunbeam;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		List<Employee> emp= new LinkedList<Employee>();
		Scanner sc = new Scanner(System.in);
		Menu choice;
		Menu[] arr= Menu.values();
		Employee temp;
		
		while (true) {
			
			for(Menu m : arr)
				System.out.println(m.ordinal() + ". "+ m.name());
			System.out.println("Enter your choice : ");
			choice=arr[sc.nextInt()];
			
			switch (choice) {
			case EXIT:
				System.out.println("Thank you!!!");
				System.exit(0);
				break;
			
			case ADD_EMPLOYEE:
				temp = new Employee();
				temp.accept();
				emp.add(temp);
				break;
				
			case DELETE_EMPLOYEE:
				System.out.print("Enter the ID to delete : ");
				int delId= sc.nextInt();
				temp= new Employee();
				temp.setId(delId);
				emp.remove(temp);
				break;
			
			case FIND_EMPLOYEE:
				System.out.println("Enter the Id to find :");
				int findId = sc.nextInt();
				temp= new Employee();
				temp.setId(findId);
				int index = emp.indexOf(temp);
				if(index==-1)
					System.out.println("Employee not found !!");
				else
					System.out.println(emp.get(index));

				break;
			case SORT_EMPLOYEE:
				Collections.sort(emp);
				System.out.println("Employees Sorted!!!");
				break;
			case EDIT_EMPLOYEE:
				System.out.println("Enter emp id to be modified : ");
				int editId= sc.nextInt();
				Employee key = new Employee();
				key.setId(editId);
				int indx = emp.indexOf(key);
				if(indx==-1)
					System.out.println("Employee not found !!!");
				else
				{
					Employee oldEmp = emp.get(indx);
					System.out.println("Employee Found : "+ oldEmp);
					System.out.println("Enter new information for the Employee");
					Employee newEmp= new Employee();
					newEmp.accept();
					emp.set(indx,newEmp);
				}
				break;
				
			case DISPLAY:
				for(Employee e : emp)
					System.out.println(e.toString());
				break;

			default:
				System.out.println("Enter valid choice !!!");
				break;
			}
		}

	}

}
